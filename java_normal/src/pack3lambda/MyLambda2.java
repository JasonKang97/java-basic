package pack3lambda;

interface MyInter {
	void aaa();
}

interface MyInterArg {
	void bbb(int a, int b);
}

interface MyInterArgReturn {
	int ccc(int a, int b);
}

public class MyLambda2 {
	public static void main(String[] args) {
		// 1) 인자(Argument)가 없는 추상 메소드 처리
		MyInter inter1 = new MyInter() {
			@Override
			public void aaa() {
				System.out.println("익명 클래스의 메소드 오버라이딩");

			}
		};
		inter1.aaa();
		System.out.println();
		
		// 람다식으로 표현
		MyInter inter2 = () -> System.out.println("익명 클래스의 메소드 오버라이딩"); // 문장이 하나일 경우 {} 생략 가능
		inter2.aaa();
		System.out.println();
		
		MyInter inter3 = () -> {
			System.out.println("익명 클래스의 메소드 오버라이딩");
			int imsi = 1;
			System.out.println("익명 클래스의 메소드 오버라이딩: " + imsi);
		};
		inter3.aaa();
		System.out.println("-----------");
		
		// 2) 인자(Argument)가 있는 추상 메소드 처리
		MyInterArg interArg = new MyInterArg() {
			
			@Override
			public void bbb(int a, int b) {
				System.out.println("두 수의 합은 " + (a+b));
			}
		};
		interArg.bbb(5, 4);
		
		// 람다식으로 표현: 매개 변수가 1개 일 때는 (a)를 ()를 빼고 a -> 도 가능함.
		MyInterArg interArg2 = (a,b) -> System.out.println("람다: 두 수의 합은 " + (a+b));
		interArg2.bbb(5, 4);
		System.out.println("-----------");

		// 3) 반환 값이 있는 추상 메소드 처리
		MyInterArgReturn myInterArgReturn = new MyInterArgReturn() {
			
			@Override
			public int ccc(int a, int b) {
				System.out.println("ccc 처리");
				return a+b;
			}
		};
		int result = myInterArgReturn.ccc(2, 3);
		System.out.println("두 수를 더한 결과: " + result);
		
		// 람다식으로 표현
		MyInterArgReturn myInterArgReturn2 = (a,b) -> a+b; 
		int result2 = myInterArgReturn2.ccc(2, 3);
		System.out.println("람다: 두 수를 더한 결과: " + result2);
		
	}
}
