package pack2;

public class Ex2Exam {
	public static void main(String[] args) {
		
		Student info = new Student("홍길동", 6, 78.6);
		info.printStudentInfo();
		
		
		System.out.println();
		Student info2 = new Student("홍길동", 1, 100);
		info2.setName("가나다");
		info2.setGrade(3);
		info2.setScore(80.3);
		info2.printStudentInfo();
		
	}
}


//문제1) 학생정보 관리 클래스. 학생 정보를 관리하기 위한 Stdent클래스를 작성하세요
//클래스 이름은 Student입니다. 다음 필드를 포합합니다.
//String name(학생이름), int grade (학년), double score (평균 점수)
//생성자는 모든 필드를 초기화할 수 있어야 합니다.
//학생의 정보를 출력하는 printStudentInfo() 메서드를 작성하세요
//출력형식은 다음과 같습니다.
//이름: [name], 학년: [grade], 평균 점수: [score]
//main 메소드에서 학생 객체를 생성하고 printStudentInfo() 메서드를 호출하세요.