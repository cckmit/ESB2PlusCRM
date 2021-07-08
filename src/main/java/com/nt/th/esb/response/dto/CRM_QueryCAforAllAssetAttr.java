package com.nt.th.esb.response.dto;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class CRM_QueryCAforAllAssetAttr {
	private String Product_Name;
	private String ServiceLocation_Name;
	private String ServiceLocation_ID;
	
	private CRM_QueryCAforAllInstAddr InstAddr;

	public String getProduct_Name() {
		return Product_Name;
	}

	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}

	public String getServiceLocation_Name() {
		return ServiceLocation_Name;
	}

	public void setServiceLocation_Name(String serviceLocation_Name) {
		ServiceLocation_Name = serviceLocation_Name;
	}

	public String getServiceLocation_ID() {
		return ServiceLocation_ID;
	}

	public void setServiceLocation_ID(String serviceLocation_ID) {
		ServiceLocation_ID = serviceLocation_ID;
	}

	public CRM_QueryCAforAllInstAddr getInstAddr() {
		return InstAddr;
	}

	public void setInstAddr(CRM_QueryCAforAllInstAddr instAddr) {
		InstAddr = instAddr;
	}
	
}
