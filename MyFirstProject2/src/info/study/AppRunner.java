package info.study;

import info.study.model1.Circle;
import info.study.model1.Square;
import info.study.model1.Triangle;

public class AppRunner {

	public static void main(String[] args) {
		
		Square square1 = new Square();
		square1.setSide(7);
		
		System.out.println(square1.getArea());
		
		Circle circle1 = new Circle();
		circle1.setRadius(15);
		
		Circle circle2 = new Circle(25);
		
		System.out.println("Circle with radius " + circle1.getRadius() + " has area " + circle1.getArea());
		System.out.println("Circle with radius " + circle2.getRadius() + " has area " + circle2.getArea());
		
		Triangle triangle1 = new Triangle();
		triangle1.setHeight(10);
		triangle1.setSide(15);
		
		Triangle triangle2 = new Triangle(20, 30);
		
		System.out.println("Triangle with heigh " + triangle1.getHeight() + " and with side " + triangle1.getSide() + " has area " + triangle1.getArea());
		System.out.println("Triangle with heigh " + triangle2.getHeight() + " and with side " + triangle2.getSide() + " has area " + triangle2.getArea());
	}
}
