package pack2;

public class Ex1Main {	//Ex1Main은 main 메소드를 실행하기 위한 클래스임.

	public static void main(String[] args) {
		//main은 응용 프로그램의 시작을 위해 정해진 메소드
		//Ex1Car 설계도로 객체를 생성. 이런 과정을 '객체를 인스턴스(instance)한다'라고 함
		//즉, 클래스로부터 객체를 만드는 과정을 클래스의 인스턴스화라고 하며, 어떤 클래스로부터 만들어진 객체를 그 클래스의 인스턴스라고 한다.
		//객체는 모든 인스턴스를 대표하는 포괄적인 의미이다.
		//클래스  --  인스턴스화>>>객체
		
		//Ex1Car.class를 주기억장치로 읽은 후 car1이라는 객체변수를 선언.
		//new 키워드로 인스턴스를 진행. 이때 Ex1Car()이라는 생성자를 호출.
		Ex1Car car1=new Ex1Car();	
		// 메소드를 부르게 되면 보조기억 장치에서 Static으로 해당 class(Ex1Car)가 불려오고 Stack에 객체변수(car1)를 선언함. 이를 통해 최종적으로 Heap에 객체가 생성되고 주소를 가진다.
		//new는 인스턴스, 뒤의 Ex1Car는 생성자를 호출하는 것이다. car1은 객체변수로 객체의 주소를 기억하고 있으며 이를 불러오기 위해 선언한다.
		//car1=null;을 선언할 경우 stack에 생성된 car1이 사라짐. 해당 객체를 일정시간 이용하지 않을 경우 GC(garbage collector)가 Heap에서 제거함
		
		//Ex1Car 멤버필드(전역변수) 호출
		System.out.println(car1.wheel);			//접근지정자가 default로 호출 가능. private는 할 수 없음. int는 변수로 지정하지 않으면 기본적으로 0으로 지정됨.
		System.out.println(car1.irum);			//String은 참조형변수이므로 heap에 저장된 객체가 없어 null로 뜸.
		
		System.out.println();
		//Ex1Car 메소드 호출
		//car1.abc(); 해당 메소드는 private로 불러올 수 없음.
		car1.def();
		System.out.println();
		
		String ss=car1.driving();
		ss = "와우 " + ss;
		System.out.println(ss);
		
		System.out.println(car1.driving());
		System.out.println();
		
		car1.drivingGood(2);	//인수(argument)를 지정. 매개변수가 있는 메소드를 호출.	객체변수.메소드명(인수)
		
		System.out.println();
		Ex1Car car2 = new Ex1Car();	//새로운 객체 생성
		//car1과 car2는 type이 같은 두개의 객체변수
		System.out.println(car2.wheel);
		car2.def();
	}

}



