
public class Rectangle extends Shape {
	private double length, width;

	public Rectangle(ToaDo toaDo, double length, double width) {
		super(toaDo);
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.length * this.width;
	}

	
}
