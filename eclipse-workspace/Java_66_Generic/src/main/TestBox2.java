package main;

public class TestBox2 {
	public static void main(String[] args) {
		Box2<Integer> b1 = new Box2<Integer>(15);
		System.out.println("Gia tri " + b1.getValue());
		
		Box2<String> b2 = new Box2<String>("Hello TITV");
		System.out.println("Gia tri " + b2.getValue());
		
		Box2<Double> b3 = new Box2<Double>(15.5);
		System.out.println("Gia tri " + b3.getValue());
	}
}
