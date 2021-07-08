package com.nt.th.esb.request.dto;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class CRM_QueryCAforAllMessageReqDto {
	
	private String citizenId;
	private String RegistrationID;
	private String PassportNo;
	private String CA_TaxID;
	private String assetNo;
	private String BA_ID;
	private String CA_ID;
	private String CA_all;
	private String BA_allStatus;
	private String Asset_allStatus;
	private String BA_Asset_All;
	
	public CRM_QueryCAforAllMessageReqDto(String citizenId, String registrationID, String passportNo, String cA_TaxID,
			String assetNo, String bA_ID, String cA_ID, String cA_all, String bA_allStatus, String asset_allStatus,
			String bA_Asset_All) {
		this.citizenId = citizenId;
		this.RegistrationID = registrationID;
		this.PassportNo = passportNo;
		this.CA_TaxID = cA_TaxID;
		this.assetNo = assetNo;
		this.BA_ID = bA_ID;
		this.CA_ID = cA_ID;
		this.CA_all = cA_all;
		this.BA_allStatus = bA_allStatus;
		this.Asset_allStatus = asset_allStatus;
		this.BA_Asset_All = bA_Asset_All;
	}
	
	public CRM_QueryCAforAllMessageReqDto(){
		
	}
	
	public String getCitizenId() {
		return citizenId;
	}
	
	public void setCitizenId(String citizenId) {
		this.citizenId = citizenId;
	}
	
	public String getRegistrationID() {
		return RegistrationID;
	}
	
	public void setRegistrationID(String registrationID) {
		RegistrationID = registrationID;
	}
	
	public String getPassportNo() {
		return PassportNo;
	}
	
	public void setPassportNo(String passportNo) {
		PassportNo = passportNo;
	}
	
	public String getCA_TaxID() {
		return CA_TaxID;
	}
	
	public void setCA_TaxID(String cA_TaxID) {
		CA_TaxID = cA_TaxID;
	}
	
	public String getAssetNo() {
		return assetNo;
	}
	
	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}
	
	public String getBA_ID() {
		return BA_ID;
	}
	
	public void setBA_ID(String bA_ID) {
		BA_ID = bA_ID;
	}
	
	public String getCA_ID() {
		return CA_ID;
	}
	
	public void setCA_ID(String cA_ID) {
		CA_ID = cA_ID;
	}
	
	public String getCA_all() {
		return CA_all;
	}
	
	public void setCA_all(String cA_all) {
		CA_all = cA_all;
	}
	
	public String getBA_allStatus() {
		return BA_allStatus;
	}
	
	public void setBA_allStatus(String bA_allStatus) {
		BA_allStatus = bA_allStatus;
	}
	
	public String getAsset_allStatus() {
		return Asset_allStatus;
	}
	
	public void setAsset_allStatus(String asset_allStatus) {
		Asset_allStatus = asset_allStatus;
	}
	
	public String getBA_Asset_All() {
		return BA_Asset_All;
	}
	
	public void setBA_Asset_All(String bA_Asset_All) {
		BA_Asset_All = bA_Asset_All;
	}

	

}
