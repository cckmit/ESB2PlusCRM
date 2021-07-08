package com.nt.th.esb.transform;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 03/03/2564.
 */
@Root(name="InquiryCAResponse",strict=false)
public class CRM_AssetQueryForScomResponse {
	
	@Element(required=false, name="InquiryCAResult")
	CRM_AssetQueryForScomResult InquiryCAResult;

	public CRM_AssetQueryForScomResult getInquiryCAResult() {
		return InquiryCAResult;
	}

	public void setInquiryCAResult(CRM_AssetQueryForScomResult inquiryCAResult) {
		InquiryCAResult = inquiryCAResult;
	}


	
}
