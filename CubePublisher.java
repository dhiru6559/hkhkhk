package com.soap.demo;

import javax.xml.ws.Endpoint;


public class CubePublisher {
	public static void main(String[] args) {
		//pass URL and Service Implmentation Class
		Endpoint.publish("http://127.0.0.1:8090/cs", new CubeImpl());
		System.out.println("Web Service Published.... ");
	}

}
