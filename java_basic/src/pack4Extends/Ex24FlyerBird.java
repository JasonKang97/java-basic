package pack4Extends;

public class Ex24FlyerBird implements Ex24Flyer{
	
	
	@Override
	public void fly() {
		System.out.println("커다란 엔진소리와 함께 구름 속으로 사라짐");
	}
	
	@Override
	public boolean isAnimal() {
		return false;
	}
	
	

}
