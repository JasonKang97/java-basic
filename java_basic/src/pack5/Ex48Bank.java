package pack5;

public class Ex48Bank {
	private int money = 10000;	// thread가 공유할 자원
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	//public void saveMoney(int mon) {	// 입금
	synchronized void saveMoney(int mon) {	
		// synchronized가 적용된 method내의 멤버필드는 사용자 정의 thread에서 공유가 가능.
		// 어떤 thread가 멤버필드 money를 사용하는 동안 Lock이 걸림.
		// saveMoney method 수행이 끝나면 자동으로 Lock이 풀림.
		int m = this.getMoney();
		try {
			Thread.sleep(2000);	// 입금 지연시간 2초
		} catch (Exception e) {
			// TODO: handle exception
		}
		this.setMoney(m+mon);
	}
	
	public synchronized void minusMoney(int mon) {	// 출금
		int m = this.getMoney();
		try {
			Thread.sleep(3000);	// 입금 지연시간 3초
		} catch (Exception e) {
			// TODO: handle exception
		}
		this.setMoney(m-mon);
	}
	
}
