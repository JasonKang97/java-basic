package pack2;

public class Student {

	private String name;
	private int grade;
	private double score;
	
	public Student(String name, int grade, double score) {
		this.name = name;
		this.grade = grade;
		this.score = score;
	}

	
	void printStudentInfo() {
		System.out.println("이름: [" + name + "], 학년: [" + grade + "], 평균 점수: [" + score + "]");
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public void setScore(double score) {
		this.score=score;
	}
	
	
	
	
	
	//main 메소드는 프로그램을 실행하기 위한 메소드. Student 멤버는 아니다.
	public class Ex2Exam {
		public static void main(String[] args) {
			Student info = new Student("홍길동", 1, 100);
			info.printStudentInfo();
			
			System.out.println();
			Student info2 = new Student("안철수", 2, 78.6);
			info2.printStudentInfo();
		}
	}
	
}
