## Process this file with automake to generate Makefile.in

# Copyright (C) 1996, 1997, 1999, 2000 Free Software Foundation, Inc.
#
# This file is part of the GNU MP Library.
#
# The GNU MP Library is free software; you can redistribute it and/or modify
# it under the terms of the GNU Lesser General Public License as published by
# the Free Software Foundation; either version 2.1 of the License, or (at your
# option) any later version.
#
# The GNU MP Library is distributed in the hope that it will be useful, but
# WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
# or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public
# License for more details.
#
# You should have received a copy of the GNU Lesser General Public License
# along with the GNU MP Library; see the file COPYING.LIB.  If not, write to
# the Free Software Foundation, Inc., 59 Temple Place - Suite 330, Boston,
# MA 02111-1307, USA.


AUTOMAKE_OPTIONS = gnu no-dependencies $(top_builddir)/ansi2knr

INCLUDES = -I$(top_srcdir)
LDADD = $(top_builddir)/libgmp.la

check_PROGRAMS = t-mul t-tdiv t-tdiv_ui t-fdiv t-fdiv_ui t-gcd \
  dive t-sqrtrem convert io logic bit t-powm t-powm_ui t-pow_ui t-2exp reuse \
  t-root t-jac t-bin t-misc

TESTS = $(check_PROGRAMS)

# io.tmp is used by io.c, removed automatically if the tests pass
CLEANFILES = io.tmp
