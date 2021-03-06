/*
 * LG3D Incubator Project - LgAmazon
 *
 * $RCSfile: LgAmazonListener.java,v $
 *
 * Copyright (c) 2006, INoX Software Development Group, All Rights Reserved
 *
 * Redistributions in source code form must reproduce the above
 * copyright and this condition.
 *
 * The contents of this file are subject to the GNU General Public
 * License, Version 2 (the "License"); you may not use this file
 * except in compliance with the License. A copy of the License is
 * available at http://www.opensource.org/licenses/gpl-license.php.
 *
 * $Revision: 1.1 $
 * $Date: 2007-03-09 09:38:42 $
 * Author: E_INOUE
 */

package org.jdesktop.lg3d.apps.lgamazon;

import org.jdesktop.lg3d.apps.lgamazon.stub.Items;

public interface LgAmazonListener {

    public void searchResult(Items result);
    
    public void exception(Exception exception);
}
