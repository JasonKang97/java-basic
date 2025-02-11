package pack4Extends;

public class Ex20EmployeeMain {

	public static void main(String[] args) {
		Ex20Temprary tem = new Ex20Temprary("홍길동", 23, 20, 150000);
		tem.print();
		
		System.out.println();
		Ex20Regular reg = new Ex20Regular("신기해", 25, 2345000);
		reg.print();
		
		System.out.println();
		Ex20Salesman sal = new Ex20Salesman("손오공", 27, 2890000, 30000, 0.25);
		sal.print();
		
		System.out.println();
		Ex20Manager man = new Ex20Manager("사오정", 33, 4578000);
		man.print();
		
		
		
	}

}
