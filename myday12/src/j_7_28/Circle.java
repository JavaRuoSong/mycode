package j_7_28;
//super(形参列表)调用构造器
//调用子类构造器必须声明在第一行
//子类中的构造器默认调用父类中的空参构造器
//this（）与super（）必须都放在首行，所以只能存在一个。
public class Circle {
	private double radius;
	public Circle() {
		this.radius = 1;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double findArea() {
		return Math.PI*radius*radius;
	}
	
}
