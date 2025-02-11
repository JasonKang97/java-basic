package pack3;

public class Ex11Main {

	public static void main(String[] args) {
		Ex11Book myBook = new Ex11Book("자바 클래스 활용", "홍길동");	// Book 객체 생성
		Ex11Student tom = new Ex11Student("tom", myBook);	// Student 객체 생성
		tom.showStudentDetail();
		
	}

}
