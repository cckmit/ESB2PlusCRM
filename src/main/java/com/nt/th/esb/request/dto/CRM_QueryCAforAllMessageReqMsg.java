package com.nt.th.esb.request.dto;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class CRM_QueryCAforAllMessageReqMsg {
	private ContextIntegratorDto contextIntegrator;
	private CRM_QueryCAforAllMessageReqDto body;
	
	public ContextIntegratorDto getContextIntegrator() {
		return contextIntegrator;
	}
	public void setContextIntegrator(ContextIntegratorDto contextIntegrator) {
		this.contextIntegrator = contextIntegrator;
	}
	public CRM_QueryCAforAllMessageReqDto getBody() {
		return body;
	}
	public void setBody(CRM_QueryCAforAllMessageReqDto body) {
		this.body = body;
	}

	
}
