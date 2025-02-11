package pack4Extends;

public class Ex20Regular extends Ex20Employee{
	private int salary;
	
	public Ex20Regular(String irum, int nai, int salary) {
		super(irum, nai);
		this.salary=salary;
	}

	@Override
	double pay() {
		return salary;
	}

	@Override
	void print() {
		display();
		System.out.print(", 급여: " + pay());
	}

	
	
}
