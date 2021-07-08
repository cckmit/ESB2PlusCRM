package com.nt.th.esb.response.dto;

/**
 * Created by Kritsana J. on 04/03/2564.
 */		
public class IntegrationResult {

	private boolean result;
	private String esbReturnCode;
	private String esbReturnMsg;
	private String destinationReturnCode;
	private String destinationReturnMsg;
		
	public IntegrationResult(boolean result, String esbReturnCode, String esbReturnMsg, String destinationReturnCode,
			String destinationReturnMsg) {
		this.result = result;
		this.esbReturnCode = esbReturnCode;
		this.esbReturnMsg = esbReturnMsg;
		this.destinationReturnCode = destinationReturnCode;
		this.destinationReturnMsg = destinationReturnMsg;
	}
	
	public IntegrationResult() {
		
	}
	
	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getEsbReturnCode() {
		return esbReturnCode;
	}
	
	public void setEsbReturnCode(String esbReturnCode) {
		this.esbReturnCode = esbReturnCode;
	}
	
	public String getEsbReturnMsg() {
		return esbReturnMsg;
	}
	
	public void setEsbReturnMsg(String esbReturnMsg) {
		this.esbReturnMsg = esbReturnMsg;
	}
	
	public String getDestinationReturnCode() {
		return destinationReturnCode;
	}
	
	public void setDestinationReturnCode(String destinationReturnCode) {
		this.destinationReturnCode = destinationReturnCode;
	}
	
	public String getDestinationReturnMsg() {
		return destinationReturnMsg;
	}
	
	public void setDestinationReturnMsg(String destinationReturnMsg) {
		this.destinationReturnMsg = destinationReturnMsg;
	}
	
}
