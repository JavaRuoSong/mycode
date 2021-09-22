package j_7_28;

public class Cylinder extends Circle{
	private double length;
	public Cylinder() {
		this.length = 1;
	}
	public double findVolume() {
		return super.findArea()*this.length;
	}
	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return super.findArea()*2+this.getRadius()*2*Math.PI;
	}
}
