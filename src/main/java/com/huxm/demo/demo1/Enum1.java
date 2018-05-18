package com.huxm.demo.demo1;

public enum Enum1 {
	A01("A1",1),
	A02("A2",2);
	
	public String k;
	public int v;
	private Enum1(String k, int v) {
		this.k = k;
		this.v =v;
	}
}
