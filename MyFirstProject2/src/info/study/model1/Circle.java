package info.study.model1;

public class Circle implements Shape{

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getArea() {
		return (int) (Math.PI*radius*radius);
	}
	
	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}
	
}