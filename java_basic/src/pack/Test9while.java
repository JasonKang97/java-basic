package pack;

import java.util.Scanner;

public class Test9while {

	public static void main(String[] args) {	//반복문 while : while(조건){반복처리 대상}
		int w=1;		//while은 사용할 변수를 먼저 선언해 주어야함.
		while(w<=5) {
			System.out.println("w : " + w + " ");
			w++;	//조건이 거짓이 되는 명령문을 걸어주지 않으면 무한반복함.
		}
		System.out.println("탈출 후 w : " + w);
		
		
		System.out.println();
		int count = 0;
		while(count<10) {
			count++;
			System.out.println("count: " + count);
			if(count ==10) {
				System.out.println("count가 10이라서 반복문 종료");
				}	
			}
		System.out.println();	//다중 while문
		int a =1;
		while(a<=3) {
			System.out.println("a: " + a);
			int b = 1;
			while(b<=4) {
				System.out.print("b=" + b + " ");
				b++;
			}
			a++;
			System.out.println();
			
			System.out.println("do while문");	//최소 1회는 반드시 수행.
			int m = 10;
			do {
				System.out.println("do while의 m: " + m);
				m++;
			}while(m<=5);
		}
		System.out.println("continue, break");
		int x = 0;
		while(x<=10) {
			x++;
			if(x==3) continue;
			if(x==7) break;
			System.out.println("x: " + x);
		}
		
		System.out.println("무한루프(Looping)");
		int y = 1;
		while(true){
			System.out.println("y: " + y);
			y++;
			if(y==5)break;
		}
		
		System.out.println("\n1~100 사이의 정수 중 짝수만 출력하고 그 갯수도 출력\n");
		int i=1;
		int number=0;
		while(i<=10) {
			if(i%2==0) {
				System.out.println(i);
				number++;
			}
			i++;
		}
		System.out.println("총 걧수: " + number);
		//System.exit(0); //현재 실행 중인 프로그램 무조건 종료
		
		System.out.println();
		System.out.println("문2) 키보드로 정수를 입력받아 1부터 그 수까지의 합을 출력");
		//조건 : 위 작업을 계속 반복할지 여부를 묻고 탈출 결정
		
		Scanner scan = new Scanner(System.in);
		while(true) {	//break를 만날때 까지 무한반복. for(;;)과 같은 문장.
			System.out.print("양의 정수를 입력:");
			int num = scan.nextInt();
			if(num<=1) {	//1 이하의 값이 입력되면 작업 종료
				System.out.println("2이상의 정수를 입력하세요");
				continue;
			}
			int n=1, total=0;
			while(n<=num) {	//키보드에서 입력한 숫자보다 작은 동안 반복
				total+=n;
				n++;
			}
			System.out.println("1부터 해당 숫자의 합은: "+total);
			
			System.out.println("계속하시겠습니까?(1(Y)/0(N))");
			String imsi=scan.next();
			if(!imsi.equals("Y")) {		//!: 조건 부정
				System.out.println("\n작업종료");
				break;
			}
		}
		scan.close(); //사용중인 자원 해제
		
		
	}

}
