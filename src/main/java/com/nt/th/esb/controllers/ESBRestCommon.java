package com.nt.th.esb.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.nt.th.esb.constant.ESBServiceRepository;
import com.nt.th.esb.constant.HTTPContant;
import com.nt.th.esb.constant.WSConstant;
import com.nt.th.esb.request.dto.CRM_AssetQueryForScomMessageReqDto;
import com.nt.th.esb.request.dto.CRM_AssetQueryForScomMessageReqMsg;
import com.nt.th.esb.request.dto.CRM_QueryCAforAllMessageReqDto;
import com.nt.th.esb.request.dto.CRM_QueryCAforAllMessageReqMsg;
import com.nt.th.esb.response.dto.CRM_AssetQueryForScomResponse;
import com.nt.th.esb.response.dto.CRM_ContextIntegrator;
import com.nt.th.esb.response.dto.CRM_QueryCAforAllResponse;
import com.nt.th.esb.response.dto.ContextIntegrator;
import com.nt.th.esb.soap.helper.ESBCommonServiceBean;
import com.nt.th.esb.utilities.DateUtil;
import com.nt.th.esb.utilities.LogUtil;
import com.nt.th.esb.utilities.StringUtil;
import com.nt.th.esb.utilities.ValidateParamMessageUtil;

/**
 * Created by Kritsana J. on 11/03/2564.
 */	
@RestController
@RequestMapping(path = "/rest/TOTBilling")
public class ESBRestCommon {
	private static Logger log = LogManager.getLogger();
	private ESBCommonServiceBean helper = new ESBCommonServiceBean();
	private LogUtil logDetail = new LogUtil();
	private String transectionId = null;	
	private Gson gson = new Gson();
	
	//Production
	//http://10.0.102.38:8080/ESB2PlusCRM/rest/TOTBilling/CRM_AssetQueryForScom //{"telephoneNumber":"4455J5230"}
	
	//Local Host
	//http://127.0.0.1:90/rest/TOTBilling/CRM_AssetQueryForScom //{"telephoneNumber":"4455J5230"}
	
	@PostMapping(path="/CRM_AssetQueryForScom", produces = "application/json")
	public CRM_AssetQueryForScomResponse CRM_AssetQueryForScom(@RequestBody CRM_AssetQueryForScomMessageReqMsg payload) throws Exception {
		log.debug(WSConstant.START_CALL_SERVICE.concat(ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM));
		log.debug(WSConstant.MESSAGE_INCOMMING);

		//Gen SSID
		transectionId = DateUtil.genSSID();
		
		//Gen Obj to json
		String jsonReq = gson.toJson(payload); 
		
		//Map payload
		//{"contextIntegrator":{"header":{"transactionId":"","integrationKeyRef":""}},"body":{"telephoneNumber":""}}
		if(StringUtil.isJSONValid(jsonReq)) {
		
			//CRM_AssetQueryForScomMessageReqMsg rqin = gson.fromJson(payload, CRM_AssetQueryForScomMessageReqMsg.class);
			String telephoneNumber = payload.getBody().getTelephoneNumber();
			
			CRM_AssetQueryForScomMessageReqDto msgReqDto = new CRM_AssetQueryForScomMessageReqDto(telephoneNumber);
			
			//RQIN
			logDetail.getLogDetail_RQIN(transectionId, ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM, jsonReq, HTTPContant.REST);

			log.debug(WSConstant.VALIDATE_MESSAGE);
			msgReqDto = ValidateParamMessageUtil.CRM_AssetQueryForScom(msgReqDto);
			
			// Message Response Service
			CRM_AssetQueryForScomResponse resMsg = new CRM_AssetQueryForScomResponse();
			
			try {
			
				//Call Service Helper
				resMsg = helper.CRM_AssetQueryForScom(msgReqDto, transectionId, HTTPContant.REST);

				//RSOU
				logDetail.getLogDetail_RSOU(transectionId, ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM, gson.toJson(resMsg), HTTPContant.REST);
				
				return resMsg;	
				
			}catch (Exception e) {
				log.error(WSConstant.EXCEPTION_SERVICE.concat(ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM));
				log.debug(WSConstant.END_CALL_SERVICE.concat(ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM));

				ContextIntegrator con = CRM_ContextIntegrator.setContextIntegrator(false, WSConstant.ERROR_CODE, WSConstant.ERROR_DES
						, WSConstant.ERROR_CODE, WSConstant.ERROR_DES);
				
				resMsg.setContextIntegrator(con);
				
				return resMsg;	
			}		
			
		}else {
			log.error(WSConstant.FORMAT_JSON_FOUND.concat(ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM));
			log.debug(WSConstant.END_CALL_SERVICE.concat(ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM));
			
			// Message Response Service
			CRM_AssetQueryForScomResponse resMsg = new CRM_AssetQueryForScomResponse();
						
			ContextIntegrator con = CRM_ContextIntegrator.setContextIntegrator(false, WSConstant.ERROR_CODE, WSConstant.FORMAT_JSON_FOUND
					, WSConstant.ERROR_CODE, WSConstant.FORMAT_JSON_FOUND);
			
			resMsg.setContextIntegrator(con);
			
			return resMsg;	
			
		}	
	}
	
