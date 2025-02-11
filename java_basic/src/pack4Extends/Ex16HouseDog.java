package pack4Extends;

public class Ex16HouseDog extends Ex16Dog {
	
	private String where = "집";
	
	public Ex16HouseDog(String name) {
		super(name);
	}
	
	public void show() {
		System.out.println("HouseDog이 사는 장소: " + where + "에 산다.");
	}

	@Override
	public void print() {
		System.out.println(getName() + ": " +  where + "에서 사는 중");
	}
}
