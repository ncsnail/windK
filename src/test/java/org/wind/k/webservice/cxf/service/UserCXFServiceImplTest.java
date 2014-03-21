package org.wind.k.webservice.cxf.service;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class UserCXFServiceImplTest {

	public static void main(String[] args) {
		JaxWsProxyFactoryBean webService = new JaxWsProxyFactoryBean();
		webService.setServiceClass(IUserCXFService.class);
		webService.setAddress("http://localhost:8080/windK/cxf/userCXFService");
		IUserCXFService userCXFService = (IUserCXFService)webService.create();
		System.out.println("The result"+userCXFService.checkUser("test", "12345"));
	}
	
}
