package com.nt.th.esb.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.nt.th.esb.constant.ESBServiceRepository;
import com.nt.th.esb.constant.HTTPContant;
import com.nt.th.esb.constant.WSConstant;
import com.nt.th.esb.request.dto.CRM_AssetQueryForScomMessageReqDto;
import com.nt.th.esb.request.dto.CRM_AssetQueryForScomMessageReqMsg;
import com.nt.th.esb.request.dto.CRM_QueryCAforAllMessageReqDto;
import com.nt.th.esb.request.dto.CRM_QueryCAforAllMessageReqMsg;
import com.nt.th.esb.response.dto.CRM_AssetQueryForScomResponse;
import com.nt.th.esb.response.dto.CRM_QueryCAforAllMessageDto;
import com.nt.th.esb.response.dto.CRM_QueryCAforAllResponse;
import com.nt.th.esb.response.dto.ContextIntegrator;
import com.nt.th.esb.response.dto.IntegrationResult;
import com.nt.th.esb.response.dto.Message;
import com.nt.th.esb.soap.helper.ESBCommonServiceBean;
import com.nt.th.esb.utilities.DateUtil;
import com.nt.th.esb.utilities.LogUtil;
import com.nt.th.esb.utilities.ValidateParamMessageUtil;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class ESBCommonImpl implements ESBCommon {
	private static Logger log = LogManager.getLogger();
	private ESBCommonServiceBean helper = new ESBCommonServiceBean();	
	private LogUtil logDetail = new LogUtil();
	private String transectionId = null;	
	private Gson gson = new Gson();
	
	@Override
	public CRM_QueryCAforAllResponse CRM_QueryCAForAll(CRM_QueryCAforAllMessageReqMsg msgReq) throws Exception {
			
		log.debug(WSConstant.START_CALL_SERVICE.concat(ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL));
		log.debug(WSConstant.MESSAGE_INCOMMING);

		//Gen SSID
		transectionId = DateUtil.genSSID();

		CRM_QueryCAforAllMessageReqDto msgReqDto = msgReq.getBody();

		//RQIN
		logDetail.getLogDetail_RQIN(transectionId, ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL, gson.toJson(msgReq), HTTPContant.SOAP);

		log.debug(WSConstant.VALIDATE_MESSAGE);
		msgReqDto = ValidateParamMessageUtil.CRM_QueryCAforAll(msgReqDto);

		ContextIntegrator con = null;
		Message msg = null;
		IntegrationResult in = null;
		
		// Message Response Service
		CRM_QueryCAforAllResponse resMsg = new CRM_QueryCAforAllResponse();
		
		CRM_QueryCAforAllMessageDto msgDto = new CRM_QueryCAforAllMessageDto();

		try{
			
			//Call Service Helper
			resMsg = helper.CRM_QueryCAForAll(msgReqDto, transectionId, HTTPContant.SOAP);

			//RSOU
			logDetail.getLogDetail_RSOU(transectionId, ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL, gson.toJson(resMsg), HTTPContant.SOAP);

			con = new ContextIntegrator();
			msg = new Message();
			in = new IntegrationResult();
								
			in.setResult(true);
			in.setEsbReturnCode(WSConstant.SUCCESS_CODE);
			in.setEsbReturnMsg(WSConstant.SUCCESS_DES);
			in.setDestinationReturnCode(WSConstant.SUCCESS_CODE);
			in.setDestinationReturnMsg(WSConstant.SUCCESS_DES);
			
			msg.setIntegrationResult(in);
			con.setMessage(msg);
			
			resMsg.setContextIntegrator(con);
			resMsg.setBody(msgDto);
			
			log.debug(WSConstant.END_CALL_SERVICE.concat(ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL));
			
			return resMsg;	

		}catch (Exception e) {
			log.error(WSConstant.EXCEPTION_SERVICE.concat(ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL));
			log.debug(WSConstant.END_CALL_SERVICE.concat(ESBServiceRepository.WS_CRM_QUERY_CA_FOR_ALL));

			con = new ContextIntegrator();
			msg = new Message();
			in = new IntegrationResult();
								
			in.setResult(false);
			in.setEsbReturnCode(WSConstant.ERROR_CODE);
			in.setEsbReturnMsg(WSConstant.ERROR_DES);						
			in.setDestinationReturnCode(WSConstant.ERROR_CODE);
			in.setDestinationReturnMsg(WSConstant.ERROR_DES);
			
			msg.setIntegrationResult(in);
			con.setMessage(msg);
			
			resMsg.setContextIntegrator(con);
			return resMsg;	
		}		
	}

	@Override
	public CRM_AssetQueryForScomResponse CRM_AssetQueryForScom(CRM_AssetQueryForScomMessageReqMsg msgReq) throws Exception {
		
		log.debug(WSConstant.START_CALL_SERVICE.concat(ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM));
		log.debug(WSConstant.MESSAGE_INCOMMING);

		//Gen SSID
		transectionId = DateUtil.genSSID();

		CRM_AssetQueryForScomMessageReqDto msgReqDto = msgReq.getBody();

		//RQIN
		logDetail.getLogDetail_RQIN(transectionId, ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM, gson.toJson(msgReq), HTTPContant.SOAP);

		log.debug(WSConstant.VALIDATE_MESSAGE);
		msgReqDto = ValidateParamMessageUtil.CRM_AssetQueryForScom(msgReqDto);

		ContextIntegrator con = null;
		Message msg = null;
		IntegrationResult in = null;
		
		// Message Response Service
		CRM_AssetQueryForScomResponse resMsg = new CRM_AssetQueryForScomResponse();

		try{
			
			//Call Service Helper
			resMsg = helper.CRM_AssetQueryForScom(msgReqDto, transectionId, HTTPContant.SOAP);

			//RSOU
			logDetail.getLogDetail_RSOU(transectionId, ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM, gson.toJson(resMsg), HTTPContant.SOAP);

			
			return resMsg;	

		}catch (Exception e) {
			log.error(WSConstant.EXCEPTION_SERVICE.concat(ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM));
			log.debug(WSConstant.END_CALL_SERVICE.concat(ESBServiceRepository.WS_CRM_ASSET_QUERY_FOR_SCOM));

			con = new ContextIntegrator();
			msg = new Message();
			in = new IntegrationResult();
								
			in.setResult(false);
			in.setEsbReturnCode(WSConstant.ERROR_CODE);
			in.setEsbReturnMsg(WSConstant.ERROR_DES);						
			in.setDestinationReturnCode(WSConstant.ERROR_CODE);
			in.setDestinationReturnMsg(WSConstant.ERROR_DES);
			
			msg.setIntegrationResult(in);
			con.setMessage(msg);
			
			resMsg.setContextIntegrator(con);
			return resMsg;	
		}		
	}

}
