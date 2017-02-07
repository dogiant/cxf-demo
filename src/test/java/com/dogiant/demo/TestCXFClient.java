package com.dogiant.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-config-jaxws-client.xml"})
public class TestCXFClient {
	
	@Autowired
	private CXFDemo client;
	
	@Test
	public void test() {
		System.out.println(client.sayHello("hello"));
	}

}
