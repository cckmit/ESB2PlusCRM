package com.nt.th.esb.transform;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 18/11/2563.
 */
@Root(name="BA",strict=false)
public class CRM_QueryCAforAll_BA {
	
    @Element(required=false, name="BA_ID")
    private String BA_ID;
    @Element(required=false, name="BA_PaymentMethod")
    private String BA_PaymentMethod;
    @Element(required=false, name="BA_BillCycle")
    private String BA_BillCycle;
    @Element(required=false, name="BA_CommOffCode")
    private String BA_CommOffCode;
    @Element(required=false, name="BA_CommOffName")
    private String BA_CommOffName;
    @Element(required=false, name="BA_FullName")
    private String BA_FullName;
    @Element(required=false, name="BA_Title")
    private String BA_Title;
    @Element(required=false, name="BA_FirstName")
    private String BA_FirstName;
    @Element(required=false, name="BA_LastName")
    private String BA_LastName;
    @Element(required=false, name="BA_ContactType")
    private String BA_ContactType;
    @Element(required=false, name="BA_OrgName")
    private String BA_OrgName;
    @Element(required=false, name="BA_BillHanding")
    private String BA_BillHanding;
    @Element(required=false, name="BA_Writeoff")
    private String BA_Writeoff;
    @Element(required=false, name="BA_AccountStatus")
    private String BA_AccountStatus;
    @Element(required=false, name="BA_Govcode")
    private String BA_Govcode;
    @Element(required=false, name="BA_TaxID")
    private String BA_TaxID;
    @Element(required=false, name="BA_RegistrationID")
    private String BA_RegistrationID;
    @Element(required=false, name="BA_CitizenID")
    private String BA_CitizenID;
    @Element(required=false, name="BA_EmailForEBill")
    private String BA_EmailForEBill;
    @Element(required=false, name="BA_HomePhone")
    private String BA_HomePhone;
    @Element(required=false, name="BA_TelephoneDept")
    private String BA_TelephoneDept;
    @Element(required=false, name="BA_Mobile")
    private String BA_Mobile;
    
    @Element(required=false, name="BillAddr")
    private CRM_QueryCAforAll_BillAddr BillAddr;
    
    @Element(required=false, name="Asset")
    private CRM_QueryCAforAll_Asset Asset;

	public String getBA_ID() {
		return BA_ID;
	}

	public void setBA_ID(String bA_ID) {
		BA_ID = bA_ID;
	}

	public String getBA_PaymentMethod() {
		return BA_PaymentMethod;
	}

	public void setBA_PaymentMethod(String bA_PaymentMethod) {
		BA_PaymentMethod = bA_PaymentMethod;
	}

	public String getBA_BillCycle() {
		return BA_BillCycle;
	}

	public void setBA_BillCycle(String bA_BillCycle) {
		BA_BillCycle = bA_BillCycle;
	}

	public String getBA_CommOffCode() {
		return BA_CommOffCode;
	}

	public void setBA_CommOffCode(String bA_CommOffCode) {
		BA_CommOffCode = bA_CommOffCode;
	}

	public String getBA_CommOffName() {
		return BA_CommOffName;
	}

	public void setBA_CommOffName(String bA_CommOffName) {
		BA_CommOffName = bA_CommOffName;
	}

	public String getBA_FullName() {
		return BA_FullName;
	}

	public void setBA_FullName(String bA_FullName) {
		BA_FullName = bA_FullName;
	}

	public String getBA_Title() {
		return BA_Title;
	}

	public void setBA_Title(String bA_Title) {
		BA_Title = bA_Title;
	}

	public String getBA_FirstName() {
		return BA_FirstName;
	}

	public void setBA_FirstName(String bA_FirstName) {
		BA_FirstName = bA_FirstName;
	}

	public String getBA_LastName() {
		return BA_LastName;
	}

	public void setBA_LastName(String bA_LastName) {
		BA_LastName = bA_LastName;
	}

	public String getBA_ContactType() {
		return BA_ContactType;
	}

	public void setBA_ContactType(String bA_ContactType) {
		BA_ContactType = bA_ContactType;
	}

	public String getBA_OrgName() {
		return BA_OrgName;
	}

	public void setBA_OrgName(String bA_OrgName) {
		BA_OrgName = bA_OrgName;
	}

	public String getBA_BillHanding() {
		return BA_BillHanding;
	}

	public void setBA_BillHanding(String bA_BillHanding) {
		BA_BillHanding = bA_BillHanding;
	}

	public String getBA_Writeoff() {
		return BA_Writeoff;
	}

	public void setBA_Writeoff(String bA_Writeoff) {
		BA_Writeoff = bA_Writeoff;
	}

	public String getBA_AccountStatus() {
		return BA_AccountStatus;
	}

	public void setBA_AccountStatus(String bA_AccountStatus) {
		BA_AccountStatus = bA_AccountStatus;
	}

	public String getBA_Govcode() {
		return BA_Govcode;
	}

	public void setBA_Govcode(String bA_Govcode) {
		BA_Govcode = bA_Govcode;
	}

	public String getBA_TaxID() {
		return BA_TaxID;
	}

	public void setBA_TaxID(String bA_TaxID) {
		BA_TaxID = bA_TaxID;
	}

	public String getBA_RegistrationID() {
		return BA_RegistrationID;
	}

	public void setBA_RegistrationID(String bA_RegistrationID) {
		BA_RegistrationID = bA_RegistrationID;
	}

	public String getBA_CitizenID() {
		return BA_CitizenID;
	}

	public void setBA_CitizenID(String bA_CitizenID) {
		BA_CitizenID = bA_CitizenID;
	}

	public String getBA_EmailForEBill() {
		return BA_EmailForEBill;
	}

	public void setBA_EmailForEBill(String bA_EmailForEBill) {
		BA_EmailForEBill = bA_EmailForEBill;
	}

	public String getBA_HomePhone() {
		return BA_HomePhone;
	}

	public void setBA_HomePhone(String bA_HomePhone) {
		BA_HomePhone = bA_HomePhone;
	}

	public String getBA_TelephoneDept() {
		return BA_TelephoneDept;
	}

	public void setBA_TelephoneDept(String bA_TelephoneDept) {
		BA_TelephoneDept = bA_TelephoneDept;
	}

	public String getBA_Mobile() {
		return BA_Mobile;
	}

	public void setBA_Mobile(String bA_Mobile) {
		BA_Mobile = bA_Mobile;
	}

	public CRM_QueryCAforAll_BillAddr getBillAddr() {
		return BillAddr;
	}

	public void setBillAddr(CRM_QueryCAforAll_BillAddr billAddr) {
		BillAddr = billAddr;
	}

	public CRM_QueryCAforAll_Asset getAsset() {
		return Asset;
	}

	public void setAsset(CRM_QueryCAforAll_Asset asset) {
		Asset = asset;
	}
    

}
