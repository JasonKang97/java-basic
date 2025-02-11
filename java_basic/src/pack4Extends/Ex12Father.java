package pack4Extends;

public class Ex12Father extends Ex12GrandFa{
	private final int nai = 50;
	public String gabo = "청자 비슷한 물병";
	private int house = 1;	// 부모는 자식의 변수에 접근할 수 없다.
	public Ex12Father() {
		super();	// 부모 생성자 호출
		System.out.println("아버지 생성자");
	}
	
	@Override	//annotation(뭔가를 처리하는 기능)
	public int getNai() {		// 메소드 오버라이딩: 부모와 똑같은 메소드를 자식에서 만듦. 내용은 대개 다르게 작성.
		int imsi = 0;	// 부모와 다른 코드를 적을 수 있다. 재정의 가능.
		return nai;
	}
	
	@Override
	public void say() {
		String ss = "아버지 말씀: 풀스택 개발자가 되어라";
		System.out.println(ss);
	}
	public int getHouse() {
		return house;
	}
	
	public void showData() {
		String gabo="맥북";
		System.out.println(gabo);	// 지역변수 먼저
		System.out.println(this.gabo);	// 전역변수 먼저
		System.out.println(super.gabo);	// 부모 클래스 먼저
		
		say();
		this.say();
		super.say();	//super.super.와 같이 두단계를 다이렉트로 넘어가는 방법은 없다.
		
	}
	
	
}
