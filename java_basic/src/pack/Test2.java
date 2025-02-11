package pack;

public class Test2 {
	public static void main(String[] args) {
		String irum = "신기해";
		System.out.println(irum);//출력 후 줄 변경
		System.out.println(irum);//일반 출력
		System.out.println("행복");//일반 출력
		byte var1;
		var1 = 104; var1 = 5; // byte var1; >>> 1바이트(-128~127, 8bit) 정수 기억장소
		System.out.println(var1);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		byte var2 = 123; //대입(치환) 연산자
		var2 = 2;
		System.out.println("가나다"+var2);
		
		System.out.println(); // 이 경우 아무것도 없이 줄을 비울 수 있음
		short var3 = 10; // short var3; >>> 2바이트(-32768~32767) 정수 기억장소
		var3 = 32323;
		System.out.println("var3:" + var3);
		
		System.out.println(); 
		int var4 = 10; // int var4; >>> 4바이트(+- 약 20억) 정수 기억장소
		var4 = 567231566;
		System.out.println("var4:" + var4);
		
		System.out.println();
		byte aa = 10;  // 자동 형변환(int 타입의 10을 byte 타입으로 자동 형변환 후 기억) >>> promotion
		aa = (byte)129;  // 강제 형변환(cast 연산자를 이용해 casting함)
		System.out.println("aa:"+aa);
		int imsi=123321;
		byte bb = (byte)imsi;
		System.out.println(bb+"bb");
		
		System.out.println(); 
		long var5 = 10; // long var5; >>> 8바이트 정수 기억장소
		var5 = 23232323211L;  // long 타입의 경우 4바이트 이상의 숫자 뒤에 L을 붙여준다
		System.out.println("var5:"+var5);
		
		float f1 = 2111111111;  // 정수는 실수로 자동 형변환(promotion) >>> 4byte
		//f1 = 123.12;  >>> error
		f1 = 123.12f;  //소숫점 이하의 자리를 붙일 경우 float 타입으로 바꾸기 위해 뒤에 f(F도 가능)를 붙임
		f1 = (float)123.123;
		System.out.println("f1:"+f1);
		
		
		double d1 = 123.123123123123123123;  // 실수형 기억장소(8byte) : 소수이하 15자리 정밀도 보장
		System.out.println("d1:"+d1);
		
		System.out.println();
		// int int1 = 3.5;  >>>  error
		int int1 = (int)3.7;  // 소수이하는 버리고 정수만 기억함
		System.out.println("int1:"+int1);
		
		int int2 = 12 + (int)10.5;
		int2 = (int)(12.6 + 10.5);  // 뒤의 숫자와 함께 사용한 소괄호는 우선순위의 연산자로 생각함
		int2 = (int)12.6 + (int)10.5;
		System.out.println("int2:"+int2);
		
		double int3 = 12 + 10.5;  //정수는 실수화 후 연산에 참여
		System.out.println("int3:"+int3);
		
		System.out.println();
		boolean bu1 = false;
		bu1 = true;
		System.out.println("bu1:" + bu1);
		
		System.out.println();
		char c1 = 'b';
		c1= 'A'; // '' 안에 두글자 이상 또는 ""를 사용하면 오류
		System.out.println("c1:" + c1 + " " + (int)c1 + " " + (char)65);
		//Ascii 코드에서 'A'는 십진수 65, 'a'는 97, '0'은 48, 'line feed(줄 바꾸기)'는 10, 'carriage return'(줄 앞으로 돌아가기)은 13
		
		System.out.println("안녕" + (char)10 + "반가워");
		int abc = 0x30;  // 16진수 10진수의 int 형으로 저장. 0x리터럴
		System.out.println("abc: " + abc + " " + Integer.toHexString(14) + " " + Integer.toBinaryString(14));
		  // Integer.toHexString()는 10진수를 16진수로 표현, Integer.toBinaryString()는 2진수로 표현
		
		int abc2 = 077;   // 8진수를 10진수의 int형으로 저장. 0리터럴
		System.out.println("abc2 : " + abc2);
		
		System.out.println();
		final double PI = 3.14; // 앞에 final을 넣으면 변수가 아닌 상수로 지정함으로 변경 물가. 일반적으로 final로 지정할 경우 문자를 대문자로만 사용
		System.out.println("PI^2 : " + PI*PI);
	}
}


//변수 : 값(데이터)을 저장할 수 있는 메모리 공간(새로운 값을 입력하면 덮어쓰기 됨)
//변수명 : 변수에 대한 임의의 이름 >>> 형식이 있음. 타입 변수명 = 리터럴(문자, 숫자 등)
//상수 : 처음에 입력한 값이 계속 유지되는 메모리 공간
//변수 기본형 타입 : bcbsilfd(boolean, char, byte, short, int, long, float, double)
//기본형처럼 사용하는 참조형 변수 : String
//byte type
// 논리형(boolean, 참 또는 거짓 결과의 자료형)
//문자형(char, 한 개의 문자 기억)
//대부분의 경우 int, double, boolean, String(참조형, 즉 class이므로 첫 글자는 대문자로 사용)만 사용함






