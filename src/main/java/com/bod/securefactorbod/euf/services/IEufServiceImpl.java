package com.bod.securefactorbod.euf.services;



import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.bod.securefactorbod.euf.model.Response;
import com.bod.securefactorbod.euf.util.Constants;

@Service
public class IEufServiceImpl implements IEufService {
	
	Response result;
	
	

	@Override
	public Response validate(String Shk, String Fg) {
		// TODO Auto-generated method stub
		result=null;
                result=new Response();
		try {
			
			
			
			if(this.validateClient(Shk)) {
				if(this.validateFinger(Fg)) {
					result.setResponseCode(Constants.FINGERPRINTOK_CODE);
					result.setResponseDescription(Constants.FINGERPRINTOK_DESC);	
				}else{
					
					result.setResponseCode(Constants.FINGERPRINTBAD_CODE);
					result.setResponseDescription(Constants.FINGERPRINTBAD_DESC);	
				}
				
			}else{
				
				result.setResponseCode(Constants.NOTVALIDCLIENT_CODE);
				result.setResponseDescription(Constants.NOTVALIDCLIENTE_DESC);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}

	@Override
	public Response enrollMachine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response listEnrolledMachines() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response retrieveMachineInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean validateFinger(String Fg) {
		// TODO Auto-generated method stub
		if(Fg.equalsIgnoreCase("be4d818fbf4b538a0449c37638efa7fa")){
                    return true;
                }else{
                    return false;
                }
                
	}

	@Override
	public Boolean validateClient(String Sharedkey) {
		// TODO Auto-generated method stub
		if(Sharedkey.equalsIgnoreCase("001")){
                    return true;
                }else{
                    return false;
                }
                
              
                
	}
	
	
	
	
	

}
