package com.simulationhttp.app;

import com.simulationhttp.util.HttpRequest;


/**
 * ����
 * 
 * @author Admin
 *
 */
public class App {

	
	
	public static void main(String[] args) {

		String g = HttpRequest.sendGet("http://localhost:8888/simulationhttp/RequestString", "name=1&pass=2");
		System.out.println("ģ��GET����" + g);
		System.out.println("===================================");
		String p = HttpRequest.sendPost("http://localhost:8888/simulationhttp/RequestString", "name=post&pass=2");
		System.out.println("ģ��POST����" + p);
	}
}
