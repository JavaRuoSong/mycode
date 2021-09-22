package com.atguigu.java;

public class Test {

}
class eHan{
	private eHan() {
		
	}
	private static eHan e = new eHan();
	public static eHan geteHan() {
		
			return e;
		
	}
}
class lHan{
	private lHan() {
		
	}
	private static lHan l ;
	public static lHan getL() {
		if (l== null) {
			l = new lHan() ;
		}
		return l;
	}
}