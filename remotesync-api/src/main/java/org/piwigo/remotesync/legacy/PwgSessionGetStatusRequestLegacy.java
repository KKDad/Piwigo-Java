/*******************************************************************************
 * Copyright (c) 2014 Matthieu Helleboid.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Matthieu Helleboid - initial API and implementation
 ******************************************************************************/
package org.piwigo.remotesync.legacy;

import org.piwigo.remotesync.api.request.AbstractRequest;

/**
Gets information about the current session. Also provides a token useable with admin methods.
**/
@org.piwigo.remotesync.generator.Generated
public class PwgSessionGetStatusRequestLegacy extends AbstractRequest<PwgSessionGetStatusResponseLegacy> {

	public PwgSessionGetStatusRequestLegacy() {
	}

	public boolean isNeedPwgToken() {
		return false;
	}

	public boolean isAdminOnly() {
		return false;
	};

	public boolean isPostOnly() {
		return false;
	};

	public String getWSMethodName() {
		return "pwg.session.getStatus";
	}

	public Class<PwgSessionGetStatusResponseLegacy> getReturnType() {
		return PwgSessionGetStatusResponseLegacy.class;
	}
}
