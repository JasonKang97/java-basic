package pack4Extends;

public class Ex12GrandFa {

	private int nai = 70;
	public String gabo = "상감청자";
	protected String gahun = "차카게 살자";		//자식 클래스를 가진다는 의미. protected는 package가 달라도 사용 가능.
	
	public Ex12GrandFa() {
		System.out.println("할아버지 생성자");
	}
	
	public Ex12GrandFa(int nai) {
		this();
		this.nai = nai;
	}
	
	public void say() {
		System.out.println("할아버지 말씀: 자바에 집중해라");
	}
	
	public void eat() {
		System.out.println("밥은 맛있게 먹어라");
	}

	public int getNai() {
		return nai;
	}
	
	
}
