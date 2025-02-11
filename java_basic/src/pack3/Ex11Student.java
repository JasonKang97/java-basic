package pack3;

class Ex11Student {
	private String name;
	private Ex11Book book;	//클래스의 포함관계
	
	public Ex11Student(String name, Ex11Book book) {
		this();	// 생성자 호출. 생성자는 다른 생성자를 호출할 수 있다. this();는 가장 먼저 적어야 한다. 아닐 경우 에러뜸.
		this.name = name;
		this.book = book;
	}
	
	public Ex11Student() {
		System.out.println("나는 생성자");
	}

	public void showStudentDetail() {	// 학생 정보 출력
		System.out.println("학생 이름은 " + this.name);
		System.out.println("소유한 책은 " + book.getBookInfo());
	}
}
