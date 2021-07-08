package com.nt.th.esb.request.dto;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class CRM_AssetQueryForScomMessageReqMsg {
	
	private ContextIntegratorDto contextIntegrator;
	private CRM_AssetQueryForScomMessageReqDto body;
	
	public ContextIntegratorDto getContextIntegrator() {
		return contextIntegrator;
	}
	public void setContextIntegrator(ContextIntegratorDto contextIntegrator) {
		this.contextIntegrator = contextIntegrator;
	}
	public CRM_AssetQueryForScomMessageReqDto getBody() {
		return body;
	}
	public void setBody(CRM_AssetQueryForScomMessageReqDto body) {
		this.body = body;
	}
	

}
