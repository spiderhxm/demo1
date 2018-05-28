package com.huxm.demo.demo1;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map m = new HashMap();
		
		m.put("a", 1);
		m.put("b", 2);
		
		System.out.println(m.get("*"));

	}

}
