dnl  Sparc v9 32-bit time stamp counter access routine.

dnl  Copyright (C) 2000 Free Software Foundation, Inc.
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


C void speed_cyclecounter (unsigned p[2]);
C
C Get the sparc v9 tick counter.

ASM_START()
PROLOGUE(speed_cyclecounter)
	rd	%tick,%g1
	st	%g1,[%o0]		C low 32 bits
	srlx	%g1,32,%g4
	retl
	st	%g4,[%o0+4]		C high 32 bits
EPILOGUE(speed_cyclecounter)
