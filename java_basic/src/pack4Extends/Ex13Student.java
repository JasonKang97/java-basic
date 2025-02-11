package pack4Extends;

public class Ex13Student extends Object{	//모든 클래스는 Object를 상속 받음. 일반적으로 extends Object 생략됨.
	public String name;
	
	public Ex13Student() {
		name = "tom";
	}
	
	
	@Override	// 자식 클래스에서 메소드를 변경하는 것을 의미.
	public String toString() {
		System.out.println("메소드 변경 진행");
		return "이 클래스의 사용자는 " + name;
	}
	
	
	
	
	
	//------------------------------------
	public static void main(String[] args) {
		Ex13Student student=new Ex13Student();
		System.out.println(student);
		System.out.println(student.toString());
		
	}
}
