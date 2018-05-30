package info.study.model1;

public class Triangle implements Shape{

	private int side;
	private int height;

	public int getSide(){
		return side;
		
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public int getArea() {
		return (int) (0.5*height*side);	
	}
	public Triangle() {
	}
	public Triangle(int side, int height) {
		this.side = side;
		this.height = height;
	}
	
}