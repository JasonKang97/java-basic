package pack4Extends;

// 전자제품 관련 부모 클래스(추상). 메소드에서 abstract가 없어도 선언 가능하나 new 사용 불가.
abstract public class Ex18Jepum {	// 전자 제폼이 공통으로 가져야 할 멤버를 선언.
	public int volume = 0;
	
	public Ex18Jepum() {
		System.out.println("Jepum 추상 클래스 생성자");
	}
	
	abstract public void volumeControl();	// {body}가 없음. abstract로 추상 메소드로 선언.
	
	public void volumeShow() {
		System.out.println("소리 크기: " + volume);
	}
	
	
	
	
	
	
}
