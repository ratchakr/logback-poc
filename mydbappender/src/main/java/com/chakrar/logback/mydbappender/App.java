package com.chakrar.logback.mydbappender;

import java.text.DateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Logback DB Appender
 *
 */
public class App {
	
	final static Logger log = LoggerFactory.getLogger(App.class);

	
	public App () {
		
		log.info("Inside App Constructor...creating instance"+ DateFormat.getInstance().format(new Date()));
	}
	
    public static void main( String[] args )
    {
    	log.warn("main...");
        new App().writeToDB();
        log.error("Exception ", new RuntimeException("Testing Exception"));
    }


	private void writeToDB() {
	      log.debug("Writing to DB");
	}
}
