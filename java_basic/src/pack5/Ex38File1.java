package pack5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Ex38File1 {
	public static void main(String[] args) throws Exception {
		// 1바이트 단위의 입출력
		
		System.out.println("1바이트 입력");
		int a = System.in.read();	// 아스키 코드로 출력됨. 1바이트이므로 한글 등의 2바이트 문자는 입력 불가.
		System.out.println("a: " + a + " " + (char)a);
		
		System.out.println("\n문자열 출력");
		OutputStreamWriter os = new OutputStreamWriter(System.out);
		byte b = 97;
		os.write(b);
		os.flush();
		
		// buffer를 사용 >>> file 입출력(input/output) 성능을 향상시키고 처리 속도가 빨라짐.
		BufferedWriter bw = new BufferedWriter(os, 1024);	// 입출력은 기본이 1024byte(1kb)단위로 처리된다.
		PrintWriter out = new PrintWriter(bw);
		out.println(123);
		out.println("문자열 출력");
		out.close(); // 자원 해제(메모리 반납, GC(Garbage collector)의 대상)
		bw.close();
		
		System.out.println("\n파일 단위의 출력");
		File f = new File("c:/work/iotest.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw1 = new BufferedWriter(fw,1024);
		PrintWriter out1 = new PrintWriter(bw1);
		
//		PrintWriter out1 = new PrintWriter(new BufferedWriter(new FileWriter("c:/work/iotest.txt")));	>>> 한문장으로 만들면 이렇게 가능함.
		out1.println(1234);
		out1.println("문자열이 파일로 출력됨");
		out1.close();
		bw1.close();
		fw.close();
		
		
	}
	
}
