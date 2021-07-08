package com.nt.th.esb.transform;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 18/11/2563.
 */
@Root(name="InquiryCRMResult",strict=false)
public class CRM_QueryCAforAllResult {
	
	@Element(required=false, name="ResponseResult")
	private CRM_QueryCAforAll_ResponseResult responseResult;
	
	@Element(required=false, name="CA")
	private CRM_QueryCAforAll_CA CA;

	public CRM_QueryCAforAll_ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(CRM_QueryCAforAll_ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public CRM_QueryCAforAll_CA getCA() {
		return CA;
	}

	public void setCA(CRM_QueryCAforAll_CA cA) {
		CA = cA;
	}
	
}
