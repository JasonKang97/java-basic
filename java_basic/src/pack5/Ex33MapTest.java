package pack5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//Map : 데이터를 Key와 Value로 짝을 이루어 관리하며, Value는 중복될 수 있지만 Key값은 중복을 허용하지 않는다. 

public class Ex33MapTest {	// Map type의 컬렉션: key와 value로 구성됨.
	// key는 중복 불허하나, value는 중복 허용.
	public static void main(String[] args) {
		HashMap<String, String> mlist = new HashMap<String, String>();
		
		mlist.put("0", "하나");
		mlist.put("1", "둘");
		mlist.put("2", "셋");
		mlist.put("3", "셋");
		//mlist.put("3", "넷");	// 이 경우 "3"이라는 key에는 "셋"이라는 value에서 "넷"이라는 value로 덮어쓰기가 일어남
		System.out.println("mlist 크기: " + mlist.size());
		System.out.println(mlist.containsKey("2"));
		System.out.println(mlist.containsValue("kbs"));
		
		// 출력방법1
		System.out.println();
		Set set = mlist.keySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			String k =(String)iter.next();
			System.out.println(k + " " + mlist.get(k));
		}
		
		// 출력방법2
		System.out.println();
		for(String k:mlist.keySet()) {
			String value = mlist.get(k);
			System.out.println(k + " " + value);
			
		}
		
		
	}
}
