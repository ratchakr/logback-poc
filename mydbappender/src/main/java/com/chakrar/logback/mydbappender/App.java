package com.chakrar.logback.mydbappender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Logback DB Appender
 *
 */
public class App {
	
	final static Logger log = LoggerFactory.getLogger(App.class);

	
	public App () {
		
		//log.info("Inside App Constructor...creating instance"+ DateFormat.getInstance().format(new Date()));
	}
	
    public static void main( String[] args )
    {
    	//log.warn("main...");
    	System.out.println("start logging");
    	try {
			long s = System.currentTimeMillis();
			for (int i = 0; i < 1000; i++) {
			    //new App().writeToDB();
				log.debug("Writing to DB");
			}
			//log.error("Exception ", new RuntimeException("Testing Exception"));
			long e = System.currentTimeMillis();
			System.out.println(" Time taken to write to DB = "+ (e-s)/1000 + " seconds");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }


	private void writeToDB() {
	      log.debug("Writing to DB");
	}
}
