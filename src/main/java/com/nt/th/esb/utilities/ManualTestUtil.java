package com.nt.th.esb.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.nt.th.esb.controllers.ESBCommonImpl;
import com.nt.th.esb.request.dto.CRM_AssetQueryForScomMessageReqDto;
import com.nt.th.esb.request.dto.CRM_AssetQueryForScomMessageReqMsg;
import com.nt.th.esb.response.dto.CRM_AssetQueryForScomResponse;

/**
 * Created by Kritsana J. on 23/03/2564.
 */	
public class ManualTestUtil {
	private static Logger log = LogManager.getLogger();
	
	public static void main(String[] args) throws Exception {
		CRM_AssetQueryForScom();word();
		
	}
	
	private static void word() {
		System.out.println("------------------------------------------------------------------");
	}
	
	public static void CRM_AssetQueryForScom() throws Exception {
		
		CRM_AssetQueryForScomMessageReqDto msgReqDto = new CRM_AssetQueryForScomMessageReqDto();
		msgReqDto.setTelephoneNumber("042514073");
		
		CRM_AssetQueryForScomMessageReqMsg msgReq = new CRM_AssetQueryForScomMessageReqMsg();
		msgReq.setBody(msgReqDto);
		
		ESBCommonImpl impl = new ESBCommonImpl();
		CRM_AssetQueryForScomResponse res = impl.CRM_AssetQueryForScom(msgReq);

//		System.out.println(new Gson().toJson(res));	

	}

}
