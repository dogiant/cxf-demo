package com.dogiant.demo.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.dogiant.demo.ws.HelloService", serviceName = "helloService")
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String foo) {
		System.out.println("exec...");
		return "hello "+foo;
	}

}
