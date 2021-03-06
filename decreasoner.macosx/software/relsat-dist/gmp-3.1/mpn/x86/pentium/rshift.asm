dnl  Intel Pentium mpn_rshift -- mpn right shift.
dnl
dnl          cycles/limb
dnl  P5,P54:    6.0
dnl  P55:       5.375


dnl  Copyright (C) 1992, 1994, 1995, 1996, 1999, 2000 Free Software
dnl  Foundation, Inc.
dnl
dnl  This file is part of the GNU MP Library.
dnl
dnl  The GNU MP Library is free software; you can redistribute it and/or
dnl  modify it under the terms of the GNU Lesser General Public License as
dnl  published by the Free Software Foundation; either version 2.1 of the
dnl  License, or (at your option) any later version.
dnl
dnl  The GNU MP Library is distributed in the hope that it will be useful,
dnl  but WITHOUT ANY WARRANTY; without even the implied warranty of
dnl  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
dnl  Lesser General Public License for more details.
dnl
dnl  You should have received a copy of the GNU Lesser General Public
dnl  License along with the GNU MP Library; see the file COPYING.LIB.  If
dnl  not, write to the Free Software Foundation, Inc., 59 Temple Place -
dnl  Suite 330, Boston, MA 02111-1307, USA.


include(`../config.m4')


C mp_limb_t mpn_rshift (mp_ptr dst, mp_srcptr src, mp_size_t size,
C                       unsigned shift);
C
C The main shift-by-N loop should run at 5.375 c/l and that's what P55 does,
C but P5 and P54 run only at 6.0 c/l, which is 4 cycles lost somewhere.

defframe(PARAM_SHIFT,16)
defframe(PARAM_SIZE, 12)
defframe(PARAM_SRC,  8)
defframe(PARAM_DST,  4)

	.text
	ALIGN(8)
PROLOGUE(mpn_rshift)

	pushl	%edi
	pushl	%esi
	pushl	%ebx
	pushl	%ebp
deflit(`FRAME',16)

	movl	PARAM_DST,%edi
	movl	PARAM_SRC,%esi
	movl	PARAM_SIZE,%ebp
	movl	PARAM_SHIFT,%ecx

C We can use faster code for shift-by-1 under certain conditions. 
	cmp	$1,%ecx
	jne	L(normal)
	leal	4(%edi),%eax
	cmpl	%esi,%eax
	jnc	L(special)		C jump if res_ptr + 1 >= s_ptr
	leal	(%edi,%ebp,4),%eax
	cmpl	%eax,%esi
	jnc	L(special)		C jump if s_ptr >= res_ptr + size

L(normal):
	movl	(%esi),%edx
	addl	$4,%esi
	xorl	%eax,%eax
	shrdl(	%cl, %edx, %eax)	C compute carry limb
	pushl	%eax			C push carry limb onto stack

	decl	%ebp
	pushl	%ebp
	shrl	$3,%ebp
	jz	L(end)

	movl	(%edi),%eax		C fetch destination cache line

	ALIGN(4)
L(oop):	movl	28(%edi),%eax		C fetch destination cache line
	movl	%edx,%ebx

	movl	(%esi),%eax
	movl	4(%esi),%edx
	shrdl(	%cl, %eax, %ebx)
	shrdl(	%cl, %edx, %eax)
	movl	%ebx,(%edi)
	movl	%eax,4(%edi)

	movl	8(%esi),%ebx
	movl	12(%esi),%eax
	shrdl(	%cl, %ebx, %edx)
	shrdl(	%cl, %eax, %ebx)
	movl	%edx,8(%edi)
	movl	%ebx,12(%edi)

	movl	16(%esi),%edx
	movl	20(%esi),%ebx
	shrdl(	%cl, %edx, %eax)
	shrdl(	%cl, %ebx, %edx)
	movl	%eax,16(%edi)
	movl	%edx,20(%edi)

	movl	24(%esi),%eax
	movl	28(%esi),%edx
	shrdl(	%cl, %eax, %ebx)
	shrdl(	%cl, %edx, %eax)
	movl	%ebx,24(%edi)
	movl	%eax,28(%edi)

	addl	$32,%esi
	addl	$32,%edi
	decl	%ebp
	jnz	L(oop)

L(end):	popl	%ebp
	andl	$7,%ebp
	jz	L(end2)
L(oop2):
	movl	(%esi),%eax
	shrdl(	%cl,%eax,%edx)		C compute result limb
	movl	%edx,(%edi)
	movl	%eax,%edx
	addl	$4,%esi
	addl	$4,%edi
	decl	%ebp
	jnz	L(oop2)

L(end2):
	shrl	%cl,%edx		C compute most significant limb
	movl	%edx,(%edi)		C store it

	popl	%eax			C pop carry limb

	popl	%ebp
	popl	%ebx
	popl	%esi
	popl	%edi
	ret


C We loop from least significant end of the arrays, which is only
C permissable if the source and destination don't overlap, since the
C function is documented to work for overlapping source and destination.

L(special):
	leal	-4(%edi,%ebp,4),%edi
	leal	-4(%esi,%ebp,4),%esi

	movl	(%esi),%edx
	subl	$4,%esi

	decl	%ebp
	pushl	%ebp
	shrl	$3,%ebp

	shrl	%edx
	incl	%ebp
	decl	%ebp
	jz	L(Lend)

	movl	(%edi),%eax		C fetch destination cache line

	ALIGN(4)
L(Loop):
	movl	-28(%edi),%eax		C fetch destination cache line
	movl	%edx,%ebx

	movl	(%esi),%eax
	movl	-4(%esi),%edx
	rcrl	%eax
	movl	%ebx,(%edi)
	rcrl	%edx
	movl	%eax,-4(%edi)

	movl	-8(%esi),%ebx
	movl	-12(%esi),%eax
	rcrl	%ebx
	movl	%edx,-8(%edi)
	rcrl	%eax
	movl	%ebx,-12(%edi)

	movl	-16(%esi),%edx
	movl	-20(%esi),%ebx
	rcrl	%edx
	movl	%eax,-16(%edi)
	rcrl	%ebx
	movl	%edx,-20(%edi)

	movl	-24(%esi),%eax
	movl	-28(%esi),%edx
	rcrl	%eax
	movl	%ebx,-24(%edi)
	rcrl	%edx
	movl	%eax,-28(%edi)

	leal	-32(%esi),%esi		C use leal not to clobber carry
	leal	-32(%edi),%edi
	decl	%ebp
	jnz	L(Loop)

L(Lend):
	popl	%ebp
	sbbl	%eax,%eax		C save carry in %eax
	andl	$7,%ebp
	jz	L(Lend2)
	addl	%eax,%eax		C restore carry from eax
L(Loop2):
	movl	%edx,%ebx
	movl	(%esi),%edx
	rcrl	%edx
	movl	%ebx,(%edi)

	leal	-4(%esi),%esi		C use leal not to clobber carry
	leal	-4(%edi),%edi
	decl	%ebp
	jnz	L(Loop2)

	jmp	L(L1)
L(Lend2):
	addl	%eax,%eax		C restore carry from eax
L(L1):	movl	%edx,(%edi)		C store last limb

	movl	$0,%eax
	rcrl	%eax

	popl	%ebp
	popl	%ebx
	popl	%esi
	popl	%edi
	ret

EPILOGUE()
