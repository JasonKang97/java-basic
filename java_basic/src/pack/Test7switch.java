package pack;

public class Test7switch {
	
	public static void main(String[] args) {   // switch : 조건 판단문의 좀 더 정형화된 문법으로 값에 따라 여러 방향으로 분기하는 경우 효과적
												//길게 늘어진 if문에 비해 코드가 짧고 의미 파악이 쉽다.
		int nai = 33;
		nai = nai / 10 * 10;

		
		switch(nai) {
		case 20:  // 20인 경우를 의미
			System.out.println("20대");
			break;    // 중간에 break를 넣지 않으면 아래까지 계속 수행하기 때문에 넣어줌.
		case 30: 	
			System.out.println("30대");
			break;     
		default:  // case이외의 값을 정의
			System.out.println("기타");
			break;    // 마지막의 break는 넣어주지 않아도 끝나기 때문에 필수 아님.
		}
		
		System.out.println("\n계속1\n");
		switch(nai) {
		case 10:
		case 20:
			System.out.println("젊음");
			break;    
		case 30:
		case 40:
		case 50:
			System.out.println("왕성한 활동");
			break;
		default:
			System.out.println("기타");
			break;
		}
		
		
		System.out.println("\n계속2\n");
		//System.out.println((int)(Math.random()*10));	//난수 발생
		int time = (int)(Math.random()*4)+8;  //8부터 11사이의 정수가 나옴
		System.out.println("time: " + time);
		switch (time) {
		case 8: 
			System.out.println("출근 준비");
			break;
		case 9:
			System.out.println("출근 완료");
			break;
		case 11: 
			System.out.println("팀 회의");
			break;
		default: 
			System.out.println("개인활동");
		
		
		}
		
		System.out.println("\n계속3\n");
		String jik = "과";
		switch(jik) {
		case "사원":
			System.out.println("사원 업무");
			break;
		case "과장":
			System.out.println("과장 업무");
			break;
		default: 
			System.out.println("기타 직급");
			break;
		}

	}
}
