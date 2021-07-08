package com.nt.th.esb.response.dto;

/**
 * Created by Kritsana J. on 29/03/2564.
 */	
public class CRM_ContextIntegrator {
	
	public static ContextIntegrator setContextIntegrator(boolean result, String esbReturnCode, String esbReturnMsg, String destinationReturnCode,
			String destinationReturnMsg) throws Exception {
		
		IntegrationResult in = new IntegrationResult(result, esbReturnCode, esbReturnMsg, destinationReturnCode, destinationReturnMsg);
		Message msg = new Message(in);					
		ContextIntegrator context = new ContextIntegrator(msg);
		
		return context;		
	}

}
