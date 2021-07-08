package com.nt.th.esb.utilities;

import javax.servlet.http.HttpServletRequest;

import org.apache.cxf.message.Message;
import org.apache.cxf.phase.PhaseInterceptorChain;
import org.apache.cxf.transport.http.AbstractHTTPDestination;

public class IPConfigUtil {

	public static String getClientIp() {
		try{			
			Message message = PhaseInterceptorChain.getCurrentMessage();
		    HttpServletRequest request = (HttpServletRequest)message.get(AbstractHTTPDestination.HTTP_REQUEST);
		    String result = request.getRemoteAddr();
			return result;
		} catch(Exception e){
			return null;
		}
	}
	
} 

