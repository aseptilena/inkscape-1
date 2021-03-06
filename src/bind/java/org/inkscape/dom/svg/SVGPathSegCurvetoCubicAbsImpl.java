/**
 * This is a simple mechanism to bind Inkscape to Java, and thence
 * to all of the nice things that can be layered upon that.
 *
 * Authors:
 *   Bob Jamison
 *
 * Copyright (c) 2007-2008 Inkscape.org
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 3 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 *  Note that these files are implementations of the Java
 *  interface package found here:
 *      http://www.w3.org/TR/SVG11/java.html
 */



package org.inkscape.dom.svg;

import org.w3c.dom.DOMException;

public class SVGPathSegCurvetoCubicAbsImpl
       extends
           SVGPathSegImpl
       implements org.w3c.dom.svg.SVGPathSegCurvetoCubicAbs
{
public native float   getX( );
public native void      setX( float x )
                     throws DOMException;
public native float   getY( );
public native void      setY( float y )
                     throws DOMException;
public native float   getX1( );
public native void      setX1( float x1 )
                     throws DOMException;
public native float   getY1( );
public native void      setY1( float y1 )
                     throws DOMException;
public native float   getX2( );
public native void      setX2( float x2 )
                     throws DOMException;
public native float   getY2( );
public native void      setY2( float y2 )
                     throws DOMException;
}
