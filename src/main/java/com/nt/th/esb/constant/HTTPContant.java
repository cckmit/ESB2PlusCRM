package com.nt.th.esb.constant;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class HTTPContant {
	public static final String POST = "POST";

	public static final String CONTENT_TYPE = "Content-Type";
	public static final String CONTENT_LENGTH = "Content-Length";
	public static final String CONTENT_LANGUAGE = "Content-Language";

	public static final String APPLICATION_FORM_URL = "application/x-www-form-urlencoded";
	public static final String TEXT_XML = "text/xml;charset=UTF-8";

	public static final String EN_US = "en-US";

	public static int TIMR_OUT = 0;
	
	public static final String SOAP = "SOAP";
	public static final String REST = "REST";
	
	public static final String OK= "OK";
	public static final String ERROR = "ERROR";
	public static final String TIMEOUT = "TIMEOUT";
	public static final String REJECT = "REJECT";
	public static final String ABORT = "ABORT";
	
	public static final String CONNECTION_ERROR = "Connection Error";		
	public static final String ERROR_CONNECT_SOCKET_EXCEPTION = "java.net.SocketException: Connection reset";	
	public static final String ERROR_CONNECT_CONNECT_EXCEPTION = "java.net.ConnectException: Connection timed out: connect";
	public static final String ERROR_CONNECT_REJECT = "java.net.ConnectException: Connection refused: connect";

}
