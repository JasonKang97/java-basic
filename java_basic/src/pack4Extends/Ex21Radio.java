package pack4Extends;

public class Ex21Radio implements Ex21Volume{	// 인터페이스를 상속받을 때는 implements라는 예약어로 상속을 정의
	private int volLevel;
	
	public Ex21Radio() {
		volLevel=0;
	}
	
	@Override
		public void volumeUp(int level) {
			volLevel+=level;
			System.out.println("라디오 볼륨 올리면 " + volLevel);
		}
	
	@Override
		public void volumeDown(int level) {
			volLevel-=level;
			System.out.println("라디오 볼륨 내리면 " + volLevel);
		}
	
}
