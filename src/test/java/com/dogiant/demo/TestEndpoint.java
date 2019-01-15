package com.dogiant.demo;

import javax.xml.ws.Endpoint;

import com.dogiant.demo.ws.HelloService;
import com.dogiant.demo.ws.HelloServiceImpl;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Assert;

import junit.framework.TestCase;

public class TestEndpoint extends TestCase {
	
	private static final String ADDRESS = "http://localhost:9000/helloService";

	protected void setUp() throws Exception {
		super.setUp();

		System.out.println("Starting Server");
		HelloService demo = new HelloServiceImpl();

		Endpoint.publish(ADDRESS, demo);
		System.out.println("Start success");
	}

	public void testSayHello() {

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(HelloService.class);
		factory.setAddress(ADDRESS);
		HelloService client = (HelloService) factory.create();
		Assert.assertEquals(client.sayHello("foo"), "hello foo");
	}
}
