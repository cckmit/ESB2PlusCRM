package com.nt.th.esb.transform;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 18/11/2563.
 */
@Root(name="ResponseResult",strict=false)
public class CRM_QueryCAforAll_ResponseResult {
	
	@Element(required=false, name="ResponseDateTime")
    private String ResponseDateTime;
	
	@Element(required=false, name="ResponseOK")
    private String ResponseOK;
	
	@Element(required=false, name="ResponseCode")
    private String ResponseCode;
	
	@Element(required=false, name="ResponseDesc")
    private String ResponseDesc;

	public String getResponseDateTime() {
		return ResponseDateTime;
	}

	public void setResponseDateTime(String responseDateTime) {
		ResponseDateTime = responseDateTime;
	}

	public String getResponseOK() {
		return ResponseOK;
	}

	public void setResponseOK(String responseOK) {
		ResponseOK = responseOK;
	}

	public String getResponseCode() {
		return ResponseCode;
	}

	public void setResponseCode(String responseCode) {
		ResponseCode = responseCode;
	}

	public String getResponseDesc() {
		return ResponseDesc;
	}

	public void setResponseDesc(String responseDesc) {
		ResponseDesc = responseDesc;
	}
    
}
