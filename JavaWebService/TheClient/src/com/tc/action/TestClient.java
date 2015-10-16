package com.tc.action;

import com.tc.service.ServiceHello;
import com.tc.service.ServiceHelloService;

public class TestClient {

	public static void main(String[] args) {
		ServiceHello sh= new ServiceHelloService().getServiceHelloPort();
		String name= sh.getVlaue("xiaohong");
		System.out.println(name);

	}

}
