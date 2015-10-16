package com.ts.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class ServiceHello {
	
	public String getVlaue(String name) {
		return "my name is "+ name;
	}

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8081/TestWebService/ServiceHello", new ServiceHello());
		System.out.println("service success");
	}

}
