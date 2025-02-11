package pack5;

import java.io.FileNotFoundException;
import java.io.FileReader;

// 예외처리: 키보드 입력, 파일 입출력, 네트워크, DB 처리 등 외부 장치와 연결해 사용할 때 주로 이용한다.
// 예기치 못한 장치 에러가 발생할 경우 중단되는 것을 방지할 목적으로 사용한다. 즉, 에러가 있더라도 끝까지 진행시킬 목적으로 사용한다.
// 형식: try{} catch{} finally{}	>>> 에러를 내가 잡아 예외를 처리.
// throws로 JVM에게 던져버릴 수도 있다.

public class Ex31try {
	String name = "tom";
	
	public void test() {
		try {
			int a[]= {1,2,3};
			//System.out.println("배열 값 출력: " + a[1]);
			System.out.println("배열 값 출력: " + a[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열오류 - 지역이 우선함. " + e);
		}
	}
	
	public void test2() throws Exception {	// 에러를 처리하지 않고 무시하며 진행하나 좋은 방법은 아니다.
		FileReader fr2 =new FileReader("c:/work/kbs.txt");

	}
	
	public static void main(String[] args) {
		try {
			// 파일 작업은 강제로 예외 처리를 요구.
			// aa.txt가 없는 경우에만 catch 블록을 수행.
			FileReader fr =new FileReader("c:/work/aaa.txt");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일읽기 오류");
		}
		
		
		try {
			int su = 0;	// 키보드로 변수값을 기억한다고 가정.
			//int su = 2;
			int result = 10 / su;
			System.out.println("result: " + result);	// 에러가 발생시 그 즉시 catch로 넘어감.
			
			Ex31try ex31try = new Ex31try();
			//Ex31try ex31try = null;
			System.out.println("이름은 " + ex31try.name);
			
			ex31try.test();
			
			ex31try.test2();
			
		} catch (ArithmeticException e) {
			System.out.println("나누기 오류: 0으로 나누기 불가");
		} catch (NullPointerException e) {	// 변수 e가 error를 가지고 있다. 왜 catch로 넘어왔는지 확인 가능.
			System.out.println("참조변수 오류(변수가 주소를 참조하지 않는다.) " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 참조 에러: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("위 catch 이외의 나머지 모든 오류는 여기서 처리");
			// Exception을 가장 먼저 적으면 모든 예외처리는 Exception 블록에서 처리한다. 주로 가장 아래에 사용한다.
		} finally {	// 에러 유무에 상관없이 반드시 수행함.
			System.out.println("에러 유무에 상관없이 반드시 수행.");
		}
		
		
		System.out.println("프로그램 종료");
		
	}
}
