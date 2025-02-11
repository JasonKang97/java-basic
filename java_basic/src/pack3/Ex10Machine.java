package pack3;

import java.util.Scanner;

public class Ex10Machine {
	private int cupCount;
	private Ex10CoinIn coinIn = new Ex10CoinIn();

	public void showData() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("동전을 입력하세요 : ");
		coinIn.setCoin(scan.nextInt());
		System.out.print("몇 잔을 원하세요 : ");
		cupCount = scan.nextInt();
		System.out.println((coinIn.calc(cupCount)));
		
		scan.close();
		
	}


}
