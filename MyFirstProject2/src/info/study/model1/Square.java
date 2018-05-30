package info.study.model1;

public class Square implements Shape{

	private int side;
	
	public int getSide() {
		return side;	
	}
	public void setSide(int side) {
		this.side = side;
	}
	public int getArea() {
		return side*side;
	}
}
