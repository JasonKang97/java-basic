package pack5;

import java.util.ArrayList;

public class Ex35DtoTest1 {
	private ArrayList<EX35Student> list = new ArrayList<EX35Student>();

	// DTO 사용 전 방식(DTO X)
	public void aa() {
		String[] persons = new String[3];	// 사람 이름을 기억하기 위한 배열
		persons[0] = "홍길동";
		persons[1] = "나길동";
		persons[2] = "고길동";
		
		for(String s:persons) {
			System.out.println(s);
		}
		
		
	}
	
	// 세명의 학생 정보(학번, 이름, 점수)를 DTO에 저장하기
	public void insertData() {
		EX35Student student = null;

		// 첫번째
		student = new EX35Student();	// DTO 객체 생성
		student.setHakbun("acorn1");
		student.setIrum("홍길동");
		student.setJumsu(90);
		list.add(student);
		
		// 두번째
		student = new EX35Student();	// DTO 객체 초기화
		student.setHakbun("acorn2");
		student.setIrum("나길동");
		student.setJumsu(88);
		list.add(student);
		
		// 세번째
		student = new EX35Student();	// DTO 객체 초기화
		student.setHakbun("acorn3");
		student.setIrum("고길동");
		student.setJumsu(100);
		list.add(student);

		
	}
	
	public void showData() {
		System.out.println("list 크기: " + list.size());
		System.out.println("첫번째 학생 정보: " + list.get(0));
		System.out.println("두번째 학생 정보: " + list.get(1));
		System.out.println("세번째 학생 정보: " + list.get(2));
		System.out.println("세번째 학생 정보: " + list.get(2).getHakbun() + " " + list.get(2).getIrum() + " " + list.get(2).getJumsu());
		
		System.out.println();
		System.out.println("-----반복문을 사용하여 컬렉션에 저장된 DTO의 내용 출력-----");
		for(int i=0;i<list.size();i++) {
			EX35Student studentDto = new EX35Student();
			studentDto = list.get(i);
			System.out.println(studentDto.getHakbun() + " " + studentDto.getIrum() + " " + studentDto.getJumsu());
		}
	}
	
	public static void main(String[] args) {
		Ex35DtoTest1 test1 = new Ex35DtoTest1();
		test1.aa();
		
		System.out.println();
		test1.insertData();
		System.out.println("학생자료 찍기 시도");
		test1.showData();
		
	}

}
