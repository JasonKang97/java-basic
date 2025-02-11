package pack4Extends;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex26FrameAdapter extends WindowAdapter{	// 클래스의 상속관계
	private	Frame frame;	// 클래스의 포함관계
	
	public Ex26FrameAdapter() {
		frame = new Frame("어뎁터 사용");
		frame.setSize(400, 300);
		frame.setLocation(300, 300);
		frame.setVisible(true);
		
		frame.addWindowListener(this);
		
	}
	
	// 윈도우 이벤트 관련 메소드 중 원하는 메소드만 오버라이딩 가능
	@Override
		public void windowClosing(WindowEvent e) {	//<<< event handler method라고 함. callback method에 포함
			System.exit(0);
		}
	
	public static void main(String[] args) {	// callback method의 한 종류
		new Ex26FrameAdapter();
	}

}
