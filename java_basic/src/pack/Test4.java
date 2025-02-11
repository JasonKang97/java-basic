package pack;

public class Test4 {

	public static void main(String[] args) { //관계연산자(<, >, <=, >=등)
		int a = 5;
		
		System.out.println(a > 3);
		System.out.println(a <= 3);
		System.out.println(a == 3);
		System.out.println(a != 3); // !=는 같지 않다는 의미

		boolean bb = a > 3;
		System.out.println("bb : " + bb);
		System.out.println();
		
		System.out.println(); //논리연산자
		int b= 10;
		System.out.println(a > 3 && b <= 10); // &&는 논리곱(and)
		System.out.println(a >= 3 && b == 5); 
		System.out.println(a >= 6 || b < 10); // ||(shift + \)는 논리합(or)
		System.out.println(a >= 3 || b < 10);
		System.out.println(a >= 3 && b < 20 || b == 10);
		
		boolean mbc = 3 + 4 * 2 > a || 2 * (3 + 1) < b;
		System.out.println(mbc);  //연산자의 우선순위 : () > 산술(*,/ > +,-) > 관계 > 논리 > 치환(=)
		
		System.out.println();
		System.out.println("시프트 연산자\n"); // >>, <<, >>>
		int ii = -8, ij= 0 ;
		System.out.println(ii + " " + ij);
		System.out.println("ii : " + ii + " " + Integer.toBinaryString(ii));
		ij = ii << 1; //좌측으로 1 bit 이동. 남는 우측은 0으로 채워넣음
		System.out.println("ij : " + ij + " " + Integer.toBinaryString(ij));
		ij = ii >> 2; // 우측으로 2 bit 이동. 남는 좌측은 부호와 같은 값으로 채워넣음. 양수는 0, 음수는 1
		System.out.println("ij : " + ij + " " + Integer.toBinaryString(ij));
		ij = ii >>> 2; //우측으로 2 bit 이동. 남는 좌측은 0으로 채움
		System.out.println("ij : " + ij + " " + Integer.toBinaryString(ij));

		System.out.println("삼항 연산자");
		int sbs = 6;
		int result = (sbs < 5)? 100:20 + 30; //(조건)? 참일 때 처리문:거짓일 때 처리문
		System.out.println("result : " + result);
		
		System.out.println();
		int x, y, z;
		x=y=z=5;
		System.out.println(x+ " " + y + " " + z);
		
	}

}
