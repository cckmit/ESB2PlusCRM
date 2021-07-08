package com.nt.th.esb.transform;

import org.simpleframework.xml.Element;

/**
 * Created by Kritsana J. on 03/03/2564.
 */
public class CRM_AssetQueryForScom_RowSet {
	
	@Element(required=false, name="CA_ID")
	private String CA_ID;
	@Element(required=false, name="Contact_Title")
	private String Contact_Title;
	@Element(required=false, name="Contact_Firstname")
	private String Contact_Firstname;
	@Element(required=false, name="Contact_Lastname")
	private String Contact_Lastname;
	@Element(required=false, name="CusType_Code")
	private String CusType_Code;
	@Element(required=false, name="CusType_Name")
	private String CusType_Name;
	@Element(required=false, name="CusSubType_Code")
	private String CusSubType_Code;
	@Element(required=false, name="CusSubType_Name")
	private String CusSubType_Name;
	@Element(required=false, name="CA_CustomerClass")
	private String CA_CustomerClass;
	@Element(required=false, name="Account_Title")
	private String Account_Title;
	@Element(required=false, name="Account_CompanyName")
	private String Account_CompanyName;
	@Element(required=false, name="Account_Branch")
	private String Account_Branch;
	@Element(required=false, name="Account_GOVCode")
	private String Account_GOVCode;
	@Element(required=false, name="CA_CreatedDateTime")
	private String CA_CreatedDateTime;
	@Element(required=false, name="CA_Email")
	private String CA_Email;
	@Element(required=false, name="CA_PassportNo")
	private String CA_PassportNo;
	@Element(required=false, name="CA_RegistrationID")
	private String CA_RegistrationID;
	@Element(required=false, name="CA_CitizenID")
	private String CA_CitizenID;
	@Element(required=false, name="CA_RootID")
	private String CA_RootID;
	@Element(required=false, name="CA_ParentID")
	private String CA_ParentID;
	@Element(required=false, name="CA_MobileNo1")
	private String CA_MobileNo1;
	@Element(required=false, name="CA_MobileNo2")
	private String CA_MobileNo2;
	@Element(required=false, name="CA_FaxNoExt")
	private String CA_FaxNoExt;
	@Element(required=false, name="CA_PhoneNo")
	private String CA_PhoneNo;
	@Element(required=false, name="CA_PhoneExtNo")
	private String CA_PhoneExtNo;
	@Element(required=false, name="CA_FaxNo")
	private String CA_FaxNo;
	@Element(required=false, name="CA_Status")
	private String CA_Status;
	@Element(required=false, name="CA_Blacklist")
	private String CA_Blacklist;
	
	@Element(required=false, name="LegalAddr")
	private CRM_AssetQueryForScom_LegalAddr LegalAddr;
	
	@Element(required=false, name="BA")	
	private CRM_AssetQueryForScom_BA BA;

	public String getCA_ID() {
		return CA_ID;
	}

	public void setCA_ID(String cA_ID) {
		CA_ID = cA_ID;
	}

	public String getContact_Title() {
		return Contact_Title;
	}

	public void setContact_Title(String contact_Title) {
		Contact_Title = contact_Title;
	}

	public String getContact_Firstname() {
		return Contact_Firstname;
	}

	public void setContact_Firstname(String contact_Firstname) {
		Contact_Firstname = contact_Firstname;
	}

	public String getContact_Lastname() {
		return Contact_Lastname;
	}

	public void setContact_Lastname(String contact_Lastname) {
		Contact_Lastname = contact_Lastname;
	}

	public String getCusType_Code() {
		return CusType_Code;
	}

	public void setCusType_Code(String cusType_Code) {
		CusType_Code = cusType_Code;
	}

	public String getCusType_Name() {
		return CusType_Name;
	}

	public void setCusType_Name(String cusType_Name) {
		CusType_Name = cusType_Name;
	}

	public String getCusSubType_Code() {
		return CusSubType_Code;
	}

	public void setCusSubType_Code(String cusSubType_Code) {
		CusSubType_Code = cusSubType_Code;
	}

	public String getCusSubType_Name() {
		return CusSubType_Name;
	}

	public void setCusSubType_Name(String cusSubType_Name) {
		CusSubType_Name = cusSubType_Name;
	}

	public String getCA_CustomerClass() {
		return CA_CustomerClass;
	}

