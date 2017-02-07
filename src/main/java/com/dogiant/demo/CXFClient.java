package com.dogiant.demo;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class CXFClient {
	public static void main(String[] args) {
//		JaxWsProxyFactoryBean proxy = new JaxWsProxyFactoryBean();
//		proxy.setServiceClass(CXFDemo.class);
//		proxy.setAddress("http://localhost:8080/services/cxfdemo");
//        CXFDemo cxf = (CXFDemo) proxy.create();
//        System.out.println(cxf.sayHello("haha"));
        
        String s = new String("1");
        String s2 = s;
        s = new String("2");
        System.out.println(s2);
	}
}
