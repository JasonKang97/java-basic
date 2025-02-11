package pack3;

import java.awt.Frame;

public class Ex9Frame_Poham {
	private Frame frame;	// 외부 클래스를 사용
	public Ex9Frame_Poham() {
		frame = new Frame("포함 연습용");	// 클래스의 포함관계
		
//		frame.setSize(500, 300);	// 넓이와 높이 지정
//		frame.setLocation(200, 150);	// 위치 지정
//		frame.setVisible(true);
	}
	
	public void frameVisible() {	// 생성자는 초기화 및 절체 윤곽만 적고, 나머지(처리 로직)는 별도 메소드로 작성하는 것이 좋음.
		frame.setSize(500, 300);	
		frame.setLocation(200, 150);	
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		//Ex9Frame_Poham frame_Poham = new Ex9Frame_Poham();
		//new Ex9Frame_Poham();	// 생성자에서 모든일이 처리되므로 객체변수가 굳이 필요하지 않음.
		
//		Ex9Frame_Poham frame_Poham = new Ex9Frame_Poham();
//		frame_Poham.frameVisible();
		new Ex9Frame_Poham().frameVisible();	//위의 두줄을 한번만 실행 할 경우 이렇게 적을 수 있음.
		
		
	}

}
