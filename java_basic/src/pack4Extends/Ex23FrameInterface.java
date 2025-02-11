package pack4Extends;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex23FrameInterface extends Frame implements WindowListener,MouseListener{
	public Ex23FrameInterface() {
		super.setTitle("이벤트 처리 창");
		setSize(400, 300);
		setLocation(200, 200);
		setVisible(true);
		
		// window 관련 이벤트 처리를 하기 위해 window listener를 Frame에 장착해야한다.
		super.addWindowListener(this);	// listener 장착
		// mouse 관련 이벤트 처리를 하기 위해 window listener를 Frame에 장착해야한다.
		addMouseListener(this);	// listener 장착
	}
	
	@Override
	public void windowActivated(WindowEvent e) {
	}
	
	@Override
	public void windowClosed(WindowEvent e) {
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("윈도우 종료 처리 메소드");
		System.exit(0);	// 응용 프로그램의 강제 종료
	}
	
	@Override
	public void windowDeactivated(WindowEvent e) {
	}
	
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}
	
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
	}

	//마우스 이벤트 관련

	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("mouseClicked 메소드 수행");
		int r=(int)(Math.random()*255);	// static member, 난수 발생
		int g=(int)(Math.random()*255);
		int b=(int)(Math.random()*255);
		setBackground(new Color(r,g,b));
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	
	
	
	
	public static void main(String[] args) {
		//Ex23FrameInterface frameInterface = new Ex23FrameInterface();
		new Ex23FrameInterface();
	}


}
