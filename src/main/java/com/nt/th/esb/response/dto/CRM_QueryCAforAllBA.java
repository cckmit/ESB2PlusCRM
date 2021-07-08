package com.nt.th.esb.response.dto;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class CRM_QueryCAforAllBA {
	private String accountId;
	private String BA_AccountStatus;
	private String BA_Writeoff;
	private String paymentMethodId;
	private String billCycle;
	private String BA_CommOffCode;
	private String BA_CommOffName;
	private String BA_Title;
	private String BA_FirstName;
	private String BA_LastName;
	private String BA_ContactType;
	private String BA_OrgName;
	private String BA_BillHanding;
	
	private CRM_QueryCAforAllBillAddr BillAddr;
	private CRM_QueryCAforAllAsset Asset;
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getBA_AccountStatus() {
		return BA_AccountStatus;
	}
	public void setBA_AccountStatus(String bA_AccountStatus) {
		BA_AccountStatus = bA_AccountStatus;
	}
	public String getBA_Writeoff() {
		return BA_Writeoff;
	}
	public void setBA_Writeoff(String bA_Writeoff) {
		BA_Writeoff = bA_Writeoff;
	}
	public String getPaymentMethodId() {
		return paymentMethodId;
	}
	public void setPaymentMethodId(String paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}
	public String getBillCycle() {
		return billCycle;
	}
	public void setBillCycle(String billCycle) {
		this.billCycle = billCycle;
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
	public CRM_QueryCAforAllBillAddr getBillAddr() {
		return BillAddr;
	}
	public void setBillAddr(CRM_QueryCAforAllBillAddr billAddr) {
		BillAddr = billAddr;
	}
	public CRM_QueryCAforAllAsset getAsset() {
		return Asset;
	}
	public void setAsset(CRM_QueryCAforAllAsset asset) {
		Asset = asset;
	}
	
	
}
