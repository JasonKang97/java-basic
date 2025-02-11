package pack;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) { 
		System.out.println("출발");
		aa(); // aa 묶음(메소드)을 호출
		boolean bb = aa();
		System.out.println(bb);
		System.out.println("계속");
		
		
		System.out.println("\n논리 연산자 처리할 때 주의할 점\n");
		boolean a = true, b= false, c;
		c = a||b;
		System.out.println("c는 " + c); //둘 중 하나만 참일 경우라도 참으로 인정
		c= a && b; 
		System.out.println("c는 " + c); //둘다 참일 경우만 참으로 인정
		
		System.out.println("**********");
		c = abc() || def();
		System.out.println("묶음 수행 후 c는(or) " + c); // 앞의 abc()가 참이기 때문에 abc()만 실행
		c = def() ||abc();
		System.out.println("묶음 수행 후 c는(or) " + c); // 앞의 def()가 거짓이기 때문에 실행 후 뒤로 넘어가 abc()를 실행
		
		System.out.println("\n~~~~~~~~~~~~~\n");
		c = abc() && def();
		System.out.println("보따리 수행 후 c는(and) " + c); // 앞의 abc()가 참이기 때문에 뒤의 def()도 실행
		c = def() && abc();
		System.out.println("보따리 수행 후 c는(and) " + c); // 앞의 def()가 거짓이기 때문에 실행 후 뒤로 넘어가 abc()를 실행하지 않음
		
		System.out.println("\n모두수행하기\n"); // &, |를 하나만 사용할 경우 참거짓의 여부에 상관없이 모든 것을 실행함
		
		c = abc() | def();
		System.out.println("묶음 수행 후 c는(or) " + c); 
		c = def() |abc();
		System.out.println("묶음 수행 후 c는(or) " + c);
		
		c = abc() & def();
		System.out.println("보따리 수행 후 c는(and) " + c); 
		c = def() & abc();
		System.out.println("보따리 수행 후 c는(and) " + c);
		
		System.out.println("\n 실습 : 키보드(표준입력장치)로 값 받기\n");
		inputTest();
		
		
	}
	
	//public static void aa() {    // 독립적(반복적)으로 실행되는 코드를 별도의 묶음으로 작성. void는 aa 처리 후 빈손으로 돌아간다는 의미
	public static boolean aa() { // aa 처리 후 돌아갈 때 boolean 값을 가지고 감. 반환값
		System.out.println("아자1");
		//System.out.println("아자2");
		return true;
	}
	
	public static boolean abc() {
		System.out.println("abc 출력, 한줄 수행했지만 abc는 여러 행으로 구성된다고 가정");
		return true;
	}
	
	public static boolean def() {
		System.out.println("def 출력");
		return false;
	}
	
	public static void inputTest() {
		 String ir = "손오공";
		 int nai = 22;
		 System.out.println(ir + "님의 나이는 " + nai + "입니다.");
		 
		 System.out.println();
		 Scanner sc = new Scanner(System.in);   //Scanner의 경우 잘 사용하지 않는 것이므로 위에 출처를 import로 밝혀준다. 또한 앞에 new를 붙여야함.
		 System.out.print("이름 입력: ");
		 String name = sc.next();
		 System.out.print("나이 입력: ");
		 int age = sc.nextInt();
	 	 System.out.println(name + "씨의 나이는 " + age + "입니다.");
	}
	

}

	