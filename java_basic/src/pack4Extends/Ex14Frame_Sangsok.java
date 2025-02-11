package pack4Extends;

import java.awt.Frame;

public class Ex14Frame_Sangsok extends Frame {
	public Ex14Frame_Sangsok(){
		super("상속 연습용");
		
	}
	public void frameVisible() {
		setSize(500, 300);
		//super.setSize(500, 300);
		setLocation(200, 150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		Ex14Frame_Sangsok frameSangsok = new Ex14Frame_Sangsok();
		frameSangsok.frameVisible();
		
	}

}
