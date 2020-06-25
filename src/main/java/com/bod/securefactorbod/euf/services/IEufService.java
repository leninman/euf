package com.bod.securefactorbod.euf.services;

import java.util.List;

import com.bod.securefactorbod.euf.model.Response;



public interface IEufService {
	
	public Response validate(String Sharedkey, String Finger);
	
	public Boolean validateFinger(String Finger);

	public Boolean validateClient(String Sharedkey);
	
	public Response enrollMachine();
	
	public Response listEnrolledMachines();
	
	public Response retrieveMachineInfo();
	   
}
