package com.model;

import org.apache.log4j.Logger;

public class Division 
{
	static Logger logger=Logger.getLogger(Division.class);
	
	public int div(int a,int b)
	{
		int c=a/b;
		logger.info("Info message");
		return c;
	}
	
	

}
