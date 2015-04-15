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
package org.piwigo.remotesync.api.request;

import org.piwigo.remotesync.api.request.AbstractRequest;
import org.piwigo.remotesync.api.response.PwgThemesPerformActionResponse;

/**

**/
@org.piwigo.remotesync.generator.Generated
public class PwgThemesPerformActionRequest extends AbstractRequest<PwgThemesPerformActionResponse> {

	protected PwgThemesPerformActionRequest() {}

	public PwgThemesPerformActionRequest(Action action, String theme) {
		setAction(action);
		setTheme(theme);
	}

	//info : activate, deactivate, delete, set_default
 	protected PwgThemesPerformActionRequest setAction(Action action) {
		addParameterValue("action", org.piwigo.remotesync.api.type.Type.ENUM, null, action);
		return this;
	}	

 	protected PwgThemesPerformActionRequest setTheme(String theme) {
		addParameterValue("theme", org.piwigo.remotesync.api.type.Type.MIXED, null, theme);
		return this;
	}	

	public enum Action {
		ACTIVATE,
		DEACTIVATE,
		DELETE,
		SET_DEFAULT
	}

	public boolean isNeedPwgToken() {
		return true;
	}

	public boolean isAdminOnly() {
		return true;
	};

	public boolean isPostOnly() {
		return false;
	};

	public String getWSMethodName() {
		return "pwg.themes.performAction";
	}

	public Class<PwgThemesPerformActionResponse> getReturnType() {
		return PwgThemesPerformActionResponse.class;
	}
}
