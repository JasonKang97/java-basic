package pack;

import java.util.Scanner;

public class Test6ex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("상품명: ");
		String sang = scan.next();
		System.out.print("수량: ");
		int su = scan.nextInt();
		System.out.print("단가: ");
		int dan = scan.nextInt();
		
		int kum = su*dan;
		
		double sekum;
		
		if(kum>=50000) {
			sekum = kum*0.1;
		}
		else if(kum>=30000) {
			sekum = kum*0.05;
		}
		else {
			sekum = kum*0.03;
		}		
		System.out.println("상품명 " + sang + "는 금액: " + kum + "원이고, 세금은 " + (int)sekum + "원 입니다.");

	}
}


/*  
키보드로 상품명(String sang), 수량(int su), 단가(int dan)를 받아 아래와 같이 출력
"상품명 마우스는 금액: 5000원이고 세금은 500원입니다."

조견:
금액(kum)은 수량*단가
세금(sekum)은 금액이 5만원 이상이면 금액의 10%, 3만원 이상이면 금액의 5%, 나머지는 3%를 적용
*/




