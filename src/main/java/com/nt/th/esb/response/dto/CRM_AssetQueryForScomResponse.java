package com.nt.th.esb.response.dto;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class CRM_AssetQueryForScomResponse {

	private ContextIntegrator contextIntegrator;
	private CRM_AssetQueryForScomMessageDto body;
	
	public ContextIntegrator getContextIntegrator() {
		return contextIntegrator;
	}
	public void setContextIntegrator(ContextIntegrator contextIntegrator) {
		this.contextIntegrator = contextIntegrator;
	}
	public CRM_AssetQueryForScomMessageDto getBody() {
		return body;
	}
	public void setBody(CRM_AssetQueryForScomMessageDto body) {
		this.body = body;
	}
	
	
}
