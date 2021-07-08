package com.nt.th.esb.response.dto;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class CRM_QueryCAforAllMessageDto {

	private CRM_QueryCAforAllResponseResult ResponseResult;
	private CRM_QueryCAforAllCA CA;
	
	public CRM_QueryCAforAllResponseResult getResponseResult() {
		return ResponseResult;
	}

	public void setResponseResult(CRM_QueryCAforAllResponseResult responseResult) {
		ResponseResult = responseResult;
	}

	public CRM_QueryCAforAllCA getCA() {
		return CA;
	}

	public void setCA(CRM_QueryCAforAllCA cA) {
		CA = cA;
	}
	
}
