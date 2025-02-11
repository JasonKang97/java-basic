package pack4Extends;

public class Ex17PolyBus extends Ex17PolyCar{
	private int passenger = 10;
	
	public Ex17PolyBus() {
		//super(); >>> 부모 생성자는 자동으로 생성됨.
		System.out.println("Car의 자식 클래스인 Bus 생성자");	
	}
	
	@Override
	public void displayData() {
		System.out.println("버스 승객 수: " + passenger);
		System.out.println("버스 속도: " + speed);
	}
	
	public void show() {
		System.out.println("버스 고유 메소드 show");
	}
	
}
