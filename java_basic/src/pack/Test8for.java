package pack;

public class Test8for {

	public static void main(String[] args) {	//반복문 for. 참인동안 반복. 반복횟수가 정회저 있을 경우 자주 사용.
		int a;
		int sum = 0; //누적변수
		for(a=1; a<=5; a+=1) {	//for(변수 초기화; 조건; 증감치){ 반복내용}   ++를 쓰면 1씩 늘어나는 명령어
			System.out.print(a + "\t");// a는 지역변수, 즉 for문 안에서 선언한 것으로 이 외에서는 a값은 정의 불가. 지역화폐와 같은 개념.
			//a=3;  이와같이 반복문 내에서 for문에 사용중인 변수는 갱신 비권장
			sum =  sum + a;
		}
		System.out.println("\nfor 탈출: " + a);
		System.out.println("합은 " + sum);
		
		
		System.out.println();
		for(int i=65; i<=90;i++) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		for(int i = 'A'; i<='Z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nfor 탈출3");
		
		System.out.println();
		for(int i=10; i>1; i-=2) {
			System.out.print(i + " ");
		}
		System.out.println("\nfor 탈출4");
		
		System.out.println();
		for(int ytn=0, tvn=5; ytn<=5; ytn++, tvn++) {
			System.out.println(ytn + ", " + tvn);
		}
		System.out.println("\nfor 탈출5");
		System.out.println();
		int aa=1;
		for(;aa<=5;aa++) {
			System.out.print(aa + " ");
		}
		
		System.out.println("\nfor 탈출6");
		System.out.println();
		for(int sbs =1; sbs<= 10; sbs++) { //짝수만 출력
			if(sbs%2==0) {
				System.out.print(sbs + " ");
			}
			if(sbs==6) break; // 반복문 무조건 탈출		
		}
		
		System.out.println("\nfor 탈출7");
		System.out.println();
		
		for(int m=1; m<=3; m++) {
			System.out.println("m: " + m);
			for(int n=1;n<=4; n++) {
				System.out.print("n= " + n + " ");
			}
			System.out.println();
		}
		System.out.println("\nfor 탈출8");
		System.out.println();
		
		for(char i = 65; i<=90; i++) {
			System.out.print(i + " : ");
			for(char j=i; j<='Z'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("문제");
		//문1) 구구단 3단 출력
		for(int dan=1; dan<10; dan++) {
			System.out.println("3*" + dan + "=" + 3*dan);
		System.out.println();	
		}
	
		
		
		
		
		
		//문2) 2~9단까지 출력
		for(int dan=2; dan<10; dan++) {
			System.out.println(dan + "단");
			for(int j=1; j<10; j++)
			System.out.println(dan + "*" + j + "=" + j*dan);
			System.out.println();
		}
		
		
		
		
		//문3) 1~100 사이의 정수 중 3의 배수이면서 5의 배수를 출력하고, 건수와 그들의 총 합을 출력
		int total=0, count=0;	
		System.out.println("1~100 사이의 3과 5의 공배수");
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i + " ");
				total = total + i;
				count++;
			}
		}
		System.out.println();

		System.out.println("건수: " + count);
		System.out.println("숫자의 합: " + total);
		
		System.out.println();
		System.out.println("continue, break");
		for(int i=1; i<=10; i++) {
			if(i==3 || i == 5)continue;	//continue는 자기와 대응되는 for문으로 무조건 이동한다. 즉 아래의 print로 가지않고 위로 돌아간다.
			System.out.println(i);
			if(i==7)break;
		}
		//무한반복문
		int kk=0;
		for(;;) {	//권장하지는 않는 형태
			kk++;
			System.out.println("kk");
			if(kk==5)break;
		}
	}

}
