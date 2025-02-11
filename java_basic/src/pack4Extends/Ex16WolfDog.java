package pack4Extends;

public class Ex16WolfDog extends Ex16Dog{
	
	private String where = "동물원";

	
	public Ex16WolfDog(String name) {
		super(name);
	}
	
	public void show() {
		System.out.println("WolfDog이 사는 장소: " + where);
	}
	
	@Override
	public void print() {
		System.out.println(getName() + "은 " +  where + "에서 시선을 느끼며 사는 중");
	}
	
	public void displayPrint() {
		print();
		this.print();
		super.print();
	}

}
