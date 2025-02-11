package pack4Extends;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;

public class Ex28FrameInnerClass extends Frame{
	int x, y;
	
	public Ex28FrameInnerClass() {
		setTitle("내부 클래스 사용");
		setSize(400, 300);
		setLocation(200, 200);
		setVisible(true);
		
//		Wevent wevent = new Wevent();
//		addWindowFocusListener(wevent);	// 클래스를 적어줌
		addWindowListener(new Wevent());	
		addMouseListener(new Mevent());
		}
	
	class Wevent extends WindowAdapter{	// 내부 클래스
		@Override
		public void windowClosing(java.awt.event.WindowEvent e) {
			System.exit(0);
		}
	}
	
	class Mevent extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			//setBackground(new Color(255, 255, 0));
			//System.out.println(e.getX() + " " + e.getY());
			//setTitle(e.getX() + " " + e.getY());
			x=e.getX();
			y=e.getY();
			paint(getGraphics());
		}
	}
	
	@Override
	public void paint(Graphics g) {	// Frame은 paint()를 처음 실행 시 한 번 호출
		g.drawString("홍길동", x, y);
		
	}
	
	
	
	public static void main(String[] args) {
		new Ex28FrameInnerClass();
		
	}

}
