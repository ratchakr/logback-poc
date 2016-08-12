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
		log.info("Class instance created at {}", 
                DateFormat.getInstance().format(new Date()));
	}
	
    public static void main( String[] args )
    {
    	log.warn("Running code...");
        new App().appendToDb();
        log.debug("Code execution complete.");
    }


	private void appendToDb() {
	      log.debug("In appendToDb");
	      log.debug("appendToDb complete");
		
	}
}
