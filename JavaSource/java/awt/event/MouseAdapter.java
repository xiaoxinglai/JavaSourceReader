/*
 * Copyright (c) 1996, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package JavaSource.java.awt.event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

/**
 * An abstract adapter class for receiving mouse events.
 * The methods in this class are empty. This class exists as
 * convenience for creating listener objects.
 * <P>
 * Mouse events let you track when a mouse is pressed, released, clicked,
 * moved, dragged, when it enters a component, when it exits and
 * when a mouse wheel is moved.
 * <P>
 * Extend this class to create a {@code MouseEvent}
 * (including drag and motion events) or/and {@code MouseWheelEvent}
 * listener and override the methods for the events of interest. (If you implement the
 * {@code MouseListener},
 * {@code MouseMotionListener}
 * interface, you have to define all of
 * the methods in it. This abstract class defines null methods for them
 * all, so you can only have to define methods for events you care about.)
 * <P>
 * Create a listener object using the extended class and then register it with
 * a component using the component's {@code addMouseListener}
 * {@code addMouseMotionListener}, {@code addMouseWheelListener}
 * methods.
 * The relevant method in the listener object is invoked  and the {@code MouseEvent}
 * or {@code MouseWheelEvent}  is passed to it in following cases:
 * <ul>
 * <li>when a mouse button is pressed, released, or clicked (pressed and  released)
 * <li>when the mouse cursor enters or exits the component
 * <li>when the mouse wheel rotated, or mouse moved or dragged
 * </ul>
 *
 * @author Carl Quinn
 * @author Andrei Dmitriev
 *
 * @see java.awt.event.MouseEvent
 * @see MouseWheelEvent
 * @see MouseListener
 * @see MouseMotionListener
 * @see MouseWheelListener
 * @see <a href="http://docs.oracle.com/javase/tutorial/uiswing/events/mouselistener.html">Tutorial: Writing a Mouse Listener</a>
 *
 * @since 1.1
 */
public abstract class MouseAdapter implements MouseListener, MouseWheelListener, MouseMotionListener {
    /**
     * {@inheritDoc}
     */
    public void mouseClicked(java.awt.event.MouseEvent e) {}

    /**
     * {@inheritDoc}
     */
    public void mousePressed(java.awt.event.MouseEvent e) {}

    /**
     * {@inheritDoc}
     */
    public void mouseReleased(java.awt.event.MouseEvent e) {}

    /**
     * {@inheritDoc}
     */
    public void mouseEntered(java.awt.event.MouseEvent e) {}

    /**
     * {@inheritDoc}
     */
    public void mouseExited(java.awt.event.MouseEvent e) {}

    /**
     * {@inheritDoc}
     * @since 1.6
     */
    public void mouseWheelMoved(MouseWheelEvent e){}

    /**
     * {@inheritDoc}
     * @since 1.6
     */
    public void mouseDragged(java.awt.event.MouseEvent e){}

    /**
     * {@inheritDoc}
     * @since 1.6
     */
    public void mouseMoved(MouseEvent e){}
}
