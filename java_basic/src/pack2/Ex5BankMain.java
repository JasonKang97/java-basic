package pack2;

public class Ex5BankMain {

	public static void main(String[] args) {
		Ex5Bank tom = new Ex5Bank();
		tom.deposit(5000);	//예금
		tom.withdraw(3000);	//출금
		System.out.println("tom의 예금액(잔고): " + tom.getMoney());
		
		Ex5Bank oscar = new Ex5Bank(2000);
		oscar.deposit(1000);
		//oscar.withdraw(6000);
		oscar.withdraw(3000);
		System.out.println("oscar의 예금액(잔고): " + oscar.getMoney());
		
		
		System.out.println();
		System.out.println("객체의 주소 관련");
		System.out.println("tom 객체변수의 주소: " + tom + " " + tom.toString() + " " + tom.hashCode());
		System.out.println("oscar 객체변수의 주소:" + oscar + " " + oscar.toString() + " " + oscar.hashCode());
		System.out.println(tom==oscar);	//두 객체변수의 주소는 다르다.
		Ex5Bank james = null;
		System.out.println("jamse 객체변수의 주소: " + james);
		//System.out.println(james.getMoney());	// NullPointerException error	>>>	참조하고 있는 객체가 없음.
		james = oscar;	//주소를 치환. 하나의 객체를 두개의 객체변수가 참조하게 됨. 타입이 같을 경우에만 성립한다.
		System.out.println("jamse 객체변수의 주소: " + james);
		System.out.println(james.getMoney());
		if(james==oscar)
			System.out.println("둘은 같은 주소야");
		else
			System.out.println("둘은 같은 주소가 아니야");
		
		if(james==tom) 
			System.out.println("서로 같은 주소야");
		else 
			System.out.println("서로 같은 주소가 아니야");
		
		
		if(james instanceof Ex5Bank)	//instanceof: 타입 비교 연산자.
			System.out.println("Ex5Bank 타입입니다.");
		else
			System.out.println("Ex5Bank 타입이 아닙니다.");
		
		System.out.println("\n스트링 타입(String type)값 비교에 대해");
		String ss1 = "kor";	//String 클래스는 클래스지만 기본형처럼 사용할 수 있도록 자바가 배려함.
		// 기본적으로 선언 시 heap의 Literal pool에 객체가 생성됨. 이후 다시 선언 시 하나의 주소를 공유한다.
		String ss2 = new String();
		ss2 = "kor";
		String ss3 = new String("kor");	//이 경우 Literal pool이 아닌 Heap에 바로 생성됨.
		System.out.println(ss1+ " " + ss2 + " " + ss3);
		System.out.println();
		
		if(ss1 == ss2)
			System.out.println("ss1과 ss2는 같다.");
		else
			System.out.println("ss1과 ss2는 다르다.");
		if(ss1 == ss3)
			System.out.println("ss1과 ss3는 같다.");
		else
			System.out.println("ss1과 ss3는 다르다.");
		if(ss2==ss3)
			System.out.println("ss2과 ss3는 같다.");
		else
			System.out.println("ss2과 ss3는 다르다.");
		
		//문자열(String type) 비교는 ==이 아니라 .equals() 메소드를 사용한다.
		if(ss2.equals(ss3))
			System.out.println("ss2과 ss3는 같다.");
		else
			System.out.println("ss2과 ss3는 다르다.");
		
		System.out.println("\n배열도 객체(참조형)");
		int ar[]=new int[3];	//new를 선언하는 것과 동일
		ar[0]=10;
		System.out.println(ar[0] + " " + ar);	//배열의 대표명은 객체변수
		int ar2[]= {1,2,3};
		System.out.println(ar2[0] + " " + ar2);
		
		System.out.println("접근지정자에 대해");
		// 현재 클래스와 Ex5Bank 클래스는 같은 package에 존재
		Ex5Bank bank1 = new Ex5Bank();
		//System.out.println(bank1.money);	// private 멤버로 접근 불가
		System.out.println(bank1.imsi);	// default 수준이므로 멤버 접근 가능
		System.out.println(bank1.imsi2);	// public 수준이므로 멤버 접근 가능
	}

}
