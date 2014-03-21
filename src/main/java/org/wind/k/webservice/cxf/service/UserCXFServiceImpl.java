package org.wind.k.webservice.cxf.service;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

//the annotation @WebService let us know which interface we need to create WSDL
@WebService(endpointInterface = "org.wind.k.webservice.cxf.service.IUserCXFService",serviceName="userCXFService")
public class UserCXFServiceImpl implements IUserCXFService {
	
	@Autowired
	private PropertiesConfiguration webServiceConfig;
	
	public UserCXFServiceImpl(PropertiesConfiguration webServiceConfig){
		this.webServiceConfig = webServiceConfig;
	}
	
	public String checkUser(@WebParam(name = "username")String username,
			@WebParam(name = "password")String password){
		
		System.out.println("username:"+username);
		System.out.println("password:"+password);
		//System.out.println("config:"+webServiceConfig.getProperty("webservice.test"));
		return "success";
	}
	
	
}
