package pack;

public class Test3 {
	public static void main(String[] args) {  //산술연산자
		int a = 8;  // 대입 연산자의 기능(a 변수에 리터럴 5를 기억시킴)
		int b = 3;
		int c = a + b;
		System.out.println(c);
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);  // 몫
		System.out.println(a % b);  // 나머지
		System.out.println((double)(a / b));
		System.out.println(a / (double)b);  // 몫과 나머지

		System.out.println();
		//System.out.println(a/0);  //불증. runtime error(실행 불가능)
		System.out.println(a/0.0); // Infinity(무한대)
		System.out.println(a%0.0);  //NaN(Not a number) 숫자가 아니라 숫자로 표현할 수 없는 상태
		
		
		System.out.println();
		System.out.println(3+4*5);
		System.out.println((3+4)*5);
		
		System.out.println();
		String ss1 = "대한";   // String은 기본형이 아니라 참조형변수임. 사용방법은 기본형과 같다.
		String ss2 = "민국";
		System.out.println(ss1 + ss2); // 문자열 더하기
		System.out.println(ss2 + " " + 2025); // 2005 정수는 문자열로 자동 형변환 후 문자열 더하기를 함 
		System.out.println(ss2 + " " + 2000 + 25);
		System.out.println(ss2 + " " + (2000 + 25));
		
		String ss3 = "5" + 6;
		System.out.println("ss3: "  + ss3);
		System.out.println("5" + 6);
		System.out.println(Integer.toString(5) + 6);  // Integer.toString() >>> 정수를 문자열로 변경
		System.out.println(Integer.parseInt("5") + 6);  //  Integer.parseInt() >>> 정수 모양의 문자열을 정수로 변경
		
		System.out.println();
		int no = 1;
		no = no + 1; // 누적
		no += 1; // += -= *= /= 다 가능
		no++; // 증감연산자(후위). 1씩 늘어남. no--의 경우 1씩 감소
		++no; // 증감연산자(전위)
		System.out.println("no : " + no);
		
		System.out.println();
		int imsi = 5;
		int result = ++imsi + 1; // 늘어난 후에 연산
		System.out.println("result : " + result);
		System.out.println("imsi : " + imsi);
		System.out.println();
		
		int imsi2 = 5;
		int result2 = imsi2++ + 1; //연산 후 늘어남. 헷갈리므로 독립적으로 사욯하는 것 추천
		System.out.println("result2 : " + result2);
		System.out.println("imsi2 : " + imsi2);
		
		System.out.println();
		System.out.println("부호");
		int imsi3 = -7;
		System.out.println("imsi3 : " + imsi3);
		System.out.println("imsi3 : " + -imsi3);
		System.out.println("imsi3 : " + (-1*imsi3));
		int imsi4 = -1 * imsi3;
		System.out.println("imsi4 : " + imsi4);
		
		
		System.out.println();
		
		
		
		System.out.print("산술 연산자" + (char)13 + "및 기타 \n연습 끝");
		// \n \b \t 등은 escape 문자
	}

}




