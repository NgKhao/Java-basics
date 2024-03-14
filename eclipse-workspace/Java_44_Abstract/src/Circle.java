
public class Circle extends Shape {
	private double r;
	
	public Circle(ToaDo toaDo, double r) {
		super(toaDo);
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * this.r * this.r;
	}

}
