package com.dogiant.demo.ws;

import javax.jws.WebService;

@WebService
public interface HelloService {
	public String sayHello(String foo);
}
