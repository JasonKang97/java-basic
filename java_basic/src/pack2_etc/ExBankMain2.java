package pack2_etc;

import pack2.Ex5Bank;	// 다른 패키지의 클래스를 읽으려면 import를 사용.
import pack2.*;		//해당 package에 있는 모든 class를 참조하는 것으로 메모리 낭비가 심함. 비권장.
import java.math.BigDecimal;
import java.lang.System;	// java.lang 패키지의 import는 생략 가능.

// java_basic이 아닌 외부에서 생성된 class를 불러오기 >>> jar 파일이 필요

public class ExBankMain2 {

	public static void main(String[] args) {
		// Ex5Bank와 다른 패키지에서 Ex5Bank 클래스를 참조함.
		Ex5Bank bank1 = new Ex5Bank();
		//System.out.println(bank1.money);	// private 멤버로 접근 불가
		//System.out.println(bank1.imsi);	// default 수준이므로 멤버 접근 불가
		System.out.println(bank1.imsi2);	// public 수준이므로 멤버 접근 가능

		System.out.println(BigDecimal.ONE);	// 전문가가 만든 클래스 참조시 import 필요.
	}

}
