
package com.model;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j_Demo 
{
	static Logger logger=Logger.getLogger(Log4j_Demo.class);
	
	public static void main(String[] args)
	{
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Info message ");
		logger.debug("Debug message");
		logger.error("Error meggage");
		logger.fatal("Fatal message");
		
		Division division=new Division();
		
		try
		{
			division.div(50, 0);
		}
		
		catch(ArithmeticException e)
		{
			division.div(50, 5);
			logger.fatal("Fatal message");
		}
	}
	

}
