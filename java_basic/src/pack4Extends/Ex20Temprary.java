package pack4Extends;

public class Ex20Temprary extends Ex20Employee {
	private int ilsu;
	private int ildang;
	
	
	public Ex20Temprary(String irum, int nai, int ilsu, int ildang) {
		super(irum, nai);
		this.ilsu=ilsu;
		this.ildang=ildang;
 	}
	
	@Override
	double pay() {
		return ilsu*ildang;
	}
	
	@Override
	void print() {
		display();
		System.out.print(", 월급: " + pay());
	}
		
	
	
}
