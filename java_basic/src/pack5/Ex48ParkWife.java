package pack5;

public class Ex48ParkWife extends Thread{	// 은행을 이용하는 박씨 부인 class. Thread는 runnable interface를 implement하였기 때문에 run method를 가지고 있음.
	@Override
	public void run() {
		Ex48BankMain.hanaBank.minusMoney(3000);
		System.out.println("박씨 아내 출금 후 잔고 확인: " + Ex48BankMain.hanaBank.getMoney());
	}

}
