package pack2;

//package: 성격이 비슷한 클래스들을 특정 패키지(폴더)에 저장해 두고 import를 이용해 다른 클래스의 멤버를 호출할 수 있다.
public class Ex5Bank {
	private int money = 1000;
	int imsi = 111;
	public int imsi2 = 222;
	
	public Ex5Bank() {
	}
	public Ex5Bank(int money) {	// 생성자 오버로딩(constructor overloading)
		this.money += money;	//누적
	}
	public void deposit(int amount) {	//입금
		if(amount>0) this.money+=amount;
	}
	public void withdraw(int amount) {	//출금
		if(amount>0 && money-amount>=0) money-=amount;
		else System.out.println("출금액에 문제가 있습니다.");
	}
	
	public int getMoney() {	// 잔금 확인
		return money;
	}
	
	
}


//다시 돌아가는 메소드 찾아보기