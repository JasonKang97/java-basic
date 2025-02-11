package pack5;

public class Ex48Park extends Thread{	// 은행을 이용하는 박씨 class. thread는 runnable interface를 implement하였기 때문에 run method를 가지고 있음.
	@Override
	public void run() {
		Ex48BankMain.hanaBank.saveMoney(5000);
		System.out.println("남편 예금 후 잔고 확인: " + Ex48BankMain.hanaBank.getMoney());
	}

}
