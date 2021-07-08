package com.nt.th.esb.transform;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 18/11/2563.
 */
@Root(name="Asset",strict=false)
public class CRM_QueryCAforAll_Asset {
	
    @Element(required=false, name="Asset_No")
    private String Asset_No;
    @Element(required=false, name="ProductType_Name")
    private String ProductType_Name;
    @Element(required=false, name="Asset_Status")
    private String Asset_Status;
    @Element(required=false, name="Asset_StartDate")
    private String Asset_StartDate;
    @Element(required=false, name="Asset_EndDate")
    private String Asset_EndDate;
    @Element(required=false, name="PackageCode")
    private String PackageCode;
    @Element(required=false, name="PackageName")
    private String PackageName;
    @Element(required=false, name="PackageDesc")
    private String PackageDesc;
    @Element(required=false, name="PackagePrice")
    private String PackagePrice;
    @Element(required=false, name="PackageStartDate")
    private String PackageStartDate;
    @Element(required=false, name="PackageEndDate")
    private String PackageEndDate;
    @Element(required=false, name="Suspend_Date")
    private String Suspend_Date;
    @Element(required=false, name="EndSuspend_Date")
    private String EndSuspend_Date;
    @Element(required=false, name="Resume_Date")
    private String Resume_Date;
    @Element(required=false, name="CPE_Brand")
    private String CPE_Brand;
    @Element(required=false, name="CPE_Model")
    private String CPE_Model;
    @Element(required=false, name="CPE_IMEI")
    private String CPE_IMEI;
    @Element(required=false, name="CPE_Serialno")
    private String CPE_Serialno;
    
    @Element(required=false, name="AssetAttr")
    private CRM_QueryCAforAll_AssetAttr AssetAttr;

	public String getAsset_No() {
		return Asset_No;
	}

	public void setAsset_No(String asset_No) {
		Asset_No = asset_No;
	}

	public String getProductType_Name() {
		return ProductType_Name;
	}

	public void setProductType_Name(String productType_Name) {
		ProductType_Name = productType_Name;
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

	public CRM_QueryCAforAll_AssetAttr getAssetAttr() {
		return AssetAttr;
	}

	public void setAssetAttr(CRM_QueryCAforAll_AssetAttr assetAttr) {
		AssetAttr = assetAttr;
	}

	public String getAsset_StartDate() {
		return Asset_StartDate;
	}

	public void setAsset_StartDate(String asset_StartDate) {
		Asset_StartDate = asset_StartDate;
	}
    
    

}
