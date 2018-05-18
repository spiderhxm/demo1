package com.huxm.demo.demo1;

import org.apache.log4j.Logger;

public class Test1 {
	
	Logger rlog = Logger.getLogger(getClass());
	
	public Object getC() {
		return getClass();

	}
	
	public void log(String msg) {
		rlog.debug(msg);
		
	}
}
