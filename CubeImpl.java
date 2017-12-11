package com.soap.demo;

import javax.jws.WebService;
@WebService(endpointInterface="com.soap.demo.CubeService")
public class CubeImpl implements CubeService{

	@Override
	public double calCube(double num) {
		// TODO Auto-generated method stub
		return num*num*num;
	}

	@Override
	public double calSqr(double num) {
		// TODO Auto-generated method stub
		return num*num;
	}

}
