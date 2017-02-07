package com.dogiant.demo;

import javax.jws.WebService;

@WebService(endpointInterface = "com.dogiant.demo.CXFDemo", serviceName = "cxfDemo")
public class CXFDemoImpl implements CXFDemo {

	@Override
	public String sayHello(String foo) {
		System.out.println("exec...");
		return "hello "+foo;
	}

}
