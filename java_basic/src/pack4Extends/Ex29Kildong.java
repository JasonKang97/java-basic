package pack4Extends;

public class Ex29Kildong {
	public Ex29Saram getSaram() {
		//return new Ex29Saram();
		
		return new Ex29Saram()
		{	// 내부 무명(익명) 클래스. Annoymous class
			public String getIrum() {	// Ex29Saram 클래스의 메소드를 오버라이딩 함.
				return "홍길동";
			}
		};
	}
}
