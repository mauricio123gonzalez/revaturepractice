package com.app.main;

import org.apache.log4j.Logger;

import com.app.service.HelloLogService;

public class HelloLog4j {
		
	private static Logger log=Logger.getLogger(HelloLog4j.class);
	public static void main(String[] args) {
		
		log.trace("a trace");
		log.debug("a debug");
		log.info("a info");
		log.warn("a warning");
		log.error("a error");
		log.fatal("a fatal");
		
		HelloLogService service=new HelloLogService();
		service.helloLog();

	}

}
