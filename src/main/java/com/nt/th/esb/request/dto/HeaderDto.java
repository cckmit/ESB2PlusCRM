package com.nt.th.esb.request.dto;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class HeaderDto {
	
	private String transactionId;
	private String integrationKeyRef;
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getIntegrationKeyRef() {
		return integrationKeyRef;
	}
	public void setIntegrationKeyRef(String integrationKeyRef) {
		this.integrationKeyRef = integrationKeyRef;
	}
	

}