	@PostMapping(path="/CRM_QueryCAForAll", produces = "application/json")
	public CRM_QueryCAforAllResponse CRM_QueryCAForAll(@RequestBody CRM_QueryCAforAllMessageReqMsg payload) throws Exception {
		log.debug(WSConstant.START_CALL_SERVICE.concat(ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL));
		log.debug(WSConstant.MESSAGE_INCOMMING);

		//Gen SSID
		transectionId = DateUtil.genSSID();

		//Gen Obj to json
		String jsonReq = gson.toJson(payload); 
		
		//Map payload
		if(StringUtil.isJSONValid(jsonReq)) {

			String citizenId = payload.getBody().getCitizenId();
			String registrationID = payload.getBody().getRegistrationID();
			String passportNo = payload.getBody().getPassportNo();
			String cA_TaxID = payload.getBody().getCA_TaxID();
			String assetNo = payload.getBody().getAssetNo();
			String bA_ID = payload.getBody().getBA_ID();
			String cA_ID = payload.getBody().getCA_ID();
			String cA_all = payload.getBody().getCA_all();
			String bA_allStatus = payload.getBody().getBA_allStatus();
			String asset_allStatus = payload.getBody().getAsset_allStatus();
			String bA_Asset_All = payload.getBody().getBA_Asset_All();
			
			CRM_QueryCAforAllMessageReqDto msgReqDto = new CRM_QueryCAforAllMessageReqDto(citizenId, registrationID, passportNo, cA_TaxID,
					assetNo, bA_ID, cA_ID, cA_all, bA_allStatus, asset_allStatus,
					bA_Asset_All);
			
			//RQIN
			logDetail.getLogDetail_RQIN(transectionId, ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL, jsonReq, HTTPContant.REST);

			log.debug(WSConstant.VALIDATE_MESSAGE);
			msgReqDto = ValidateParamMessageUtil.CRM_QueryCAforAll(msgReqDto);
			
			// Message Response Service
			CRM_QueryCAforAllResponse resMsg = new CRM_QueryCAforAllResponse();
			
			try {
			
				//Call Service Helper
				resMsg = helper.CRM_QueryCAForAll(msgReqDto, transectionId, HTTPContant.REST);

				//RSOU
				logDetail.getLogDetail_RSOU(transectionId, ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL, gson.toJson(resMsg), HTTPContant.REST);	
				
				return resMsg;	
				
			}catch (Exception e) {
				log.error(WSConstant.EXCEPTION_SERVICE.concat(ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL));
				log.debug(WSConstant.END_CALL_SERVICE.concat(ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL));

				ContextIntegrator con = CRM_ContextIntegrator.setContextIntegrator(false, WSConstant.ERROR_CODE, WSConstant.ERROR_DES
						, WSConstant.ERROR_CODE, WSConstant.ERROR_DES);
				
				resMsg.setContextIntegrator(con);	
				
				return resMsg;	
			}		
			
		}else {
			log.error(WSConstant.FORMAT_JSON_FOUND.concat(ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL));
			log.debug(WSConstant.END_CALL_SERVICE.concat(ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL));
			
			// Message Response Service
			CRM_QueryCAforAllResponse resMsg = new CRM_QueryCAforAllResponse();
			
			ContextIntegrator con = CRM_ContextIntegrator.setContextIntegrator(false, WSConstant.ERROR_CODE, WSConstant.FORMAT_JSON_FOUND
					, WSConstant.ERROR_CODE, WSConstant.FORMAT_JSON_FOUND);
			
			resMsg.setContextIntegrator(con);
			
			return resMsg;	
			
		}	
	}	
}
