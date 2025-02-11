package pack4Extends;

public abstract class Ex20Employee {
	private String irum;
	private int nai;
	
	public Ex20Employee(String irum, int nai) {
		this.irum=irum;
		this.nai=nai;		
	}
	
	abstract double pay();
	abstract void print();
	
	void display() {
		System.out.print("이름: " + irum + ", 나이: " + nai);
	}
}
