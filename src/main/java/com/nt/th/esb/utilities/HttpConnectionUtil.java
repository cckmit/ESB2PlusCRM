package com.nt.th.esb.utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.nt.th.esb.constant.HTTPContant;
import com.nt.th.esb.response.dto.ResultRes;


/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class HttpConnectionUtil {
	private static Logger log = LogManager.getLogger(HttpConnectionUtil.class);

	public static int TIMR_OUT = 0;

	public static ResultRes executePost(String targetURL, String urlParameters, int timeout) {
		HttpURLConnection connection = null;
		ResultRes result = null;
		try {		
			TIMR_OUT = timeout;
			
			//Create connection
			URL url = new URL(targetURL);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod(HTTPContant.POST);
			connection.setRequestProperty(HTTPContant.CONTENT_TYPE, HTTPContant.TEXT_XML);

			connection.setRequestProperty(HTTPContant.CONTENT_LENGTH, 
					Integer.toString(urlParameters.getBytes().length));
			connection.setRequestProperty(HTTPContant.CONTENT_LANGUAGE, HTTPContant.EN_US);  

			connection.setUseCaches(false);
			connection.setDoOutput(true); 

			connection.setConnectTimeout(timeout);
			connection.setReadTimeout(timeout);
			connection.connect();

			//Send request
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(wr, "UTF-8"));
			writer.write(urlParameters);
			writer.close();
			wr.close();

			new Thread(new InterruptThread(connection)).start();
			
			//Connecting.....ServiceEndpoint......  
			InputStream is = connection.getInputStream();			

			//Get Response 
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
			String line;
			while ((line = rd.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}			
			new Thread(new InterruptThread(connection)).stop();
			rd.close();
			
			result = new ResultRes();
			result.setMessageRes(response.toString());
			result.setStatus(HTTPContant.OK);
			
			return result;


		} catch (java.net.SocketTimeoutException e) {
//			log.info("Error SocketTimeoutException :"+e);
			new Thread(new InterruptThread(connection)).stop();
			
			result = new ResultRes();
			result.setMessageRes("Error SocketTimeoutException :"+e);
			result.setStatus(HTTPContant.TIMEOUT);
			
			return result;

		} catch (Exception e) {
//			log.info("Error Exception :"+ e);
			new Thread(new InterruptThread(connection)).stop();
			
			if(HTTPContant.ERROR_CONNECT_SOCKET_EXCEPTION.equalsIgnoreCase(e.toString()) 
					|| HTTPContant.ERROR_CONNECT_CONNECT_EXCEPTION.equalsIgnoreCase(e.toString())) {
				result = new ResultRes();
				result.setMessageRes("Error TimeoutException :"+e);
				result.setStatus(HTTPContant.TIMEOUT);
			}else if(HTTPContant.ERROR_CONNECT_REJECT.equalsIgnoreCase(e.toString())) {
				result = new ResultRes();
				result.setMessageRes("Error Exception :"+ e);
				result.setStatus(HTTPContant.REJECT);
			}else {
				result = new ResultRes();
				result.setMessageRes("Error Exception :"+ e);
				result.setStatus(HTTPContant.ERROR);
			}
					
			return result;

		} finally {
			if (connection != null) {
				connection.disconnect();
			}
		}

	}
	
}
