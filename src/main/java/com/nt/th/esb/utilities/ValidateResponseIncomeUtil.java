package com.nt.th.esb.utilities;

import com.nt.th.esb.transform.CRM_AssetQueryForScomResponse;
import com.nt.th.esb.transform.CRM_AssetQueryForScomResult;
import com.nt.th.esb.transform.CRM_AssetQueryForScom_RowSet;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class ValidateResponseIncomeUtil {
	
	public static com.nt.th.esb.response.dto.CRM_AssetQueryForScomResult CRM_AssetQueryForScom(CRM_AssetQueryForScomResponse resIn) throws Exception {
		
		CRM_AssetQueryForScomResult crm_AssetQueryForScomResult = resIn.getInquiryCAResult();				
		CRM_AssetQueryForScom_RowSet rowset = crm_AssetQueryForScomResult.getRowSet();
		
		com.nt.th.esb.response.dto.CRM_AssetQueryForScomResult result = new com.nt.th.esb.response.dto.CRM_AssetQueryForScomResult();
		
		
		if(null != resIn) {
			if(null != crm_AssetQueryForScomResult){
				if(null != rowset){

					//Telephone
					if(StringUtil.isNotBlank(rowset.getBA().getAsset().getAsset_No())){
						result.setTelephone(rowset.getBA().getAsset().getAsset_No());

					}else{
						result.setTelephone("");
					}
					
					//PhoneStatus
					if(StringUtil.isNotBlank(rowset.getBA().getAsset().getAsset_Status())){
						result.setPhoneStatus(rowset.getBA().getAsset().getAsset_Status());

					}else{
						result.setPhoneStatus("");
					}

					//Asset_StartDate
					if(StringUtil.isNotBlank(rowset.getBA().getAsset().getAsset_StartDate())) {
						result.setStartDate(rowset.getBA().getAsset().getAsset_StartDate());
					}else {
						result.setStartDate("");
					}

					//Asset_EndDate
					if(StringUtil.isNotBlank(rowset.getBA().getAsset().getAsset_EndDate())) {
						result.setEndDate(rowset.getBA().getAsset().getAsset_EndDate());
					}else {
						result.setEndDate("");
					}
					
					//RowSet[1]/ns2:BA[1]	
					
					//BillingAccount
					if(StringUtil.isNotBlank(rowset.getBA().getBA_ID())){
						result.setBillingAccount(rowset.getBA().getBA_ID());

					}else{
						result.setBillingAccount("");
					}
					
					//BillPeriod
					if(StringUtil.isNotBlank(rowset.getBA().getBA_ID())){
						result.setBillPeriod(rowset.getBA().getBA_BillCycle());

					}else{
						result.setBillPeriod("");
					}
					
					//PaymentMethod
					if(StringUtil.isNotBlank(rowset.getBA().getBA_PaymentMethod())){
						result.setPaymentMethod(rowset.getBA().getBA_PaymentMethod());

					}else{
						result.setPaymentMethod("");
					}
					
					//CommercialName
					if(StringUtil.isNotBlank(rowset.getBA().getBA_CommOffName())){
						result.setCommercialName(rowset.getBA().getBA_CommOffName());

					}else{
						result.setCommercialName("");
					}
					
					//CommercialId
					if(StringUtil.isNotBlank(rowset.getBA().getBA_CommOffCode())){
						result.setCommercialId(rowset.getBA().getBA_CommOffCode());

					}else{
						result.setCommercialId("");
					}
					
					//Id
					if(StringUtil.isNotBlank(rowset.getCA_CitizenID())){
						result.setId(rowset.getCA_CitizenID());

					}else{
						result.setId("");
					}
					
					//AccountType
					if(StringUtil.isNotBlank(rowset.getCusType_Name())){
						result.setAccountType(rowset.getCusType_Name());

					}else{
						result.setAccountType("");
					}
					
					//AccountSubType
					if(StringUtil.isNotBlank(rowset.getCusSubType_Name())){
						result.setAccountSubType(rowset.getCusSubType_Name());

					}else{
						result.setAccountSubType("");
					}
					
					//MarketClass
					if(StringUtil.isNotBlank(rowset.getCA_CustomerClass())){
						result.setMarketClass(rowset.getCA_CustomerClass());

					}else{
						result.setMarketClass("");
					}
					
					//ProductId
					if(StringUtil.isNotBlank(rowset.getBA().getAsset().getAssetAttr().getProduct_ID())){
						result.setProductId(rowset.getBA().getAsset().getAssetAttr().getProduct_ID());

					}else{
						result.setProductId("");
					}
					
					//ProductName
					if(StringUtil.isNotBlank(rowset.getBA().getAsset().getAssetAttr().getProduct_Name())){
						result.setProductName(rowset.getBA().getAsset().getAssetAttr().getProduct_Name());

					}else{
						result.setProductName("");
					}
					
					//FullName
					if(StringUtil.isNotBlank(rowset.getBA().getBA_FullName())){
						result.setFullName(rowset.getBA().getBA_FullName());

					}else{
						result.setFullName("");
					}
					
					//Title
					if(StringUtil.isNotBlank(rowset.getBA().getBA_Title()) && StringUtil.isNotBlank(rowset.getBA().getBA_OrgTitle())){
						result.setTitle(rowset.getBA().getBA_Title().concat(rowset.getBA().getBA_OrgTitle()));

					}else{
						
						if(StringUtil.isNotBlank(rowset.getBA().getBA_Title())) {
							result.setTitle(rowset.getBA().getBA_Title());
							
						}else if(StringUtil.isNotBlank(rowset.getBA().getBA_OrgTitle())) {
							result.setTitle(rowset.getBA().getBA_OrgTitle());
							
						}else {
							result.setTitle("");
						}						
					}
					
					//FirstName
					if(StringUtil.isNotBlank(rowset.getBA().getBA_FirstName()) && StringUtil.isNotBlank(rowset.getBA().getBA_OrgName())){
						result.setFirstName(rowset.getBA().getBA_FirstName().concat(rowset.getBA().getBA_OrgName()));

					}else{
						
						if(StringUtil.isNotBlank(rowset.getBA().getBA_FirstName())) {
							result.setFirstName(rowset.getBA().getBA_FirstName());
							
						}else if(StringUtil.isNotBlank(rowset.getBA().getBA_OrgName())) {
							result.setFirstName(rowset.getBA().getBA_OrgName());
							
						}else {
							result.setFirstName("");
						}						
					}
					
					//LastName
					if(StringUtil.isNotBlank(rowset.getBA().getBA_LastName())){
						result.setLastName(rowset.getBA().getBA_LastName());

					}else{
						result.setLastName("");
					}
					
					
					String	BillAddr_Number = rowset.getBA().getBillAddr().getBillAddr_Number();
					String	BillAddr_Moo = 	rowset.getBA().getBillAddr().getBillAddr_Moo();
					String	BillAddr_Village = rowset.getBA().getBillAddr().getBillAddr_Village();
					String	BillAddr_Soi = 	rowset.getBA().getBillAddr().getBillAddr_Soi();
					String	BillAddr_Road = rowset.getBA().getBillAddr().getBillAddr_Road();
					String	BillAddr_SubDistrict_Name = rowset.getBA().getBillAddr().getBillAddr_SubDistrict_Name();
					String	BillAddr_District_Name = rowset.getBA().getBillAddr().getBillAddr_District_Name();
					String	BillAddr_Province_Name = rowset.getBA().getBillAddr().getBillAddr_Province_Name();

					
					//BillAddr_Number
					if(!StringUtil.isNotBlank(BillAddr_Number)){
						BillAddr_Number = "";

					}
					
					//BillAddr_Moo
					if(!StringUtil.isNotBlank(BillAddr_Moo)){
						BillAddr_Moo = "";

					}
					
					//BillAddr_Village
					if(!StringUtil.isNotBlank(BillAddr_Village)){
						BillAddr_Village = "";

					}
					
					//BillAddr_Soi
					if(!StringUtil.isNotBlank(BillAddr_Soi)){
						BillAddr_Soi = "";

					}
					
					//BillAddr_Road
					if(!StringUtil.isNotBlank(BillAddr_Road)){
						BillAddr_Road = "";

					}
					
					//BillAddr_SubDistrict_Name
					if(!StringUtil.isNotBlank(BillAddr_SubDistrict_Name)){
						BillAddr_SubDistrict_Name = "";

					}
					
					//BillAddr_District_Name
					if(!StringUtil.isNotBlank(BillAddr_District_Name)){
						BillAddr_District_Name = "";

					}
					
					//BillAddr_Province_Name
					if(!StringUtil.isNotBlank(BillAddr_Province_Name)){
						BillAddr_Province_Name = "";

					}
										
					StringBuilder addrbill = new StringBuilder();					
					addrbill.append(BillAddr_Number);
					addrbill.append(" ");
					addrbill.append(BillAddr_Moo);
					addrbill.append(" ");
					addrbill.append(BillAddr_Village);
					addrbill.append(" ");
					addrbill.append(BillAddr_Soi);
					addrbill.append(" ");
					addrbill.append(BillAddr_Road);
					addrbill.append(" ");
					addrbill.append(BillAddr_SubDistrict_Name);
					addrbill.append(" ");
					addrbill.append(BillAddr_District_Name);
					addrbill.append(" ");
					addrbill.append(BillAddr_Province_Name);

					if(StringUtil.isNotBlank(addrbill.toString())){
						result.setAddrBill(addrbill.toString());

					}else{
						result.setAddrBill("");
					}
					
					//TumbonBill
					if(StringUtil.isNotBlank(rowset.getBA().getBillAddr().getBillAddr_SubDistrict_Name())){
						result.setTumbonBill(rowset.getBA().getBillAddr().getBillAddr_SubDistrict_Name());

					}else{
						result.setTumbonBill("");
					}
					
					//AmphurBill
					if(StringUtil.isNotBlank(rowset.getBA().getBillAddr().getBillAddr_District_Name())){
						result.setAmphurBill(rowset.getBA().getBillAddr().getBillAddr_District_Name());

					}else{
						result.setAmphurBill("");
					}
					
					//ProvinceBill
					if(StringUtil.isNotBlank(rowset.getBA().getBillAddr().getBillAddr_Province_Name())){
						result.setProvinceBill(rowset.getBA().getBillAddr().getBillAddr_Province_Name());

					}else{
						result.setProvinceBill("");
					}
					
					//ZipBill
					if(StringUtil.isNotBlank(rowset.getBA().getBillAddr().getBillAddr_Addr_ZipCode())){
						result.setZipBill(rowset.getBA().getBillAddr().getBillAddr_Addr_ZipCode());

					}else{
						result.setZipBill("");
					}

					String	InstAddr_Number = rowset.getBA().getAsset().getAssetAttr().getInstAddr().getInstAddr_Number();
					String	InstAddr_Moo = rowset.getBA().getAsset().getAssetAttr().getInstAddr().getInstAddr_Moo();
					String	InstAddr_Village = rowset.getBA().getAsset().getAssetAttr().getInstAddr().getInstAddr_Village();
					String	InstAddr_Soi = rowset.getBA().getAsset().getAssetAttr().getInstAddr().getInstAddr_Soi();
					String	InstAddr_Road = rowset.getBA().getAsset().getAssetAttr().getInstAddr().getInstAddr_Road();
					String	InstAddr_SubDistrict_Name = rowset.getBA().getAsset().getAssetAttr().getInstAddr().getInstAddr_SubDistrict_Name();
					String	InstAddr_District_Name = rowset.getBA().getAsset().getAssetAttr().getInstAddr().getInstAddr_District_Name();
					String	InstAddr_Province_Name = rowset.getBA().getAsset().getAssetAttr().getInstAddr().getInstAddr_Province_Name();

					//InstAddr_Number
					if(!StringUtil.isNotBlank(InstAddr_Number)){
						InstAddr_Number = "";
					}
					
					//InstAddr_Moo
					if(!StringUtil.isNotBlank(InstAddr_Moo)){
						InstAddr_Moo = "";
					}
					
					//InstAddr_Village
					if(!StringUtil.isNotBlank(InstAddr_Village)){
						InstAddr_Village = "";
					}
					
					//InstAddr_Soi
					if(!StringUtil.isNotBlank(InstAddr_Soi)){
						InstAddr_Soi = "";
					}
					
					//InstAddr_Road
					if(!StringUtil.isNotBlank(InstAddr_Road)){
						InstAddr_Road = "";
					}
					
					//InstAddr_SubDistrict_Name
					if(!StringUtil.isNotBlank(InstAddr_SubDistrict_Name)){
						InstAddr_SubDistrict_Name = "";
					}
					
					//InstAddr_District_Name
					if(!StringUtil.isNotBlank(InstAddr_District_Name)){
						InstAddr_District_Name = "";
					}
					
					//InstAddr_Province_Name
					if(!StringUtil.isNotBlank(InstAddr_Province_Name)){
						InstAddr_Province_Name = "";
					}
					

					StringBuilder addrAsset = new StringBuilder();
					addrAsset.append(InstAddr_Number);
					addrAsset.append(" ");
					addrAsset.append(InstAddr_Moo);
					addrAsset.append(" ");
					addrAsset.append(InstAddr_Village);
					addrAsset.append(" ");
					addrAsset.append(InstAddr_Soi);
					addrAsset.append(" ");
					addrAsset.append(InstAddr_Road);
					addrAsset.append(" ");
					addrAsset.append(InstAddr_SubDistrict_Name);
					addrAsset.append(" ");
					addrAsset.append(InstAddr_District_Name);
					addrAsset.append(" ");
					addrAsset.append(InstAddr_Province_Name);

					if(StringUtil.isNotBlank(addrAsset.toString())){
						result.setAddrAsset(addrAsset.toString());

					}else{
						result.setAddrAsset("");
					}

					//TumbonAsset
					if(StringUtil.isNotBlank(rowset.getBA().getAsset().getAssetAttr().getInstAddr().getInstAddr_SubDistrict_Name())){
						result.setTumbonAsset(rowset.getBA().getAsset().getAssetAttr().getInstAddr().getInstAddr_SubDistrict_Name());

					}else{
						result.setTumbonAsset("");
					}
					
					//AmphurAsset
					if(StringUtil.isNotBlank(rowset.getBA().getAsset().getAssetAttr().getInstAddr().getInstAddr_District_Name())){
						result.setAmphurAsset(rowset.getBA().getAsset().getAssetAttr().getInstAddr().getInstAddr_District_Name());

					}else{
						result.setAmphurAsset("");
					}
					
					//ProvinceAsset
					if(StringUtil.isNotBlank(rowset.getBA().getAsset().getAssetAttr().getInstAddr().getInstAddr_Province_Name())){
						result.setProvinceAsset(rowset.getBA().getAsset().getAssetAttr().getInstAddr().getInstAddr_Province_Name());

					}else{
						result.setProvinceAsset("");
					}
					
					//ZipAsset
					if(StringUtil.isNotBlank(rowset.getBA().getAsset().getAssetAttr().getInstAddr().getInstAddr_Addr_ZipCode())){
						result.setZipAsset(rowset.getBA().getAsset().getAssetAttr().getInstAddr().getInstAddr_Addr_ZipCode());

					}else{
						result.setZipAsset("");
					}
					
					//ContactName
					if(StringUtil.isNotBlank(rowset.getContact_Title()) && StringUtil.isNotBlank(rowset.getContact_Firstname()) && StringUtil.isNotBlank(rowset.getContact_Lastname())){
						result.setContactName(rowset.getContact_Title().concat(" ").concat(rowset.getContact_Firstname().concat(" ").concat(rowset.getContact_Lastname())));

					}else{
						
						String Contact_Title = "";
						String Contact_Firstname = "";
						String Contact_Lastname = "";
						
						if(StringUtil.isNotBlank(rowset.getContact_Title())) {
							Contact_Title = rowset.getContact_Title();							
						}else {
							Contact_Title = "";
						}	

						if(StringUtil.isNotBlank(rowset.getContact_Firstname())) {
							Contact_Firstname = rowset.getContact_Firstname();							
						}else {
							Contact_Firstname = "";
						}	

						if(StringUtil.isNotBlank(rowset.getContact_Lastname())) {
							Contact_Lastname = rowset.getContact_Lastname();							
						}else {
							Contact_Lastname = "";
						}
						
						result.setContactName(Contact_Title.concat(" ").concat(Contact_Firstname.concat(" ").concat(Contact_Lastname)));
						
					}
					
					//ContactNumber
					if(StringUtil.isNotBlank(rowset.getCA_PhoneNo())){
						result.setContactNumber(rowset.getCA_PhoneNo());

					}else{
						result.setContactNumber("");
					}
					
					//LegalAddr_Detail
					if(StringUtil.isNotBlank(rowset.getLegalAddr().getAddr_Detail())){
						result.setLegalAddr_Detail(rowset.getLegalAddr().getAddr_Detail());

					}else{
						result.setLegalAddr_Detail("");
					}
					
					//BillAddr_Detail
					if(StringUtil.isNotBlank(rowset.getBA().getBillAddr().getBillAddr_Detail())){
						result.setBillAddr_Detail(rowset.getBA().getBillAddr().getBillAddr_Detail());

					}else{
						result.setBillAddr_Detail("");
					}
					
					//InstAddrDetail
					if(StringUtil.isNotBlank(rowset.getBA().getAsset().getAssetAttr().getInstAddr().getInstAddr_Detail())){
						result.setInstAddrDetail(rowset.getBA().getAsset().getAssetAttr().getInstAddr().getInstAddr_Detail());

					}else{
						result.setInstAddrDetail("");
					}
					
					//CaId
					if(StringUtil.isNotBlank(rowset.getCA_ID())){
						result.setCaId(rowset.getCA_ID());

					}else{
						result.setCaId("");
					}
					
					//CA_MobileNo1
					if(StringUtil.isNotBlank(rowset.getCA_MobileNo1())){
						result.setCA_MobileNo1(rowset.getCA_MobileNo1());

					}else{
						result.setCA_MobileNo1("");
					}
					
					//CA_MobileNo2
					if(StringUtil.isNotBlank(rowset.getCA_MobileNo2())){
						result.setCA_MobileNo2(rowset.getCA_MobileNo2());

					}else{
						result.setCA_MobileNo2("");
					}
					
					//TelephoneExtensionNo
					if(StringUtil.isNotBlank(rowset.getCA_PhoneExtNo())){
						result.setTelephoneExtensionNo(rowset.getCA_PhoneExtNo());

					}else{
						result.setTelephoneExtensionNo("");
					}
					
					//FaxNo
					if(StringUtil.isNotBlank(rowset.getCA_FaxNo())){
						result.setFaxNo(rowset.getCA_FaxNo());

					}else{
						result.setFaxNo("");
					}
					
					//CA_FaxNoExt
					if(StringUtil.isNotBlank(rowset.getCA_FaxNoExt())){
						result.setCA_FaxNoExt(rowset.getCA_FaxNoExt());

					}else{
						result.setCA_FaxNoExt("");
					}
					
					
					//{
					//	 for $Suspend_Date in $Asset/ns2:Suspend_Date
					//		return
					//	 <ns0:Suspend_Date>{ data($Suspend_Date) }</ns0:Suspend_Date>
					// }

					//Suspend_Date
					if(StringUtil.isNotBlank(rowset.getBA().getAsset().getSuspend_Date())){
						result.setSuspend_Date(rowset.getBA().getAsset().getSuspend_Date());

					}else{
						result.setSuspend_Date("");
					}
					
					//EndSuspend_Date
					if(StringUtil.isNotBlank(rowset.getBA().getAsset().getEndSuspend_Date())){
						result.setEndSuspend_Date(rowset.getBA().getAsset().getEndSuspend_Date());

					}else{
						result.setEndSuspend_Date("");
					}
					
					//Resume_Date
					if(StringUtil.isNotBlank(rowset.getBA().getAsset().getResume_Date())){
						result.setResume_Date(rowset.getBA().getAsset().getResume_Date());

					}else{
						result.setResume_Date("");
					}	
					
					
					//Project_Code
					if(StringUtil.isNotBlank(rowset.getBA().getAsset().getProject_Code())){
						result.setProject_Code(rowset.getBA().getAsset().getProject_Code());

					}else{
						result.setProject_Code("");
					}
					
					//Project_Name
					if(StringUtil.isNotBlank(rowset.getBA().getAsset().getProject_Name())){
						result.setProject_Name(rowset.getBA().getAsset().getProject_Name());

					}else{
						result.setProject_Name("");
					}	
					
					//Project_Penalty_Hr
					if(StringUtil.isNotBlank(rowset.getBA().getAsset().getProject_Penalty_Hr())){
						result.setProject_Penalty_Hr(rowset.getBA().getAsset().getProject_Penalty_Hr());

					}else{
						result.setProject_Penalty_Hr("");
					}	
					
					//Project_Csoc
					if(StringUtil.isNotBlank(rowset.getBA().getAsset().getProject_Csoc())){
						result.setProject_Csoc(rowset.getBA().getAsset().getProject_Csoc());

					}else{
						result.setProject_Csoc("");
					}	
					
					//SLA_Hr
					if(StringUtil.isNotBlank(rowset.getBA().getAsset().getSLA_Hr())){
						result.setSLA_Hr(rowset.getBA().getAsset().getSLA_Hr());

					}else{
						result.setSLA_Hr("");
					}

				}
			}
		}
		
		
		
		
		
		return result;		
	}

}
