package com.dogiant.demo;

import com.dogiant.demo.ws.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-config-jaxws-client.xml"})
public class TestCXFClient {
	
	@Resource
	private HelloService client;
	
	@Test
	public void test() {
		System.out.println(client.sayHello("ha"));
	}

}
