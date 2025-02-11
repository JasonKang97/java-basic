package pack4Extends;

// 부모 클래스가 추상 클래스인 상태에서 자식 클래스에 overriding하지 않으면 추상 클래스이다.
public class Ex18JepumTv extends Ex18Jepum{
	public Ex18JepumTv() {
		System.out.println("TV 생성자");
	}

	@Override	// 메소드 overriding 강요.
	public void volumeControl() {
		System.out.println("TV 소리 조절");
	}
	
	
	
}
