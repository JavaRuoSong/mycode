package java2;

public class Boy {
	int age;
	String name;
	public Boy() {

	}
	public Boy(int age, String name) {
		
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void marry(Girl girl) {
		System.out.println("我想娶"+girl.getName()+"!!");
	}
}
