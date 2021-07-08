package com.nt.th.esb.response.dto;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class CRM_QueryCAforAllResponse {
	
	private ContextIntegrator contextIntegrator;
	private CRM_QueryCAforAllMessageDto body;
	
	public ContextIntegrator getContextIntegrator() {
		return contextIntegrator;
	}
	
	public void setContextIntegrator(ContextIntegrator contextIntegrator) {
		this.contextIntegrator = contextIntegrator;
	}
	
	public CRM_QueryCAforAllMessageDto getBody() {
		return body;
	}
	
	public void setBody(CRM_QueryCAforAllMessageDto body) {
		this.body = body;
	}		
	
}
