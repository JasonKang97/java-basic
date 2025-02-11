package pack4Extends;

public class Ex20Salesman extends Ex20Regular{

	private int sales;
	private double commission;
	
	public Ex20Salesman(String irum, int nai, int salary, int sales, double commission) {
		super(irum, nai, salary);
		this.sales=sales;
		this.commission=commission;
	}
	
	@Override
	double pay() {
		return super.pay() + sales*commission;
	}
	
	@Override
	void print() {
		display();
		System.out.print(", 수령액: " + pay());
	}
	

}
