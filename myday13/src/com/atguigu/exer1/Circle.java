package com.atguigu.exer1;

import java.util.Objects;

public class Circle {
	int area;
	String name;
//	@Override
	//circle 中重写的equals方法 手动实现
//	public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if(obj instanceof Circle) {
//        	Circle c1 = (Circle)obj;
//        	return this.area == c1.area && this.name.equals(c1.name);
//        }
//        return false;
//	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return area == other.area && Objects.equals(name, other.name);
	}


	@Override
	public String toString() {
		return "Circle [area=" + area + ", name=" + name + "]";
	}
	
	
}
