package java_basic2;

import pack2.Ex5Bank;

public class Ex5BankMain3 {
	public static void main(String[] args) {
		Ex5Bank sujan = new Ex5Bank();
		sujan.deposit(5000);
		sujan.withdraw(1000);
		System.out.println("잔고는 " + sujan.getMoney());
	}
}
