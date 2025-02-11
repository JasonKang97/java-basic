package pack4Extends;

public class Ex17PolyMain {

	public static void main(String[] args) {
		Ex17PolyCar car1 = new Ex17PolyCar();
		Ex17PolyBus bus1 = new Ex17PolyBus();	// 부모 생성자는 자동으로 생성됨.
		Ex17PolyTaxi taxi1 = new Ex17PolyTaxi();	// 부모 생성자는 자동으로 생성됨.
		System.out.println();
		
		car1.displayData();
		System.out.println(car1.getSpeed());
		System.out.println();
		
		System.out.println("버스에 대해");
		bus1.displayData();
		System.out.println(bus1.getSpeed());
		bus1.show();
		
		System.out.println("택시에 대해");
		taxi1.displayData();
		System.out.println(taxi1.getSpeed());
		
		System.out.println("\n-----주소 치환-----");
		Ex17PolyCar car2 = new Ex17PolyBus();	// promotion >>> 자식의 주소를 부모 타입에게 치환.
		car2.displayData();
		//car2.show();	>>> overriding된 메소드만 사용 가능하므로 불가능
		
		System.out.println();
		Ex17PolyCar car3 = taxi1;
		car3.displayData();
		
		System.out.println("\n-----다형성-----");
		//Ex17PolyBus bus2 = new Ex17PolyCar();	부모 타입의 주소를 자식에게 치환하는 것은 불가.
		Ex17PolyBus bus2 = (Ex17PolyBus)car2;	// 부모 타입이지만 자식의 주소를 가지므로 casting 가능.
		bus2.displayData();
		bus2.show();
		
		System.out.println();
		//Ex17PolyTaxi taxi2 = new Ex17PolyCar()	부모 타입의 주소를 자식에게 치환하는 것은 불가.
		Ex17PolyTaxi taxi2 = (Ex17PolyTaxi)car3;
		taxi2.displayData();
		
		//Ex17PolyTaxi taxi3 = (Ex17PolyTaxi)car1;	// java.lang.ClassCastException	>>> car1의 객체 주소는 부모 객체 주소이므로 casting해도 에러 발생.
		
		System.out.println("------------");
		Ex17PolyCar p[] = new Ex17PolyCar[3];	// Car 타입의 배열 선언
		p[0] = car1;
		p[1] = bus1;
		p[2] = taxi1;
		p[0].displayData();
		p[1].displayData();
		p[2].displayData();
		
		System.out.println();
		for(int i=0; i < p.length; i++) {
			p[i].displayData();
		}
		
		System.out.println();
		for(Ex17PolyCar car:p) {
			car.displayData();
		}
		
		
	}

}
