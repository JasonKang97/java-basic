package pack4Extends;

public class Ex18HandPhone extends Ex18Jepum{
	
	@Override
	public void volumeControl() {
		System.out.println("핸드폰 제품의 볼륨 변경");
	}
	
	@Override
	public void volumeShow() {
		// 부모의 일반 메소드는 overriding 선택적
		volume = 10;
		System.out.println("볼륨 크기: " + volume);
	}

}
