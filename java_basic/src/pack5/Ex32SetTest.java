package pack5;

import java.util.HashSet;
import java.util.Iterator;

// Collection: 객체를 담을 수 있는 기억장소. 사용 목적에 적합한 자료구조로 묶어 하나로 그룹화한 객체.
//많은 수의 데이터를 그 사용 목적에 적합한 자료구조로 묶어 하나로 그룹화한 객체를 말한다.
//자바에서는 이러한 컬렉션을 위한 인터페이스와 클래스들이 있다.
//컬렉션의 종류는 ArrayList(가장 중요), LinkedList, Vector, Stack, HashSet, TreeSet, HashMap, TreeMap
//List : list라는 이름과 같이 목록처럼 데이터를 순서에 따라 관리한다. 중복을 허용한다.
//Set : 중복이 허용되지 않는 데이터를 관리한다. 
//Map : 데이터를 Key와 Value로 짝을 이루어 관리하며, Value는 중복될 수 있지만 Key값은 중복을 허용하지 않는다. 
//Queue : 데이터 In / Out 순서를 FIFO 방식으로 관리한다. (FIFO : First In First Out)
//Stack : 데이터 In / Out 순서를 LIFO 방식으로 관리한다. (LIFO : Last In First Out)


public class Ex32SetTest {	// set은 중복 불허, 순서가 없다.
	public static void main(String[] args) {
		// collection 타입 클래스<제네릭>: 제네릭은 컬렉션에 저장할 객체의 타입을 제한하는 역할. Object(모든 것을 포함), String, Integer, Double 등
		//HashSet<Object> hlist = new HashSet<Object>();
		HashSet<String> hlist = new HashSet<String>();
		//hlist.add(1);	// 1은 기본형 int인데 collection에 넣으면 자동으로 Integer(wrapper class, 기본타입을 객체로 다루기 위해 사용하는 클래스) 클래스로 변환되어 저장된다.
		//hlist.add(1.5);	// 1.5는 기본형 double인데 collection에 넣으면 자동으로 Double(wrapper class, 기본타입을 객체로 다루기 위해 사용하는 클래스) 클래스로 변환되어 저장된다.
		hlist.add("첫번째");
		hlist.add("세번째");
		hlist.add("두번째");
		hlist.add("첫번째");
		hlist.add("두번째");
		System.out.println("hlist 크기: " + hlist.size());
		hlist.remove("두번째");
		System.out.println("hlist 크기: " + hlist.size());

		System.out.println();
		// Iterator 반복자는 객체 지향적 프로그래밍에서 배열이나 그와 유사한 자료구조의 내부 요소를 순회하는 객체이다.
		// 출력방법1
		Iterator iter = hlist.iterator();
		while(iter.hasNext()) {
			String str = (String)iter.next();
			System.out.println(str);
		}
		
		// 출력방법2
		System.out.println();
		Object obj[] = hlist.toArray();	// 컬렉션을 배열로 변환
		for(int i=0; i<obj.length;i++) {
			System.out.println(obj[i]);
		}
		
		//출력방법3
		System.out.println();
		for(String aa:hlist) {
			System.out.println(aa);
		}
		
	}
}
