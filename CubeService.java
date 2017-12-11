package com.soap.demo;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface CubeService {
	@WebMethod
	public  double calCube(double num);
	
	@WebMethod
	public  double calSqr(double num);

}
