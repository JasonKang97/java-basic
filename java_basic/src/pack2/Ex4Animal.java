package pack2;

//method overloading: 클래스 내에 동일 이름의 메소드를 복수로 만드는 행위
public class Ex4Animal {	//동물들이 가져야할 속성(field)과 행위(method)를 클래스로 설계
	private int leg=4;		//멤버필드는 두개 이상의 메소드에서 사용하겠다는 의미. 불필요하다면 지역변수로 선언하는게 좋다.
	private int age;
	private String name;
	public final static int MOUTH=1;
		
	public Ex4Animal() {
		//내용이 없는 생성자는 적지 않으면 컴파일러가 자동으로 생성해준다.
		System.out.println("내용이 없는 생성자");
	}
	public Ex4Animal(int leg) {	//생성자 오버로딩
		this.leg=leg;
		System.out.println("정수 1개를 받는 생성자");
	}
	public Ex4Animal(String name, int age) {	
		this.name=name;
		this.age=age;
		System.out.println("2개의 매개변수가 있는 받는 생성자");		
	}
	
		
	public void display() {
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
	}
	
	
	//오버로딩의 성립 조건: 매개변수의 갯수, 순서, 타입이 다르면 된다. 
	public void display(int age) {	//메소드 오버로딩
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
	}
	public void display(String name) {
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
	}
	public void display(int age, String name) {
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
	}
	public void display(String name, int age) {
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
	}
	
	
	
	
//	public void display(int leg) {	//위에 int age가 있기 때문에 메소드 오버로딩이 되지 않음.
//		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
//	}
	
//	public int display(int leg) {	//메소드와 변수만 본다. 즉 이 메소드도 오버로딩 불가능.
//	System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
//		return 5
//}
	
}



