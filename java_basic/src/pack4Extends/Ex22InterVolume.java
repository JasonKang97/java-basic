package pack4Extends;

public interface Ex22InterVolume {
	String VOL = "볼륨";	// public final VOL = "볼륨";과 동일. interface에서는 기본적으로 적지 않아도 public이며 멤버 필드는 final과 같다.
	
	void volUp(int v);	// abstract public void volUp(int v);와 동일 >>> 추상 클래스에서는 이렇게 사용.
	void volDown(int v);
	

}
