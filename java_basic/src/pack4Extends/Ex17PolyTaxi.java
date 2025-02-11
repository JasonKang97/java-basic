package pack4Extends;

public class Ex17PolyTaxi extends Ex17PolyCar{
	private int passenger = 2;

	public Ex17PolyTaxi() {
		System.out.println("Car의 자식 클래스인 Texi 생성자");
	}
	
	@Override
	public void displayData() {
		String msg = "택시 안에 몇 명이 타고 있는가? " + passenger;
		System.out.println(msg);
	}
	
}
