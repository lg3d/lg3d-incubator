/*
 * $Header: /zpool01/javanet/scm/svn/tmp/cvs2svn/lg3d-incubator/src/classes/org/jdesktop/lg3d/apps/kwebdemo1/events/SearchDialogKeyPressedAction.java,v 1.2 2005-06-24 19:56:56 paulby Exp $
 * $Date: 2005-06-24 19:56:56 $
 *
 * Joint Copyright (c) 2005 by
 *   James A. Zaun, Consultant,
 *   The Burke Institute,
 *   Sun Microsystems, Inc.
 * ALL RIGHTS RESERVED.
 *
 * The contents of this file are subject to the GNU General Public
 * License, Version 2 (the "License"); you may not use this file
 * except in compliance with the License. A copy of the License is
 * available at http://www.opensource.org/licenses/gpl-license.php.
 */

package org.jdesktop.lg3d.apps.kwebdemo1.events;

import org.jdesktop.lg3d.utils.action.ActionBooleanInt;
import org.jdesktop.lg3d.wg.event.LgEventSource;
import org.jdesktop.lg3d.apps.kwebdemo1.components.SearchDialogC3D;

/**
 * This is an Action associated with an LgEvent. This action is associated with
 * events generated during the startup sequence. Whenever an animation occurs,
 * the appropriate instance of this object is called to perform the action.
 * 
 * <p><em>Implementation:</em> No real work is done by this class.
 * All it does is to delegate to a method in the main
 * {@link org.jdesktop.lg3d.apps.kwebdemo1.components.SearchDialogC3D SearchDialogC3D} class.
 * 
 * @author Jim Zaun &lt;jz-lg@zaun.com&gt; (a.k.a. &lt;zaun@acm.org&gt;)
 * @version $Revision: 1.2 $
 * @since JDK 1.5.0, Java3D 1.4.0, lg3d-{core,demo,incubator 0.7.0
 */
public class SearchDialogKeyPressedAction implements ActionBooleanInt
{
  private SearchDialogC3D dialogC3D = null;

  /**
   * Initializes some info so this class can delegate the action to the right
   * receiver of the action.
   * 
   * @param dialogC3D  instance of the Component3D class that contain the
   *   method for handling the action.
   */
  public SearchDialogKeyPressedAction(SearchDialogC3D dialogC3D)
  {
    this.dialogC3D = dialogC3D;
  }

  /**
   * Required method which is called whenever an LgEventListener needs to
   * perform an action on this class.
   * 
   * @param source Source object of the event (but currently ignored).
   * @param state whether this is a press or release event.
   * @param value which key (code) what pressed.
   */
  public void performAction(LgEventSource source, boolean state, int value)
  {
    dialogC3D.handleKeyPress(state, value);
  }

}
