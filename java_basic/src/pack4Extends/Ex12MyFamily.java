package pack4Extends;

public class Ex12MyFamily {
	public static void main(String[] args) {
		Ex12GrandFa granFa=new Ex12GrandFa();
		System.out.println("가보: " + granFa.gabo);
		System.out.println("가보: " + granFa.gahun);
		granFa.say();
		System.out.println("할아버지 나이: " + granFa.getNai());
		
		System.out.println();
		Ex12GrandFa grandFa2 = new Ex12GrandFa(77);
		System.out.println("할아버지 나이: " + granFa.getNai());
		
		System.out.println("--------------");
		Ex12Father father = new Ex12Father();
		System.out.println("가보: " + father.gabo);
		System.out.println("가보: " + father.gahun);
		father.say();
		System.out.println("아버지 나이: " + father.getNai());
		father.eat();
		System.out.println("집: " + father.getHouse());
		father.showData();
		
		System.out.println("--------------");
		Ex12Me me = new Ex12Me();
		System.out.println("가보: " + me.gabo);
		System.out.println("가보: " + me.gahun);
		me.say();
		System.out.println("내 나이: " + me.getNai());
		father.eat();
		System.out.println("집: " + me.getHouse());
		me.Biking();
		
	}
	
}
