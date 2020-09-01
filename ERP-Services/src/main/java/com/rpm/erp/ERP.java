package com.rpm.erp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Mohan
 * 
 *         Booting and starting point for running the application
 *
 */
@SpringBootApplication
public class ERP {

	private static final Logger logger = LoggerFactory.getLogger(ERP.class);

	/**
	 * The main method used to run the application via single entry point.
	 * 
	 * @param args
	 */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ERP.class, args);
	}
}
