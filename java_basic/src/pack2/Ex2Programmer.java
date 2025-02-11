package pack2;

public class Ex2Programmer {
	public String nickName;	//초기값을 주지 않으면 참조형이므로 null이 된다.
	private int age;	//초기값을 주지 않으면 0이 된다. 은닉화 된 필드
	String spec="정보처리 자격증";
	
	public static String motto="자바에 아름답게 미치자";	// 정적 필드. static 영역에 저장. class의 이름으로 바로 부르기 위해서는 static을 넣으면 된다.
	public final double WEIGHT = 66.78;	//final 멤버 필드는 값 수정 불가. 이름은 대문자로만 쓰기 권장.
	public static final double PI=3.14;	//정적 필드이고 수정 불가. Eclipse에서는 static을 사용하면 기울어져서 보여줌.
	
	
	public Ex2Programmer() {	// 생성자는 필수이나 비워놓아도 무관. 생성하지 않으면 자동적으로 컴파일러가 내부적으로 만들어 준다.
		System.out.println("난 생성자야. 객체 생성시 1회만 호출 가능");
		int number = 20;	//지역변수(Local variable, 메소드 내에서 선언한 변수는 메소드 내에서만 유효)
		age = number + 5;
		nickName="에러잡는 귀신";
	}
	
	public void displayData() {
		System.out.println("\n---");
		String mySpec=responseSpec();	//메소드가 다른 메소드를 호출
		System.out.println(mySpec);
		System.out.println("별명: " + nickName + ", 나이는 " +  age);
		System.out.println("---\n");

	}
	private String responseSpec() {
		return "내가 가진 기술은 " + spec;
	}
	
	
	// 캡슐화: private 멤버 외부에서 제어하기 위한 public 메소드 작성.
	public int getAge() {	//메소드 이름은 약속. get 멤버변수(첫글자는 대문자로 작성)	>>> getter 메소드라고 부름. 자동화를 위해 약속함.
		return age;	//age라는 변수 자체를 반환하는 것이 아니라 age가 가지고 있는 정수를 반환함.
	}
	
	public void setAge(int age) {	//메소드 이름은 약속. set 멤버변수(첫글자는 대문자로 작성)	>>> setter 메소드라고 부름. 자동화를 위해 약속함.
		this.age = age;	//class 내에서 자신의 멤버를 지정하기 위해서 this.를 붙임. 즉, 전역변수(member variable, global variable, field) age를 지역변수(Local variable) age로 치환
	}
	
	public void setAgeEx(int age, int password) {	
		if(password==123) {
			this.age = age;	
			System.out.println("age변경 성공");
		}
		else {
			System.out.println("비밀번호가 틀리므로 age를 수정할 수 없습니다.");
	
		}
	}
}
