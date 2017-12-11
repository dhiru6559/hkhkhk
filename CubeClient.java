package com.soap.demo;


import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
import java.util.Scanner;

public class CubeClient {

	public static void main(String args[]) throws Exception {
		URL url = new URL("http://localhost:8090/cs?wsdl");

		// Qualified name of the service:
		// 1st arg is the service URI
		// 2nd is the service name published in the WSDL
		// See WSDL file to see both parameters
		// by default 'Service' is added in Implementation class 
		QName qname = new QName("http://demo.soap.com/",
				"CubeImplService");

		// Create, in effect, a factory for the service.
		Service service = Service.create(url, qname);

		// Extract the endpoint interface, the service "port".
		CubeService endPointIntf = service.getPort(CubeService.class);

		System.out.println("Enter a number to calculate cube ");
		Scanner scan = new Scanner(System.in);
		double num1=scan.nextDouble();
		System.out.println("Cube of  "+num1+" is  "+endPointIntf.calCube(num1));
		System.out.println("Enter a number to calculate Square ");
		num1=scan.nextDouble();
		System.out.println("Cube is  "+num1+" is "+endPointIntf.calSqr(num1));
	}

}
