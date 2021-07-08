package com.nt.th.esb.response.dto;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class ContextIntegrator {
	
	private Message message;
	
	public ContextIntegrator(Message message) {
		this.message = message;
	}
	
	public ContextIntegrator() {
		
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	
	
}
