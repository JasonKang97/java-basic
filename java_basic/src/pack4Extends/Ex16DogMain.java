package pack4Extends;

public class Ex16DogMain {

	public static void main(String[] args) {
		Ex16Dog dog = new Ex16Dog("개");
		dog.print();
		System.out.println(dog.callName());
		
		System.out.println();
		Ex16HouseDog houseDog = new Ex16HouseDog("반려견");
		houseDog.print();
		System.out.println(houseDog.callName());
		houseDog.show();
		
		System.out.println();
		Ex16WolfDog wolfDog = new Ex16WolfDog("늑대");
		wolfDog.print();
		System.out.println(wolfDog.callName());
		wolfDog.show();
		
		System.out.println("--------------");
		Ex16WolfDog bushDog = wolfDog;	// 주소를 치환(타입이 같은 경우 치환 성공)
		wolfDog.print();
		bushDog.print();
				
		// promotion
		Ex16Dog dog2 = wolfDog;		// 주소를 치환(타입이 다르지만 치환 성공)	>>>	자신의 주소를 부모 객체 변수에 주는 경우 타입이 달라도 가능함.
		dog2.print();	//overriding된 메소드만 부모 객체변수명으로 호출이 가능하다. 
		//dog2.show();	//자식이 가진 고유 메소드는 부모 객체변수명으로 호출이 불가능하다. 즉, overring되지 않은 메소드의 경우 불가능하다.
		//Ex16WolfDog hidog = dog2;	//Type mismatch: cannot convert from Ex16Dog to Ex16WolfDog
		Ex16WolfDog hidog = (Ex16WolfDog)dog2;	// casting
		hidog.print();
		
		
		System.out.println("----------------");
		Ex16Dog coyote = new Ex16Dog("코요테");	// 부모클래스(super class)
		coyote.print();
		System.out.println(coyote.callName());
		Ex16WolfDog wolfDog2 = new Ex16WolfDog("늑대2");	// Dog의 자식 클래스
		wolfDog2.print();
		wolfDog2.show();
		
		coyote = wolfDog2;	// promotion: 자식 객체 주소를 부모 객체변수에 치환
		coyote.print();		// overriding된 메소드는 허용
		//coyote.show();		// 자식 소유 메소드는 호출 불가
		coyote.getName();
		Ex16WolfDog wolfDog3 = null;
		//wolfDog3.show(); 	//  java.lang.NullPointerException >> null이기 때문에 에러 발생
		wolfDog3 = wolfDog2;	// 타입이 같으므로 성공
		//wolfDog3 = houseDog;	// 타입이 다르므로 실패
		//wolfDog3 = coyote;	// 타입이 다르므로 실패. 하지만 부모 타입인 coyote 변수는 자식의 주소를 기억 중.
		wolfDog3 = (Ex16WolfDog)coyote;	// casting을 통해 치환할 수 있다. 매우 중요!!
		wolfDog3.print();
		
		
		
	}

}
