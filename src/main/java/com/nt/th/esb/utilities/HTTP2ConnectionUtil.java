package com.nt.th.esb.utilities;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class HTTP2ConnectionUtil {
	private static Logger log = LogManager.getLogger();
	
	private HttpURLConnection URLConnection;
	private URL myURL;
	private String myUserAgent;
	private String myAcceptType;
	private String myAcceptLanguage;
	private String myAcceptCharset;
	private String myKeepAlive;
	private String myConnection;
	private String myReferer;
	
	public HTTP2ConnectionUtil(String URL) {
		this.Initialize();
		try { this.myURL = new URL(URL); }
		catch (Exception e) { log.error(e); }
	}
	
	public HTTP2ConnectionUtil() {
		this.Initialize();
	}
	
	private void Initialize() {
		this.URLConnection = null;
		this.myUserAgent = "";
		this.myAcceptType = "";
		this.myAcceptLanguage = "en-US";
		this.myAcceptCharset = "";
		this.myKeepAlive = "";
		this.myConnection = "";
		this.myReferer = "";
		
	}
	public void setURL(String URL) {
		try { this.myURL = new URL(URL); } 
		catch (MalformedURLException e) { log.error(e); }
	}
	
	public URL getURL() {
		return myURL;
	}
	
	public void setUserAgent(String agent) {
		this.myUserAgent = agent;
	}
	
	public String getUserAgent() {
		return myUserAgent;
	}
	
	public void setAccept(String type, String language, String charset) {
		this.myAcceptType = type;
		this.myAcceptLanguage = language;
		this.myAcceptCharset = charset;
	}
	
	public String getAccept() {
		return myAcceptType;
	}
	
	public String getAcceptLanguage() {
		return myAcceptLanguage;
	}
	
	public String getAcceptCharset() {
		return myAcceptCharset;
	}
	
	public void setKeepAlive(String keepAlive) {
		this.myKeepAlive = keepAlive;
	}
	
	public String getKeepAlive() {
		return myKeepAlive;
	}
	
	public void setConnection(String connection) {
		this.myConnection = connection;
	}
	
	public String getConnection() {
		return myConnection;
	}
	
	public void setReferer(String referer) {
		this.myReferer = referer;
	}
	
	public String getReferer() {
		return myReferer;
	}
	
	public HttpURLConnection getURLConnection() {
		return this.URLConnection;
	}
	
	public String get(String link, int timeout) {
		this.setURL(link);
		return this.get(timeout);
	}
	
	public String get(int timeout) {
		try {
			//Set Request Information
			this.URLConnection = (HttpURLConnection)myURL.openConnection();
			this.URLConnection.setRequestMethod("GET");
			this.URLConnection.setAllowUserInteraction(false);
			this.URLConnection.setDoOutput(false);
			this.URLConnection.setInstanceFollowRedirects(false);
			this.URLConnection.setConnectTimeout(timeout);
			this.URLConnection.setReadTimeout(timeout);
			
			//Set Request Properties
			this.URLConnection.setRequestProperty("User-Agent", this.getUserAgent());
			this.URLConnection.setRequestProperty("Accept", this.getAccept());
			this.URLConnection.setRequestProperty("Accept-Language", this.getAcceptLanguage());
			this.URLConnection.setRequestProperty("Accept-Charset", this.getAcceptCharset());
			this.URLConnection.setRequestProperty("Keep-Alive", this.getKeepAlive());
			this.URLConnection.setRequestProperty("Connection", this.getConnection());
			this.URLConnection.setRequestProperty("Referer", this.getReferer());
			
			//Connection
			this.URLConnection.connect();
			
			//Read Response
			StringBuffer sReturn = new StringBuffer();
			String sTemporary = "";
			BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)this.URLConnection.getContent()));
			while ((sTemporary = reader.readLine()) != null) sReturn.append(sTemporary + "\r");
			
			//Clean Up
			reader.close();
			this.setReferer(myURL.toString());
			
			return sReturn.toString();
		} catch (Exception e) { 
			log.error(e); 
			return null;
		} finally {
			if (this.URLConnection != null) { this.URLConnection.disconnect(); }
		}
	}
	
	public String post(String link, String parameters, int timeout) {
		this.setURL(link);
		return this.post(parameters, timeout);
	}
	
	public String post(String parameters, int timeout) {
		try {
			//Set Request Information
			this.URLConnection = (HttpURLConnection)myURL.openConnection();
			this.URLConnection.setRequestMethod("POST");
			this.URLConnection.setAllowUserInteraction(false);
			this.URLConnection.setDoOutput(true);
			this.URLConnection.setInstanceFollowRedirects(false);
			this.URLConnection.setUseCaches(false);
			this.URLConnection.setConnectTimeout(timeout);
			this.URLConnection.setReadTimeout(timeout);

			
			//Set Request Properties
			//this.URLConnection.setRequestProperty("User-Agent", this.getUserAgent());
			//this.URLConnection.setRequestProperty("Accept", this.getAccept());
			this.URLConnection.setRequestProperty("Accept-Language", this.getAcceptLanguage());
			//this.URLConnection.setRequestProperty("Accept-Charset", this.getAcceptCharset());
			//this.URLConnection.setRequestProperty("Keep-Alive", this.getKeepAlive());
			//this.URLConnection.setRequestProperty("Connection", this.getConnection());
			//this.URLConnection.setRequestProperty("Referer", this.getReferer());
			this.URLConnection.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
			this.URLConnection.setRequestProperty("Content-Length", Integer.toString(parameters.length()));
			
			
			//Write Data
			OutputStreamWriter writer = new OutputStreamWriter(this.URLConnection.getOutputStream(), "UTF-8");
			writer.write(parameters);
			writer.flush();
			writer.close();
			
			//Read Result
			BufferedReader reader = new BufferedReader(new InputStreamReader(new DataInputStream(this.URLConnection.getInputStream()), "UTF-8"));
			
//			String sResult = "";
//			String sLine = null;
//			while ((sLine = reader.readLine()) != null) sResult += sLine + "\n";
			
			//Read Result
			StringBuilder response = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}			
			
			//Clean Up
			reader.close();

			this.setReferer(myURL.toString());
			
			//return sResult;			
			return response.toString();
		} catch (Exception e) {
			log.error(e);
			return null;
		} finally {
			if (this.URLConnection != null) { this.URLConnection.disconnect(); }
		}
	}
	
}
