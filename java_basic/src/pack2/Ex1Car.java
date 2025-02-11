package pack2;

//클래스 형식: [접근지정자] class 클래스명	>>>	클래스명의 첫글자는 대문자여야함. 또한 파일이름과 클래스명이 같아야하므로 파일 이름의 첫글자 또한 대문자이다.
public class Ex1Car {	// Car 객체(Object)를 생산하기 위한 설계도: class
	//새로운 타입(type, 형)을 만들기 위함
	//field(필드, 속성)와 method(행위)를 멤버로 가질 수 있음
	//동일한 field와 method를 수행하는 객체의 집합을 설계
	
	//멤버 필드(전역변수) : 형식은 [접근지정자] type 필드명		>>>괄호가 없으면 멤버 필드, 접근지정자는 없을수도 있고 private, public, protected로 총 4가지가 있다.
	//private는 해당 class 내부에서, 접근지정자 없을 때(default)는 해당 package 내부에서, public은 어디에서도 자유롭게 호출 가능.
	int wheel;			//접근지저자가 없을 경우 package내에서 자유롭게 호출 가능. 현재는 pack2라는 package에서 자유롭게 호출 가능. 초기설정을 하지 않을 경우 0의 값을 가짐.
	private int airBag=1;		//private은 현재 class에서만 호출 가능(은닉화). 현재는 Ex1Car라는 class에서만 호출 가능.
	private int speed;			//speed=0인 상태
	public String irum;		//public은 현재 class 바깥에서 자유롭게 호출 가능한 필드.
	
	public Ex1Car() {	//특별한 메소드(클래스와 메소드명이 일치)	>>>	생성자(Constructor)
		System.out.println("객체 생성시 생성자가 가장 먼저 수행: 초기화를 담당");
		wheel=4;
		irum="그랜저";
	}

	private void abc() {	//멤버 메소드 : 형식은 [접근지정자] 반환형 메소드명(매개변수){}		>>>괄호가 있으면 메소드
		System.out.println("abc 메소드 실행");
	}
		
	void def() {		//메소드 수행 후 반환값이 돌아갈 경우는 void
		System.out.println("def 메소드 실행");
		System.out.println("바퀴수는 " + wheel);
		System.out.println("에어백 수는 " + airBag);		//private 필드이나 현재 클래스내에서 호출가능
		abc();		//private 메소드이나 현재 클래스내에서 호출가능
	}
	
	public String driving() {		//메소드 수행 후 String 타입의 반환값이 있는 경우는 문자열 반환
		System.out.println("운전하기");
		return "현재 고속도로를 달리는 중";		//메소드 수행 후 값을 반환할 경우 return문을 사용
	}
	
	public int drivingStop() {		//메소드 수행 후 int 타입의 반환값이 있는 경우는 int를 반환. 캐멀 표기법
		System.out.println("운전 멈추기");
		return 0;	//return 정수
	}
	
	//참고: 변수에 값을 저장하는 방법은 두가지.
	//1) 변수 = 값	ex: a = 5
	//2) 매개변수를 이용. ex: 메소드명(타입 매개변수){}하고 메소드명(값)을 한다.
	public void drivingGood(int w) {	//매개변수(parameter)가 있는 메소드
		wheel = w;
		System.out.println(wheel + "개의 바퀴를 가진 이동수단 사용");
		System.out.println();
		

		
	}
}

//클래스를 공부하는 이유
//1) 직접 객체를 생성 후 사용하기 위해
//2) 다른 사람이 만든 class를 활용하기 위해




