package com.nt.th.esb.utilities;

import java.net.HttpURLConnection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class InterruptThread implements Runnable {
	private static Logger log = LogManager.getLogger();
	
    HttpURLConnection con;
    public InterruptThread(HttpURLConnection con) {
        this.con = con;
    }

    public void run() {
        try {
            Thread.sleep(HttpConnectionUtil.TIMR_OUT); // or Thread.sleep(con.getConnectTimeout())
        } catch (InterruptedException e) {
        	log.error(e);
        	// Restore interrupted state...
            Thread.currentThread().interrupt();
        }
        con.disconnect();
        //System.out.println("Timer thread forcing to quit connection");
    }
}
