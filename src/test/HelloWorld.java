/*
 * HelloWorld.java
 * Copyright (C) 2013 Andrew DeMaria (muff1nman) <ademaria@mines.edu>
 *
 * All Rights Reserved.
 */

package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {
	private static Logger logger = LogManager.getLogger(HelloWorld.class);
	public static void main(String[] args) {
		logger.info("Starting program");
		System.out.println("Hello World");
		logger.info("Ending program");
	}
}


