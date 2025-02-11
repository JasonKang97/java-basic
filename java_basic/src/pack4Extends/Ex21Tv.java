package pack4Extends;

public class Ex21Tv implements Ex21Volume{	// 인터페이스를 상속받을 때는 implements라는 예약어로 상속을 정의.
	// 추상 class와 interface를 동시에 받으려면 extends로 추상 class를 받은 후 implements로 interface를 받음. 역순으로는 불가.
	private int volLevel;
	
	public Ex21Tv() {
		volLevel=0;
	}
	
	@Override
		public void volumeUp(int level) {
			volLevel+=level;
			System.out.println("TV 소리 올리면 " + volLevel);
		}
	
	@Override
		public void volumeDown(int level) {
			volLevel-=level;
			System.out.println("TV 소리 내리면 " + volLevel);
		}
	
}