	public void setCA_CustomerClass(String cA_CustomerClass) {
		CA_CustomerClass = cA_CustomerClass;
	}

	public String getAccount_Title() {
		return Account_Title;
	}

	public void setAccount_Title(String account_Title) {
		Account_Title = account_Title;
	}

	public String getAccount_CompanyName() {
		return Account_CompanyName;
	}

	public void setAccount_CompanyName(String account_CompanyName) {
		Account_CompanyName = account_CompanyName;
	}

	public String getAccount_Branch() {
		return Account_Branch;
	}

	public void setAccount_Branch(String account_Branch) {
		Account_Branch = account_Branch;
	}

	public String getAccount_GOVCode() {
		return Account_GOVCode;
	}

	public void setAccount_GOVCode(String account_GOVCode) {
		Account_GOVCode = account_GOVCode;
	}

	public String getCA_CreatedDateTime() {
		return CA_CreatedDateTime;
	}

	public void setCA_CreatedDateTime(String cA_CreatedDateTime) {
		CA_CreatedDateTime = cA_CreatedDateTime;
	}

	public String getCA_Email() {
		return CA_Email;
	}

	public void setCA_Email(String cA_Email) {
		CA_Email = cA_Email;
	}

	public String getCA_PassportNo() {
		return CA_PassportNo;
	}

	public void setCA_PassportNo(String cA_PassportNo) {
		CA_PassportNo = cA_PassportNo;
	}

	public String getCA_RegistrationID() {
		return CA_RegistrationID;
	}

	public void setCA_RegistrationID(String cA_RegistrationID) {
		CA_RegistrationID = cA_RegistrationID;
	}

	public String getCA_CitizenID() {
		return CA_CitizenID;
	}

	public void setCA_CitizenID(String cA_CitizenID) {
		CA_CitizenID = cA_CitizenID;
	}

	public String getCA_RootID() {
		return CA_RootID;
	}

	public void setCA_RootID(String cA_RootID) {
		CA_RootID = cA_RootID;
	}

	public String getCA_ParentID() {
		return CA_ParentID;
	}

	public void setCA_ParentID(String cA_ParentID) {
		CA_ParentID = cA_ParentID;
	}

	public String getCA_MobileNo1() {
		return CA_MobileNo1;
	}

	public void setCA_MobileNo1(String cA_MobileNo1) {
		CA_MobileNo1 = cA_MobileNo1;
	}

	public String getCA_MobileNo2() {
		return CA_MobileNo2;
	}

	public void setCA_MobileNo2(String cA_MobileNo2) {
		CA_MobileNo2 = cA_MobileNo2;
	}

	public String getCA_FaxNoExt() {
		return CA_FaxNoExt;
	}

	public void setCA_FaxNoExt(String cA_FaxNoExt) {
		CA_FaxNoExt = cA_FaxNoExt;
	}

	public String getCA_PhoneNo() {
		return CA_PhoneNo;
	}

	public void setCA_PhoneNo(String cA_PhoneNo) {
		CA_PhoneNo = cA_PhoneNo;
	}

	public String getCA_PhoneExtNo() {
		return CA_PhoneExtNo;
	}

	public void setCA_PhoneExtNo(String cA_PhoneExtNo) {
		CA_PhoneExtNo = cA_PhoneExtNo;
	}

	public String getCA_FaxNo() {
		return CA_FaxNo;
	}

	public void setCA_FaxNo(String cA_FaxNo) {
		CA_FaxNo = cA_FaxNo;
	}

	public String getCA_Status() {
		return CA_Status;
	}

	public void setCA_Status(String cA_Status) {
		CA_Status = cA_Status;
	}

	public String getCA_Blacklist() {
		return CA_Blacklist;
	}

	public void setCA_Blacklist(String cA_Blacklist) {
		CA_Blacklist = cA_Blacklist;
	}

	public CRM_AssetQueryForScom_LegalAddr getLegalAddr() {
		return LegalAddr;
	}

	public void setLegalAddr(CRM_AssetQueryForScom_LegalAddr legalAddr) {
		LegalAddr = legalAddr;
	}

	public CRM_AssetQueryForScom_BA getBA() {
		return BA;
	}

	public void setBA(CRM_AssetQueryForScom_BA bA) {
		BA = bA;
	}
	

}
