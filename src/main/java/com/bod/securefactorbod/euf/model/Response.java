package com.bod.securefactorbod.euf.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Response implements Serializable {


	
	
	
	@Id
	private int responseCode;
	
	private String responseDescription;
	

	
	public Response() {
		
	}
		
	
	public Response(int responseCode, String responseDescription) {
		this.responseCode = responseCode;
		this.responseDescription = responseDescription;
	}
	
	
	
	
	

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseDescription() {
		return responseDescription;
	}

	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}


	
	
	
	

}
