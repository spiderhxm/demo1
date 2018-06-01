package com.huxm.demo.demo1;

import org.apache.log4j.Logger;
import org.junit.Test;

public class Test1 {
	
	Logger rlog = Logger.getLogger(getClass());
	
	public Object getC() {
		return getClass();

	}
	
	public void log(String msg) {
		rlog.debug(msg);
		
	}
	
	@Test
	public void test() {
		String[] a = {"a","b"};
		
		for(String a1: a) {
			System.out.println("a1:"+a1);
		}
		
	}
}
