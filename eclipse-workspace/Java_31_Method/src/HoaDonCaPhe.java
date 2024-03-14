
public class HoaDonCaPhe {
	private String coffeType;
	private double cost;
	private double weight;
	
	public HoaDonCaPhe(String coffeType, double cost, double weight)
	{
		this.coffeType = coffeType;
		this.cost = cost;
		this.weight = weight;
	}
	
	public double calculateBillSum()
	{
		return this.cost * this.weight;
	}
	
	public boolean checkMoreWeight(double w)
	{
		return this.weight > w;
	}
	
	public boolean checkBillSumMore500k()
	{
		return this.calculateBillSum() > 500000;
	}
	
	public double calculateSaleMoney(double x)
	{
		return (this.calculateBillSum() > 500000) ? (this.calculateBillSum() * x / 100) : 0;
	}
	
	public double calculateBillSumAfterSaled(double x)
	{
		return this.calculateBillSum() - this.calculateSaleMoney(x);
	}
}
