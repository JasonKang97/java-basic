package pack4Extends;

/*
public abstract class Ex21Volume {
	abstract public void volumeUp(int level);
	abstract public void volumeDown(int level);
}
 */


public interface Ex21Volume{	// 인터페이스: 추상 클래스의 다른 형태. 다중 상속 가능.
	void volumeUp(int level);
	void volumeDown(int level);
	
//	public void print() {	// 추상 메소드만 사용 가능. 일반 메소드 사용 불가.
//		System.out.println("일반 메소드");
//	}
}
