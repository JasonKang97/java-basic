package pack;

import java.util.Scanner;

public class Test6_if {       	//단순 if문
	public static void main(String[] args) {
		System.out.println("무언가를 사행 후 if문 만나기");
		int num = 7;
		
		if(num>=3){
			System.out.println("크구나");
			System.out.println("진짜 크네"); // 중괄호로 묶어주지 않을 경두번째 줄부터는 if문과 상관이 없음.
		}
		System.out.println("계속1");

		if(num>=10){
			System.out.println("크구나");
			System.out.println("진짜 크네"); 
		}
		
		else { // 조건이 false
			System.out.println("크지 않네");
		}
		System.out.println("계속2");
		
		
		
		int jumsu = 66;
		if(jumsu>=70) {
			if(jumsu >= 90) {
				System.out.println("우수");
		}
			else {
				System.out.println("보통");
			}
		}
		else {
			if(jumsu >= 50) {
				System.out.println("저조");
			}
			else {
				System.out.println("매우 저조");
			}
		}
		
		
		System.out.println("\n계속");
		
		int jumsu2 = 55;
		String result = "";
		
		if(jumsu2 >= 90) {
			result = "수";
		}
		else if(jumsu2 >= 80) {
			result = "우";
		}
		else if(jumsu2 >= 70) {
			result = "미";
		}
		else if(jumsu2 >= 60) {
			result = "양";
		}
		else {
			result = "가";
		}
		System.out.println("학생의 점수는 " + result + "입니다.");
		
		System.out.println("\n계속4");
		//8세 이하, 65세 이상인 경우 무료, 9세 이상 20세 미만인 3000원, 그 외는 5000원
		
		int age = 35;
		if(8 >= age || age >= 65) {
			System.out.println("무료입니다.");   // 독립적인 if문이 3개로 모두 실행함. 즉, 속도가 느리다.
		}
		if(9 <= age && age < 20) {
			System.out.println("3000원입니다.");	
		}
		if(20 <= age && age < 65) {
			System.out.println("5000원입니다.");
		}
		
		int price = 0;		// 독립적인 if문이 1개로 속도가 빠르다.
		if(9 <= age && age < 20) {
			price = 3000;
		}
		else if(20 <= age && age < 65) {
			price = 5000;
		}
		else {
			price = 0;
		}
		System.out.println("입장료는 " + price + "원입니다.");

	
		System.out.println("\n로그인 하기");
		String id = "kbs";
		String password = "ok123";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("id: ");
		String inputID = scan.nextLine();
		System.out.print("password: ");
		String inputPwd = scan.next();
		
		// if(inputID == id && inputPwd == password) {   >>>>>  이는 기본형에서만 적용됨
		if(inputID.equals(id) && inputPwd.equals(password)) {  //  String값을 비교할 경우 equals를 사용해야함
			System.out.println("Welcome.");
		}
		else {
			System.out.println("Log in fail");
		}
		
		
	
	}
}




