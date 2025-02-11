package pack5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex36DtoTest2 {
	private ArrayList<Ex36StudDto> list = new ArrayList<Ex36StudDto>();
	int total;
	public void insertData() {

		Ex36StudDto student = new Ex36StudDto();
		while(true) {
			Scanner scan = new Scanner(System.in);	//	객체 새로 생성. 이 작업을 진행하지 않을시 list에 생성된 것들은 모두 같은 주소를 가지므로 다 같이 바뀜.
			System.out.print("이름입력: ");
			String name = scan.next();
			System.out.print("국어 점수: ");
			int kor = scan.nextInt();
			System.out.print("영어 점수: ");
			int eng = scan.nextInt();
			

			student.setName(name);
			student.setKor(kor);
			student.setEng(eng);
			list.add(student);
			
			System.out.println("계속하시겠습니까?(Y/N)");
			String YorN = scan.next();
			if(!YorN.equals("Y")) {
				break;
			}
		}
	}
	
	public void showData() {
		System.out.println("이름 국어 영어 총점");
		for(int i=0;i<list.size();i++) {
			Ex36StudDto student = list.get(i);
			System.out.println(student.getName() + " " + student.getKor() + " " + student.getEng() + " " + (student.getKor() + student.getEng()));
		}
		System.out.println("응시 인원: " + list.size());
	}
	
	
	public static void main(String[] args) {
		Ex36DtoTest2 test = new Ex36DtoTest2();
		test.insertData();
		test.showData();

	}

}
