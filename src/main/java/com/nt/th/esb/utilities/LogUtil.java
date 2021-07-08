package com.nt.th.esb.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class LogUtil {
	private static Logger log = LogManager.getLogger();
	
	public void getLogDetail_RQIN(String transectionId, String serviceName, String messages, String protocol){
		try {
			StringBuilder logDetail = new StringBuilder();
			logDetail.append(DateUtil.getDateTimeCurrent()).append("|");
			logDetail.append(IPConfigUtil.getClientIp()).append("|");
			logDetail.append(protocol).append("|");
			logDetail.append("RQIN").append("|");
			logDetail.append(serviceName).append("|");
			logDetail.append("SSID="+transectionId).append("|");
			logDetail.append("DATA="+messages.trim()).append("|");

			log.info(logDetail.toString());
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	public void getLogDetail_RQOU(String transectionId, String serviceName, String messages, String endpointName, String protocol){
		try {
			StringBuilder logDetail = new StringBuilder();
			logDetail.append(DateUtil.getDateTimeCurrent()).append("|");
			logDetail.append(IPConfigUtil.getClientIp()).append("|");
			logDetail.append(protocol).append("|");
			logDetail.append("RQOU").append("|");
			logDetail.append(serviceName).append("|");
			logDetail.append("SSID="+transectionId).append("|");
			logDetail.append("ENDPOINT="+endpointName).append("|");
			logDetail.append("DATA="+messages.trim()).append("|");

			log.info(logDetail.toString());
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	public void getLogDetail_RSIN(String transectionId, String serviceName, String messages, String endpointName, String protocol){
		try {
			StringBuilder logDetail = new StringBuilder();
			logDetail.append(DateUtil.getDateTimeCurrent()).append("|");
			logDetail.append(IPConfigUtil.getClientIp()).append("|");
			logDetail.append(protocol).append("|");
			logDetail.append("RSIN").append("|");
			logDetail.append(serviceName).append("|");
			logDetail.append("SSID="+transectionId).append("|");
			logDetail.append("ENDPOINT="+endpointName).append("|");
			logDetail.append("DATA="+messages.trim()).append("|");

			log.info(logDetail.toString());
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	public void getLogDetail_RSOU(String transectionId, String serviceName, String messages, String protocol){
		try {
			StringBuilder logDetail = new StringBuilder();
			logDetail.append(DateUtil.getDateTimeCurrent()).append("|");
			logDetail.append(IPConfigUtil.getClientIp()).append("|");
			logDetail.append(protocol).append("|");
			logDetail.append("RSOU").append("|");
			logDetail.append(serviceName).append("|");
			logDetail.append("SSID="+transectionId).append("|");
			logDetail.append("DATA="+messages.trim()).append("|");

			log.info(logDetail.toString());
		} catch (Exception e) {
			log.error(e);
		}
	}
}
