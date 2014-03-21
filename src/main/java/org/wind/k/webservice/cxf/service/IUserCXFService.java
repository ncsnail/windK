package org.wind.k.webservice.cxf.service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface IUserCXFService {

	public String checkUser(@WebParam(name = "username")String username,
			@WebParam(name = "password")String password);
	
}
