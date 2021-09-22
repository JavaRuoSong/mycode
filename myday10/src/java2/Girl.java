package java2;

public class Girl {
	int age;
	String name;
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
	public Girl(int age, String name) {
		
		this.age = age;
		this.name = name;
	}
	public Girl() {
		
	}
	public void marry(Boy boy) {
		System.out.println("我想嫁给"+boy.getName());
		boy.marry(this);
	}
}
