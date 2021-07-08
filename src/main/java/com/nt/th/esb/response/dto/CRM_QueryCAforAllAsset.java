package com.nt.th.esb.response.dto;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class CRM_QueryCAforAllAsset {
	private String assetNo;
	private String productTypeName;
	private String Asset_Status;
	private String Asset_StartDate;
	private String Asset_EndDate;
	private String CPE_Brand;
	private String CPE_Model;
	private String CPE_IMEI;
	private String CPE_Serialno;
	
	private String PackageCode;
	private String PackageName;
	private String PackageDesc;
	private String PackagePrice;
	private String PackageStartDate;
	private String PackageEndDate;
	private String Suspend_Date;
	private String EndSuspend_Date;
	private String Resume_Date;
	
	private CRM_QueryCAforAllAssetAttr AssetAttr;

	public String getAssetNo() {
		return assetNo;
	}

	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}

	public String getProductTypeName() {
		return productTypeName;
	}

	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}

	public String getAsset_Status() {
		return Asset_Status;
	}

	public void setAsset_Status(String asset_Status) {
		Asset_Status = asset_Status;
	}

	public String getAsset_EndDate() {
		return Asset_EndDate;
	}

	public void setAsset_EndDate(String asset_EndDate) {
		Asset_EndDate = asset_EndDate;
	}

	public String getCPE_Brand() {
		return CPE_Brand;
	}

	public void setCPE_Brand(String cPE_Brand) {
		CPE_Brand = cPE_Brand;
	}

	public String getCPE_Model() {
		return CPE_Model;
	}

	public void setCPE_Model(String cPE_Model) {
		CPE_Model = cPE_Model;
	}

	public String getCPE_IMEI() {
		return CPE_IMEI;
	}

	public void setCPE_IMEI(String cPE_IMEI) {
		CPE_IMEI = cPE_IMEI;
	}

	public String getCPE_Serialno() {
		return CPE_Serialno;
	}

	public void setCPE_Serialno(String cPE_Serialno) {
		CPE_Serialno = cPE_Serialno;
	}

	public CRM_QueryCAforAllAssetAttr getAssetAttr() {
		return AssetAttr;
	}

	public void setAssetAttr(CRM_QueryCAforAllAssetAttr assetAttr) {
		AssetAttr = assetAttr;
	}

	public String getAsset_StartDate() {
		return Asset_StartDate;
	}

	public void setAsset_StartDate(String asset_StartDate) {
		Asset_StartDate = asset_StartDate;
	}

	public String getPackageCode() {
		return PackageCode;
	}

	public void setPackageCode(String packageCode) {
		PackageCode = packageCode;
	}

	public String getPackageName() {
		return PackageName;
	}

	public void setPackageName(String packageName) {
		PackageName = packageName;
	}

	public String getPackageDesc() {
		return PackageDesc;
	}

	public void setPackageDesc(String packageDesc) {
		PackageDesc = packageDesc;
	}

	public String getPackagePrice() {
		return PackagePrice;
	}

	public void setPackagePrice(String packagePrice) {
		PackagePrice = packagePrice;
	}

	public String getPackageStartDate() {
		return PackageStartDate;
	}

	public void setPackageStartDate(String packageStartDate) {
		PackageStartDate = packageStartDate;
	}

	public String getPackageEndDate() {
		return PackageEndDate;
	}

	public void setPackageEndDate(String packageEndDate) {
		PackageEndDate = packageEndDate;
	}

	public String getSuspend_Date() {
		return Suspend_Date;
	}

	public void setSuspend_Date(String suspend_Date) {
		Suspend_Date = suspend_Date;
	}

	public String getEndSuspend_Date() {
		return EndSuspend_Date;
	}

	public void setEndSuspend_Date(String endSuspend_Date) {
		EndSuspend_Date = endSuspend_Date;
	}

	public String getResume_Date() {
		return Resume_Date;
	}

	public void setResume_Date(String resume_Date) {
		Resume_Date = resume_Date;
	}
	
	
	
}
