package com.nt.th.esb.transform;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 18/11/2563.
 */
@Root(name="InquiryCRMResponse",strict=false)
public class CRM_QueryCAforAllResponse {
	
	@Element(required=false, name="InquiryCRMResult")
	CRM_QueryCAforAllResult InquiryCRMResult;

	public CRM_QueryCAforAllResult getInquiryCRMResult() {
		return InquiryCRMResult;
	}

	public void setInquiryCRMResult(CRM_QueryCAforAllResult inquiryCRMResult) {
		InquiryCRMResult = inquiryCRMResult;
	}
	
}
