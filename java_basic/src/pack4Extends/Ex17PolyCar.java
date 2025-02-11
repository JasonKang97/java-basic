package pack4Extends;

//부모 클래스(parent, super, 원형 class)
public class Ex17PolyCar {	// 모든 자동차들이 공통으로 가져야 할 멤버(필드, 메소드) 선언
	protected int speed = 100;	// 일반적으로 부모 클래스에 사용
	
	public Ex17PolyCar() {
		System.out.println("자동차 원형 클래스");
	}
	
	public void displayData() {
		System.out.println("속도: " + speed);
	}
	
	public int getSpeed() {
		return speed;
	}
	
}
