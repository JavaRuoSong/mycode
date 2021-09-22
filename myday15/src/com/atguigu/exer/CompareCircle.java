package com.atguigu.exer;

public class CompareCircle extends Circle implements CompareObject{
	public CompareCircle(double radius) {
		this.setRadius(radius);
	}

	public int compareTo(Object o ) {
		if(o instanceof CompareCircle) {
			CompareCircle circle = (CompareCircle)o;
			if(this.getRadius()>circle.getRadius()) {
				return 1;
			}else if(this.getRadius() < circle.getRadius()){
				return -1;
			}
				return 0;
			
			
		}
		throw new RuntimeException("传入的数据类型不匹配");
		
	}
}
