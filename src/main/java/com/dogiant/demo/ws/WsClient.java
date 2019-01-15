package com.dogiant.demo.ws;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class WsClient {
	public static void main(String[] args) {
		JaxWsProxyFactoryBean proxy = new JaxWsProxyFactoryBean();
		proxy.setServiceClass(HelloService.class);
		proxy.setAddress("http://localhost:8080/services/helloService");
		HelloService helloService = (HelloService) proxy.create();
        System.out.println(helloService.sayHello("haha"));

	}
}
