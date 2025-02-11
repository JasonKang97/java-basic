package pack5;

import java.util.ArrayList;
import java.util.List;

//List : list라는 이름과 같이 목록처럼 데이터를 순서에 따라 관리한다. 중복을 허용한다.
public class Ex34List {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("볼펜");
		list.add("연필");
		list.add("볼펜+");
		list.add("볼펜");
		list.add("마우스");
		System.out.println("list의 크기: " + list.size());
		list.remove("볼펜");	// 동일한 데이터 중 가장 앞의 데이터를 지움.
		System.out.println("list의 크기: " + list.size());
		list.remove(1);	// 순서로도 삭제 가능.
		System.out.println("list의 크기: " + list.size());
		System.out.println("list의 0번째는 " + list.get(0));

		System.out.println();
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		for(String idx:list) {
			System.out.println(idx);
		}
		
	}

}
