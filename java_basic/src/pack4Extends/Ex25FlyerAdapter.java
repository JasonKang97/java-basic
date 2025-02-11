package pack4Extends;

// Adapter class는 특정 interface의 추상 메소드를 일반 메소드로 overriding한 추상 class를 말함.
// interface의 추상 메소드를 implements한 자식 클래스는 메소드 모두를 오버라이딩해야하는 부담이 있다.
// 이를 개선하기 위한 목적으로 Adapter class를 사용할 수 있다.
abstract public class Ex25FlyerAdapter implements Ex24Flyer {
	public void fly() {
	}
	
	public boolean isAnimal() {
		return false;
	}
}
