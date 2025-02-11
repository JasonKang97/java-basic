package pack5;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.time.LocalTime;

// Thread를 이용해 디지털 시계 실행

public class Ex47ThreadClock extends Frame implements Runnable, ActionListener{
	Label lblMessage;
	Thread thread;
	Boolean b = false;
	
	public Ex47ThreadClock() {
		lblMessage = new Label("show datatime", Label.CENTER);
		add("Center", lblMessage);
		
		Button button = new Button("click");
		add("South", button);
		button.addActionListener(this);
		
		setTitle("스레드 시계");
		setSize(300, 300);
		setLocation(200, 200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				b=true;	// 윈도우 종료시 run method의 무한루프(while문)를 끝내기 위함
				System.exit(0);
			}
		});
		
		thread = new Thread(this);	// 사용자 정의 thread 생성.
		
		
	}
	
	@Override
	public void run() {
		while(true) {
			if(b==true) break;
			showTime();
			
			// showTime()을 1초에 한번씩 호출할 수 있도록 thread를 1초간 비활성화 시킴.
			try {
				thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		}
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("버튼 클릭");
		//showTime();
		if(thread.isAlive()) return;	// thread가 활성화된 상태일 경우 method 탈출.
		thread.start();	// run()을 호출.
		
	}

	private void showTime() {
		LocalDate date = LocalDate.now();	// singleton 객체(객체가 한 번만 만들어짐)
		int y = date.getYear();
		int m = date.getMonthValue();
		int d = date.getDayOfMonth();
		
		LocalTime localtime = LocalTime.now();
		int h = localtime.getHour();
		int min = localtime.getMinute();
		int s = localtime.getSecond();
		
		String imsi = y + "-" + m + "-" + d + " " + h + ":" + min + ":" + s;
		lblMessage.setText(imsi);
		
	}
	
	public static void main(String[] args) {
		new Ex47ThreadClock();
		
		
		
	}
}
