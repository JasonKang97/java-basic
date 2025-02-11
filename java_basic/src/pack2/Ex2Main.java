package pack2;

public class Ex2Main {	//하단을 실행하기 위해 가져다 놓은 클래스
	public static void main(String[] args) {
		Ex2Programmer programmer1 = new Ex2Programmer();
		System.out.println("보유기술: " + programmer1.spec);
		programmer1.displayData();
		programmer1.nickName="웹 전문가";	//public 멤버필드이므로 값을 수정한다. 즉, 해당 클래스 외부에서도 값을 수정할 수 있다.
		programmer1.spec="1종 보통 운전면허";	//default 멤버필드이므로 값을 수정한다. 즉, 해당 클래스 외부에서도 값을 수정할 수 있다.
		programmer1.displayData();
		
		//은닉화된 맴버를 해당 클래스 밖에서 제어하기 : getter, setter
		//programmer1.age;	>>> 불가능
		int nai=programmer1.getAge();	//public 메소드이므로 접근 가능.
		System.out.println("programmer1 객체의 agea :" + nai);
		
		programmer1.setAge(35);	//public 메소드 setter를 이용해 private 필드에 값을 전달.
		System.out.println("programmer1 객체의 age :" + programmer1.getAge());
		programmer1.displayData();
		programmer1.setAgeEx(55, 555);	//<<<참고사항
		
		System.out.println("\nstatic, final 관련");
		System.out.println("motto: " + programmer1.motto);
		System.out.println("motto: " + Ex2Programmer.motto);	//static member는 class의 이름으로 바로 접근 가능하다.
		//programmer1.WEIGHT=77.8;	// errer: WHIGHT는 final이므로 수정 불가. 참조만 가능.
		System.out.println("WEIGHT: " + programmer1.WEIGHT);
		System.out.println("PI: " + programmer1.PI);
		
		System.out.println();
		System.out.println("========");
		Ex2Programmer programmer2 = new Ex2Programmer();	//새로운 객체 생성
		programmer2.displayData();
		
		System.out.println("\n객체 변수가 참조하는 주소에 대하여");
		System.out.println(programmer1 + " " + programmer2);	//두 객체의 주소가 다름. 즉, 다른 객체임.	
		System.out.println(programmer1.toString() + " " + programmer2.toString());	// .toString()은 해당 객체의 주소를 알려주고 생략가능.
		System.out.println(programmer1.hashCode() + " " + programmer2.hashCode());	// 해당 주소를 16진법에서 10진법으로 바꾸어 줌.
		
		System.out.println("\n전문가가 만든 클래스 경험");
		System.out.println(Integer.MAX_VALUE);
		
	}

}
