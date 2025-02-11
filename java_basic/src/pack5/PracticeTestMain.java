package pack5;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PracticeTestMain {
	
	ArrayList<PracticeTestDto> list = new ArrayList<PracticeTestDto>();
	
	public void inputData() {
		String datas[] = new String[1];		
		datas[0]="1,강나루,1500000,2005";
		
		for(int i=0;i<datas.length;i++) {
			StringTokenizer tokenize = new StringTokenizer(datas[i], ",");
			int number=Integer.parseInt(tokenize.nextToken());
			String name=tokenize.nextToken();
			int pay=Integer.parseInt(tokenize.nextToken());
			int year=Integer.parseInt(tokenize.nextToken());
			PracticeTestDto dto = new PracticeTestDto(number, name, pay, year);
			list.add(dto);
		}

	}
	
	public void showData() {
		Calendar today = Calendar.getInstance();
		PracticeTestDto dto = list.get(0);
		int 근속년수= today.get(Calendar.YEAR)-dto.getYear();
		int 근속수당;
		int 공제액;
		int 수령액;		
		
		
		System.out.println("사번\t이름\t기본급\t근무년수\t근속수당\t공제액\t수령액");
		for(int i=0;i<list.size();i++) {
			dto = list.get(i);
			if(근속년수<=3) {
				근속수당=150000;
			}
			else if(근속년수<=8){
				근속수당=450000;
			}
			else {
				근속수당=1000000;
			}
			공제액=(int)((dto.getPay()+근속수당)*0.005);
			수령액=dto.getPay() + 근속수당 - 공제액;
			System.out.println(dto.getNumber() + "\t" + dto.getName() + "\t" + dto.getPay() + "\t" + 근속년수 + "\t" + 근속수당 + "\t" + 공제액 + "\t" + 수령액);
		}
		System.out.println("처리건수: " + list.size() + "건");

	}
	
	
	public static void main(String[] args) {	
		PracticeTestMain main = new PracticeTestMain();

			
		main.inputData();
		main.showData();
			
		

	}

}
