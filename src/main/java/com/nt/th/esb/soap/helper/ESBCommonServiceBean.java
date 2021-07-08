package com.nt.th.esb.soap.helper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.nt.th.esb.constant.ESBServiceRepository;
import com.nt.th.esb.constant.HTTPContant;
import com.nt.th.esb.constant.WSConstant;
import com.nt.th.esb.message.MessageRequestCRM_Inquiry;
import com.nt.th.esb.message.MessageRequestCRM_InquiryCA;
import com.nt.th.esb.request.dto.CRM_AssetQueryForScomMessageReqDto;
import com.nt.th.esb.request.dto.CRM_QueryCAforAllMessageReqDto;
import com.nt.th.esb.response.dto.CRM_AssetQueryForScomMessageDto;
import com.nt.th.esb.response.dto.CRM_AssetQueryForScomResponse;
import com.nt.th.esb.response.dto.CRM_ContextIntegrator;
import com.nt.th.esb.response.dto.CRM_QueryCAforAllAsset;
import com.nt.th.esb.response.dto.CRM_QueryCAforAllAssetAttr;
import com.nt.th.esb.response.dto.CRM_QueryCAforAllBA;
import com.nt.th.esb.response.dto.CRM_QueryCAforAllBillAddr;
import com.nt.th.esb.response.dto.CRM_QueryCAforAllCA;
import com.nt.th.esb.response.dto.CRM_QueryCAforAllInstAddr;
import com.nt.th.esb.response.dto.CRM_QueryCAforAllLegalAddr;
import com.nt.th.esb.response.dto.CRM_QueryCAforAllMessageDto;
import com.nt.th.esb.response.dto.CRM_QueryCAforAllResponseResult;
import com.nt.th.esb.response.dto.ContextIntegrator;
import com.nt.th.esb.response.dto.ResultRes;
import com.nt.th.esb.transform.CRM_QueryCAforAllResponse;
import com.nt.th.esb.transform.CRM_QueryCAforAllResult;
import com.nt.th.esb.transform.CRM_QueryCAforAll_Asset;
import com.nt.th.esb.transform.CRM_QueryCAforAll_AssetAttr;
import com.nt.th.esb.transform.CRM_QueryCAforAll_BA;
import com.nt.th.esb.transform.CRM_QueryCAforAll_BillAddr;
import com.nt.th.esb.transform.CRM_QueryCAforAll_CA;
import com.nt.th.esb.transform.CRM_QueryCAforAll_InstAddr;
import com.nt.th.esb.transform.CRM_QueryCAforAll_LegalAddr;
import com.nt.th.esb.transform.CRM_QueryCAforAll_ResponseResult;
import com.nt.th.esb.utilities.ConfigPropUtil;
import com.nt.th.esb.utilities.HttpConnectionUtil;
import com.nt.th.esb.utilities.LogUtil;
import com.nt.th.esb.utilities.ParserSoapRawDataUtil;
import com.nt.th.esb.utilities.StringUtil;
import com.nt.th.esb.utilities.ValidateResponseIncomeUtil;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class ESBCommonServiceBean {
	private static Logger log = LogManager.getLogger();
	private LogUtil logDetail = new LogUtil();

	public com.nt.th.esb.response.dto.CRM_QueryCAforAllResponse CRM_QueryCAForAll(CRM_QueryCAforAllMessageReqDto msgReq, String transectionId, String protocol) throws Exception{
		com.nt.th.esb.response.dto.CRM_QueryCAforAllResponse resp = new com.nt.th.esb.response.dto.CRM_QueryCAforAllResponse();
		CRM_QueryCAforAllMessageDto msgDto = new CRM_QueryCAforAllMessageDto();

		log.debug(WSConstant.START_SERVICE_HELPER.concat(ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL));
		
		try{

			MessageRequestCRM_Inquiry msg = new MessageRequestCRM_Inquiry();
			
			String URL = "";
			String msgResponse = "";
			int timeout = 0;

			URL = ConfigPropUtil.getConfig("endpoint.service.crm.querycaforall");
			timeout = Integer.parseInt(ConfigPropUtil.getConfig("timeout.service.crm.querycaforall"));
			String req = msg.msgRequestCRM_QueryCAforAll(msgReq);
			URL = StringUtil.isUrlCRM(URL);
			
			//RQOU
			logDetail.getLogDetail_RQOU(transectionId, ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL, req, ESBServiceRepository.WS_CRM_INQUIRY_CRM, protocol);
			
//			HTTP2ConnectionUtil con = new HTTP2ConnectionUtil(URL);
//			msgResponse = con.post(URL, req, timeout);
			
			ResultRes resultRes = HttpConnectionUtil.executePost(URL, req, timeout);
			msgResponse = resultRes.getMessageRes();
			
			if(HTTPContant.OK.equals(resultRes.getStatus())) {
				try{	
					//RSIN
					logDetail.getLogDetail_RSIN(transectionId, ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL, msgResponse, ESBServiceRepository.WS_CRM_INQUIRY_CRM, protocol);
				
					//Parser Message
					CRM_QueryCAforAllResponse crm_QueryCAforAllResponse = ParserSoapRawDataUtil.convertSoapMsgToCRM_QueryCAforAllDto(msgResponse);			
		
					
					//Check null Object
					CRM_QueryCAforAllResult crm_QueryCAforAllResult = crm_QueryCAforAllResponse.getInquiryCRMResult();				
					CRM_QueryCAforAll_ResponseResult responseResult = crm_QueryCAforAllResult.getResponseResult();
					
					
					// ResponseResult
					CRM_QueryCAforAllResponseResult responseResult_Dto = new CRM_QueryCAforAllResponseResult();
					responseResult_Dto.setResponseCode(responseResult.getResponseCode());
					responseResult_Dto.setResponseDatetime(responseResult.getResponseDateTime());
					responseResult_Dto.setResponseDesc(responseResult.getResponseDesc());
					responseResult_Dto.setResponseOk(responseResult.getResponseOK());
					
					// add CRM_QueryCAforAllMessageDto
					msgDto.setResponseResult(responseResult_Dto);
					
					if(null != crm_QueryCAforAllResult.getCA()) {
						
						
						CRM_QueryCAforAll_CA ca = crm_QueryCAforAllResult.getCA();
						
						CRM_QueryCAforAll_LegalAddr legalAddr = ca.getLegalAddr();
						CRM_QueryCAforAll_BA ba = ca.getBA();
						
						CRM_QueryCAforAll_BillAddr billAddr = ba.getBillAddr();
						CRM_QueryCAforAll_Asset asset =  ba.getAsset();
						CRM_QueryCAforAll_AssetAttr assetAttr = asset.getAssetAttr();
						CRM_QueryCAforAll_InstAddr instAddr = assetAttr.getInstAddr();
						
						
						// CA
						CRM_QueryCAforAllCA CA = new CRM_QueryCAforAllCA();
						CA.setCustomerId(ca.getCA_ID());
						CA.setTitle(ca.getContact_Title());
						CA.setFname(ca.getContact_Firstname());
						CA.setLname(ca.getContact_Lastname());
						CA.setCA_Status(ca.getCA_Status());
						CA.setCA_Blacklist(ca.getCA_Blacklist());
						CA.setCustomerTypeCode(ca.getCusType_Code());
						CA.setCustomerTypeName(ca.getCusType_Name());
						CA.setCustomerSubTypeCode(ca.getCusSubType_Code());
						CA.setCustomerSubTypeName(ca.getCusSubType_Name());
						CA.setCustomerClass(ca.getCA_CustomerClass());
						CA.setCompanyTitle(ca.getAccount_Title());
						CA.setCompanyName(ca.getAccount_CompanyName());
						CA.setCompanyBranch(ca.getAccount_Branch());
						CA.setGovernmentCode(ca.getAccount_GOVCode());
						CA.setCreatedDateTime(ca.getCA_CreatedDateTime());
						CA.setEmailAddress(ca.getCA_Email());
						CA.setPassportNo(ca.getCA_PassportNo());
						CA.setRegistrationId(ca.getCA_RegistrationID());
						CA.setCitizenId(ca.getCA_CitizenID());
						//CA.setCA_TaxID( );
						CA.setRootCustomerId(ca.getCA_RootID());
						CA.setParentCustomerId(ca.getCA_ParentID());
						CA.setCA_MobileNo1(ca.getCA_MobileNo1());
						CA.setCA_MobileNo2(ca.getCA_MobileNo2());
						CA.setTelephoneNo(ca.getCA_PhoneNo());
						CA.setTelephoneExtensionNo(ca.getCA_PhoneExtNo());
						CA.setFaxNo(ca.getCA_FaxNo());
										
						// LegalAddr
						CRM_QueryCAforAllLegalAddr LegalAddr = new CRM_QueryCAforAllLegalAddr();
						LegalAddr.setAddr_ID(legalAddr.getAddr_ID());
						LegalAddr.setCode(legalAddr.getAddr_Code());
						LegalAddr.setNo(legalAddr.getAddr_Number());
						LegalAddr.setRoomNo(legalAddr.getAddr_RoomNo());
						LegalAddr.setFloorNo(legalAddr.getAddr_FloorNo());
						LegalAddr.setVillageName(legalAddr.getAddr_Village());
						LegalAddr.setBuildingName(legalAddr.getAddr_Building());
						LegalAddr.setMoo(legalAddr.getAddr_Moo());
						LegalAddr.setSoi(legalAddr.getAddr_Soi());
						LegalAddr.setRoad(legalAddr.getAddr_Road());
						LegalAddr.setSubDistrictName(legalAddr.getSubDistrict_Name());
						
						
						LegalAddr.setDistrictName(legalAddr.getDistrict_Name());
						LegalAddr.setProvinceName(legalAddr.getProvince_Name());
						LegalAddr.setZipcode(legalAddr.getAddr_ZipCode());
						LegalAddr.setCountryName(legalAddr.getCountry_Name());
						
						CA.setLegalAddr(LegalAddr);
						
						// BA
						CRM_QueryCAforAllBA BA = new CRM_QueryCAforAllBA();
						BA.setAccountId(ba.getBA_ID());
						BA.setBA_AccountStatus(ba.getBA_AccountStatus());
						BA.setBA_Writeoff(ba.getBA_Writeoff());
						BA.setPaymentMethodId(ba.getBA_PaymentMethod());
						BA.setBillCycle(ba.getBA_BillCycle());
						BA.setBA_CommOffCode(ba.getBA_CommOffCode());
						BA.setBA_CommOffName(ba.getBA_CommOffName());
						BA.setBA_Title(ba.getBA_Title());
						BA.setBA_FirstName(ba.getBA_FirstName());
						BA.setBA_LastName(ba.getBA_LastName());
						BA.setBA_ContactType(ba.getBA_ContactType());
						BA.setBA_OrgName(ba.getBA_OrgName());
						BA.setBA_BillHanding(ba.getBA_BillHanding());

						CA.setBA(BA);
						
						// BillAddr
						CRM_QueryCAforAllBillAddr billAddr_dto = new CRM_QueryCAforAllBillAddr();
						billAddr_dto.setBillAddr_Detail(billAddr.getBillAddr_Detail());
						billAddr_dto.setBillAddr_Code(billAddr.getBillAddr_Code());
						billAddr_dto.setBillAddr_ID(billAddr.getBillAddr_ID());
						billAddr_dto.setBillAddr_Number(billAddr.getBillAddr_Number());
						billAddr_dto.setBillAddr_RoomNo(billAddr.getBillAddr_RoomNo());
						billAddr_dto.setBillAddr_FloorNo(billAddr.getBillAddr_FloorNo());
						billAddr_dto.setBillAddr_Village(billAddr.getBillAddr_Village());
						billAddr_dto.setBillAddr_Building(billAddr.getBillAddr_Building());
						billAddr_dto.setBillAddr_Moo(billAddr.getBillAddr_Moo());
						billAddr_dto.setBillAddr_Soi(billAddr.getBillAddr_Soi());
						billAddr_dto.setBillAddr_Road(billAddr.getBillAddr_Road());
						billAddr_dto.setBillAddr_SubDistrict_Name(billAddr.getBillAddr_SubDistrict_Name());
						billAddr_dto.setBillAddr_District_Name(billAddr.getBillAddr_District_Name());
						billAddr_dto.setBillAddr_Province_Name(billAddr.getBillAddr_Province_Name());
						billAddr_dto.setBillAddr_Addr_ZipCode(billAddr.getBillAddr_Addr_ZipCode());
						billAddr_dto.setBillAddr_Country_Name(billAddr.getBillAddr_Country_Name());
						
						BA.setBillAddr(billAddr_dto);
						
						// Asset
						CRM_QueryCAforAllAsset asset_dto = new CRM_QueryCAforAllAsset();
						// AssetAttr
						CRM_QueryCAforAllAssetAttr assetAttr_dto = new CRM_QueryCAforAllAssetAttr();
						// InstAddr
						CRM_QueryCAforAllInstAddr instAddr_dto = new CRM_QueryCAforAllInstAddr();
						
						instAddr_dto.setInstAddr_Detail(instAddr.getInstAddr_Detail());
						instAddr_dto.setInstAddr_Number(instAddr.getInstAddr_Number());
						instAddr_dto.setInstAddr_RoomNo(instAddr.getInstAddr_RoomNo());
						instAddr_dto.setInstAddr_FloorNo(instAddr.getInstAddr_FloorNo());
						instAddr_dto.setInstAddr_Village(instAddr.getInstAddr_Village());
						instAddr_dto.setInstAddr_Building(instAddr.getInstAddr_Building());
						instAddr_dto.setInstAddr_Moo(instAddr.getInstAddr_Moo());
						instAddr_dto.setInstAddr_Soi(instAddr.getInstAddr_Soi());
						instAddr_dto.setInstAddr_Road(instAddr.getInstAddr_Road());
						instAddr_dto.setInstAddr_SubDistrict_Name(instAddr.getInstAddr_SubDistrict_Name());
						instAddr_dto.setInstAddr_District_Name(instAddr.getInstAddr_District_Name());
						instAddr_dto.setInstAddr_Province_Name(instAddr.getInstAddr_Province_Name());
						instAddr_dto.setInstAddr_Addr_ZipCode(instAddr.getInstAddr_Addr_ZipCode());
						instAddr_dto.setInstAddr_Country_Name(instAddr.getInstAddr_Country_Name());
						
						assetAttr_dto.setInstAddr(instAddr_dto);		
						assetAttr_dto.setProduct_Name(assetAttr.getProduct_Name());
						assetAttr_dto.setServiceLocation_Name(assetAttr.getServiceLocation_Name());
						assetAttr_dto.setServiceLocation_ID(assetAttr.getServiceLocation_ID());
						
						asset_dto.setAssetAttr(assetAttr_dto);
						asset_dto.setAssetNo(asset.getAsset_No());
						asset_dto.setProductTypeName(asset.getProductType_Name());
						asset_dto.setAsset_Status(asset.getAsset_Status());
						asset_dto.setAsset_StartDate(asset.getAsset_StartDate());
						asset_dto.setAsset_EndDate(asset.getAsset_EndDate());								
						asset_dto.setPackageCode(asset.getPackageCode());
						asset_dto.setPackageName(asset.getPackageName());
						asset_dto.setPackageDesc(asset.getPackageDesc());
						asset_dto.setPackagePrice(asset.getPackagePrice());
						asset_dto.setPackageStartDate(asset.getPackageStartDate());
						asset_dto.setPackageEndDate(asset.getPackageEndDate());
						asset_dto.setSuspend_Date(asset.getSuspend_Date());
						asset_dto.setEndSuspend_Date(asset.getEndSuspend_Date()); 
						asset_dto.setResume_Date(asset.getResume_Date()); 
										
						//asset_dto.setCPE_Brand();
						//asset_dto.setCPE_Model();
						//asset_dto.setCPE_IMEI();
						//asset_dto.setCPE_Serialno();
										
						BA.setAsset(asset_dto);
						
						msgDto.setCA(CA);
						
					}else {						
						return resp;
						
					}
																									
					
				}catch (Exception e) {
					log.error(WSConstant.EXCEPTION_SERVICE.concat(ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL));
					log.debug(WSConstant.END_SERVICE_HELPER.concat(ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL));
					return resp;	
				}
				
				ContextIntegrator con = CRM_ContextIntegrator.setContextIntegrator(true, WSConstant.SUCCESS_CODE, WSConstant.SUCCESS_DES
						, WSConstant.SUCCESS_CODE, WSConstant.SUCCESS_DES);
						
				resp.setContextIntegrator(con);
				resp.setBody(msgDto);
				
			} else {
				
				msgResponse = HTTPContant.CONNECTION_ERROR;
				
				//RSIN
				logDetail.getLogDetail_RSIN(transectionId, ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL, msgResponse, ESBServiceRepository.WS_CRM_INQUIRY_CRM, protocol);
				
				if(HTTPContant.TIMEOUT.equals(resultRes.getStatus())) {					
					ContextIntegrator con = CRM_ContextIntegrator.setContextIntegrator(false, WSConstant.TIMEOUT_CODE, WSConstant.TIMEOUT_DES
							, WSConstant.TIMEOUT_CODE, resultRes.getMessageRes());
							
					resp.setContextIntegrator(con);
					resp.setBody(msgDto);
					
				} else if(HTTPContant.REJECT.equals(resultRes.getStatus())){					
					ContextIntegrator con = CRM_ContextIntegrator.setContextIntegrator(false, WSConstant.REJECT_CODE, WSConstant.REJECT_DES
							, WSConstant.REJECT_CODE, resultRes.getMessageRes());
							
					resp.setContextIntegrator(con);
					resp.setBody(msgDto);
					
				} else {
					ContextIntegrator con = CRM_ContextIntegrator.setContextIntegrator(false, WSConstant.ERROR_CODE, WSConstant.ERROR_DES
							, WSConstant.ERROR_CODE, resultRes.getMessageRes());
							
					resp.setContextIntegrator(con);
					resp.setBody(msgDto);				
				}				
			}

			log.debug(WSConstant.END_SERVICE_HELPER.concat(ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL));

			return resp;	

		}catch (Exception e) {
			log.error(WSConstant.EXCEPTION_SERVICE.concat(ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL));
			log.debug(WSConstant.END_SERVICE_HELPER.concat(ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL));
			return resp;
		}	
	}
	
	public CRM_AssetQueryForScomResponse CRM_AssetQueryForScom(CRM_AssetQueryForScomMessageReqDto msgReq, String transectionId, String protocol) throws Exception{
		CRM_AssetQueryForScomResponse resp = new CRM_AssetQueryForScomResponse();
		CRM_AssetQueryForScomMessageDto msgDto = new CRM_AssetQueryForScomMessageDto();

		log.debug(WSConstant.START_SERVICE_HELPER.concat(ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM));
		
		try{

			MessageRequestCRM_InquiryCA msg = new MessageRequestCRM_InquiryCA();
			
			String URL = "";
			String msgResponse = "";
			int timeout = 0;

			URL = ConfigPropUtil.getConfig("endpoint.service.crm.assetqueryforscom");
			timeout = Integer.parseInt(ConfigPropUtil.getConfig("timeout.service.crm.assetqueryforscom"));
			String req = msg.msgRequestCRM_AssetQueryForScom(msgReq);
			URL = StringUtil.isUrlCRM(URL);
			
			//RQOU
			logDetail.getLogDetail_RQOU(transectionId, ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM, req, ESBServiceRepository.WS_CRM_InquiryCA_CRM, protocol);
			
//			HTTP2ConnectionUtil con = new HTTP2ConnectionUtil(URL);
//			msgResponse = con.post(URL, req, timeout);
			
			ResultRes resultRes = HttpConnectionUtil.executePost(URL, req, timeout);
			msgResponse = resultRes.getMessageRes();
			
			if(HTTPContant.OK.equals(resultRes.getStatus())) {
				
				try{			
					//Parser Message
					com.nt.th.esb.transform.CRM_AssetQueryForScomResponse crm_AssetQueryForScomResponse = ParserSoapRawDataUtil.convertSoapMsgToCRM_AssetQueryForScomDto(msgResponse);											

					//RSIN
					logDetail.getLogDetail_RSIN(transectionId, ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM, msgResponse, ESBServiceRepository.WS_CRM_InquiryCA_CRM, protocol);
					
					// ResponseResult
					com.nt.th.esb.response.dto.CRM_AssetQueryForScomResult result = new com.nt.th.esb.response.dto.CRM_AssetQueryForScomResult();
									
					//Function Validate Response Incoming for Response Outgoing
					result =  ValidateResponseIncomeUtil.CRM_AssetQueryForScom(crm_AssetQueryForScomResponse);
													
					msgDto.setResult(result);
					
					ContextIntegrator con = CRM_ContextIntegrator.setContextIntegrator(true, WSConstant.SUCCESS_CODE, WSConstant.SUCCESS_DES
							, WSConstant.SUCCESS_CODE, WSConstant.SUCCESS_DES);
							
					resp.setContextIntegrator(con);
					resp.setBody(msgDto);
										
				}catch (Exception e) {
					log.error(WSConstant.EXCEPTION_SERVICE.concat(ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM));
					log.debug(WSConstant.END_SERVICE_HELPER.concat(ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM));
					return resp;	
				}
				
			} else {
				
				msgResponse = HTTPContant.CONNECTION_ERROR;
				
				//RSIN
				logDetail.getLogDetail_RSIN(transectionId, ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM, msgResponse, ESBServiceRepository.WS_CRM_InquiryCA_CRM, protocol);
				
				if(HTTPContant.TIMEOUT.equals(resultRes.getStatus())) {					
					ContextIntegrator con = CRM_ContextIntegrator.setContextIntegrator(false, WSConstant.TIMEOUT_CODE, WSConstant.TIMEOUT_DES
							, WSConstant.TIMEOUT_CODE, resultRes.getMessageRes());
							
					resp.setContextIntegrator(con);
					resp.setBody(msgDto);
					
				} else if(HTTPContant.REJECT.equals(resultRes.getStatus())){					
					ContextIntegrator con = CRM_ContextIntegrator.setContextIntegrator(false, WSConstant.REJECT_CODE, WSConstant.REJECT_DES
							, WSConstant.REJECT_CODE, resultRes.getMessageRes());
							
					resp.setContextIntegrator(con);
					resp.setBody(msgDto);
					
				} else {
					ContextIntegrator con = CRM_ContextIntegrator.setContextIntegrator(false, WSConstant.ERROR_CODE, WSConstant.ERROR_DES
							, WSConstant.ERROR_CODE, resultRes.getMessageRes());
							
					resp.setContextIntegrator(con);
					resp.setBody(msgDto);				
				}				
			}

			log.debug(WSConstant.END_SERVICE_HELPER.concat(ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM));

			return resp;	

		}catch (Exception e) {
			log.error(WSConstant.EXCEPTION_SERVICE.concat(ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM));
			log.debug(WSConstant.END_SERVICE_HELPER.concat(ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM));
			return resp;
		}	
	}
	
	
	
}
