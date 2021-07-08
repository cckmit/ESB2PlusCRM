package com.nt.th.esb.utilities;

import com.nt.th.esb.request.dto.CRM_AssetQueryForScomMessageReqDto;
import com.nt.th.esb.request.dto.CRM_QueryCAforAllMessageReqDto;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class ValidateParamMessageUtil {
	
	public static CRM_QueryCAforAllMessageReqDto CRM_QueryCAforAll(CRM_QueryCAforAllMessageReqDto req) throws Exception {
		CRM_QueryCAforAllMessageReqDto msgObj = new CRM_QueryCAforAllMessageReqDto();

		if(StringUtil.isNotBlank(req.getCitizenId())){
			msgObj.setCitizenId(req.getCitizenId());

		}else{
			msgObj.setCitizenId("");
		}

		if(StringUtil.isNotBlank(req.getRegistrationID())){
			msgObj.setRegistrationID(req.getRegistrationID());

		}else{
			msgObj.setRegistrationID("");
		}

		if(StringUtil.isNotBlank(req.getPassportNo())){
			msgObj.setPassportNo(req.getPassportNo());

		}else{
			msgObj.setPassportNo("");
		}

		if(StringUtil.isNotBlank(req.getCA_TaxID())){
			msgObj.setCA_TaxID(req.getCA_TaxID());

		}else{
			msgObj.setCA_TaxID("");
		}

		if(StringUtil.isNotBlank(req.getAssetNo())){
			msgObj.setAssetNo(req.getAssetNo());

		}else{
			msgObj.setAssetNo("");
		}

		if(StringUtil.isNotBlank(req.getBA_ID())){
			msgObj.setBA_ID(req.getBA_ID());

		}else{
			msgObj.setBA_ID("");
		}

		if(StringUtil.isNotBlank(req.getCA_ID())){
			msgObj.setCA_ID(req.getCA_ID());

		}else{
			msgObj.setCA_ID("");
		}

		if(StringUtil.isNotBlank(req.getCA_all())){
			msgObj.setCA_all(req.getCA_all());

		}else{
			msgObj.setCA_all("");
		}

		if(StringUtil.isNotBlank(req.getBA_allStatus())){
			msgObj.setBA_allStatus(req.getBA_allStatus());

		}else{
			msgObj.setBA_allStatus("");
		}

		if(StringUtil.isNotBlank(req.getAsset_allStatus())){
			msgObj.setAsset_allStatus(req.getAsset_allStatus());

		}else{
			msgObj.setAsset_allStatus("");
		}

		if(StringUtil.isNotBlank(req.getBA_Asset_All())){
			msgObj.setBA_Asset_All(req.getBA_Asset_All());

		}else{
			msgObj.setBA_Asset_All("");
		}

		return msgObj;			
	}
	
	
	public static CRM_AssetQueryForScomMessageReqDto CRM_AssetQueryForScom(CRM_AssetQueryForScomMessageReqDto req) throws Exception {
		CRM_AssetQueryForScomMessageReqDto msgObj = new CRM_AssetQueryForScomMessageReqDto();

		if(StringUtil.isNotBlank(req.getTelephoneNumber())){
			msgObj.setTelephoneNumber(req.getTelephoneNumber());

		}else{
			msgObj.setTelephoneNumber("");
		}
		
		return msgObj;
	}
	
	
}
