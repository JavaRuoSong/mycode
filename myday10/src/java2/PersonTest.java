package java2;
/*this修饰属性，方法，构造器
 * 
 * 表示当前对象或正在创建的对象(谁调用this谁就是对象)
 * 
 *！！ 如果一个类中有n个构造器，最多有n-1个使用this.(形参列表)
 * 
 * */
public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person("耿怡",21);
		System.out.println(p.getname());
	}
}
class Person{
	private  String name;
	private  int age;
	public Person(){}
	
	public Person(int age) {
		this.age = age;
	}
	
	
	public Person(String name,int age) {
		/*可以使用this(形参列表)调用本类中其他构造器！！不可以调用自己
		 * 
		 * ！！！！调用构造器必须在首行（一个构造器只能调用一个其他构造器）
		 * */
		
		this(age);//只是调用逻辑，不创建新对象
		this.name = name;
//		this.age = age;
	}
		
	public void setName(String name) {
		//在类的方法或构造器中，我们可以使用“this.属性”或“this.方法”的方式，调用当前对象的属性或方法。
		//通常省略this.特殊情况下，如果方法的形参和类的属性名相同时，我们必须显式的使用“this.变量”
		//的方式，表明此变量式属性，不是形参
		this.name = name;
	}
	public String getname() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
}