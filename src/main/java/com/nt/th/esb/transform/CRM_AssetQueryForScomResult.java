package com.nt.th.esb.transform;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 03/03/2564.
 */
@Root(name="InquiryCAResult",strict=false)
public class CRM_AssetQueryForScomResult {
	
	@Element(required=false, name="ResponseResult")
	private CRM_AssetQueryForScom_ResponseResult responseResult;
	
	@Element(required=false, name="RowSet")
	private CRM_AssetQueryForScom_RowSet RowSet;

	public CRM_AssetQueryForScom_ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(CRM_AssetQueryForScom_ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public CRM_AssetQueryForScom_RowSet getRowSet() {
		return RowSet;
	}

	public void setRowSet(CRM_AssetQueryForScom_RowSet rowSet) {
		RowSet = rowSet;
	}

	
}
