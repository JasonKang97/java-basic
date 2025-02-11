package pack4Extends;

public class Ex24FlyerAirplane implements Ex24Flyer{
	
	
	@Override
	public void fly() {
		System.out.println("날개를 저으며 멀리 날아가는 새 한마리");
	}
	
	@Override
	public boolean isAnimal() {
		return true;
	}
	
	

}
