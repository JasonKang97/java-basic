package pack4Extends;

//public class Ex25Ball implements Ex24Flyer{	// 모든 메소드(추상 메소드)를 오버라이딩 해야함
public class Ex25Ball extends Ex25FlyerAdapter{	// 선택적으로 오버라이딩 가능
	
	@Override
	public void fly() {
		System.out.println("야구공이 힘차게 관중석으로 날아감");
	}
	
	// isAnimal()은 현재 클래스에서 필요 없다고 판단해서 오버라이딩 하지 않음.
	
	
	
	
}
