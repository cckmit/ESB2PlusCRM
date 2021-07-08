package com.nt.th.esb.request.dto;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class CRM_AssetQueryForScomMessageReqDto {
	
	private String telephoneNumber;

	public CRM_AssetQueryForScomMessageReqDto() {
	}
	
	public CRM_AssetQueryForScomMessageReqDto(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	

}
