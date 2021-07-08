package com.nt.th.esb.response.dto;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class Message {
	
	private IntegrationResult integrationResult;
	
	public Message(IntegrationResult integrationResult) {
		this.integrationResult = integrationResult;
	}
	
	public Message() {
		
	}

	public IntegrationResult getIntegrationResult() {
		return integrationResult;
	}

	public void setIntegrationResult(IntegrationResult integrationResult) {
		this.integrationResult = integrationResult;
	}
	
	
	
}
