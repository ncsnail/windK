package org.wind.k.webservice.cxf.response;

import org.wind.k.webservice.cxf.base.WSResult;
import org.wind.k.webservice.cxf.dto.UserDTO;

public class UserResult extends WSResult{
	
	private UserDTO user;

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}
	
	
}
