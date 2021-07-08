package com.nt.th.esb.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Kritsana J. on 25/03/2564.
 */	
@Controller
public class ESBRestDefault {
	
	 @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
	    @ResponseBody
	    public String welcomeAsHTML() {
		 		 		 
	        return "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n" + 
	        		"<HTML>\r\n" + 
	        		"	<HEAD>\r\n" + 
	        		"		<LINK type=\"text/css\" rel=\"stylesheet\" href=\"/ESB2PlusCRM/TOTBilling//?stylesheet=1\">\r\n" + 
	        		"			<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\r\n" + 
	        		"				<title>ESB2Plus - Service list</title>\r\n" + 
	        		"			</head>\r\n" + 
	        		"			<body>\r\n" + 
	        		"				<span class=\"heading\"><b>ESB2PlusCRM</b> Available services:</span>\r\n" + 
	        		"				<br/>\r\n" + 
	        		"				<table cellpadding=\"1\" cellspacing=\"1\" border=\"1\" width=\"100%\">\r\n" + 
	        		"					<tr>\r\n" + 
	        		"						<td>\r\n" + 
	        		"							<span class=\"porttypename\"><b>SOAP services</b></span>\r\n" + 
	        		"							<ul>\r\n" + 
	        		"								<li>CRM_QueryCAforAll_PS</li>\r\n" + 
	        		"								<li>CRM_AssetQueryForScom_PS</li>\r\n" + 
	        		"							</ul>\r\n" + 
	        		"						</td>\r\n" + 
	        		"						<td>\r\n" + 
	        		"							<span class=\"field\"><b>Endpoint address:</b></span>\r\n" + 
	        		"							<span class=\"value\">http://10.0.102.38:8080/ESB2PlusCRM/TOTBilling/ProxyServices/CRM</span>\r\n" + 
	        		"							<br/>\r\n" + 
	        		"							<span class=\"field\"><b>WSDL :</b></span>\r\n" + 
	        		"							<a href=\"http://10.0.102.38:8080/ESB2PlusCRM/TOTBilling/ProxyServices/CRM?wsdl\">ESBCommonImplService</a>\r\n" + 
	        		"							<br/>\r\n" + 
	        		"							<span class=\"field\"><b>CXF Service list:</b></span>\r\n" + 
	        		"							<a href=\"http://10.0.102.38:8080/ESB2PlusCRM/TOTBilling/\">Available SOAP services:</a>\r\n" + 
	        		"						</td>\r\n" + 
	        		"					</tr>\r\n" + 
	        		"					<tr>\r\n" + 
	        		"						<td>\r\n" + 
	        		"							<span class=\"porttypename\"><b>REST services</b></span>\r\n" + 
	        		"							<ul>\r\n" + 
	        		"								<li>CRM_QueryCAforAll_PS</li>\r\n" + 
	        		"								<li>CRM_AssetQueryForScom_PS</li>\r\n" + 
	        		"							</ul>\r\n" + 
	        		"						</td>\r\n" + 
	        		"						<td>\r\n" + 
	        		"							<span class=\"field\"><b>Endpoint address:</b></span>\r\n" + 
	        		"							<span class=\"value\">http://10.0.102.38:8080/ESB2PlusNT/rest/TOTBilling/</span>\r\n" + 
	        		"							<br/>\r\n" + 
	        		"							<span class=\"field\"><b>Swagger :</b></span>\r\n" + 
	        		"							<a href=\"http://10.0.102.38:8080/ESB2PlusNT/swagger-ui.html\">Web REST Client Swagger</a>\r\n" + 
	        		"							<br/>\r\n" + 
	        		"							<span class=\"field\"><b>Target namespace:</b></span>\r\n" + 
	        		"							<span class=\"value\">http://controllers.esb.th.nt.com/</span>\r\n" + 
	        		"						</td>\r\n" + 
	        		"					</tr>\r\n" + 
	        		"				</table>\r\n" + 
	        		"				<br/>\r\n" + 
	        		"				<br/>				\r\n" + 
	        		"			</body>\r\n" + 
	        		"		</html>";
	 }
}
