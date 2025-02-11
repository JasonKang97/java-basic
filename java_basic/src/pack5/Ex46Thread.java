package pack5;

// 하나의 프로그램은 하나의 Process에 해당한다. 이러한 Process를 실제로 실행하기 위한 실행 단위를 Thread라고 한다.
// Thread 하나는 한 개의 실행을 담당하므로 결국 여러 개의 Thread를 이용하면 여러 개의 작업(task)을 할 수 있게 된다.
// single-thread는 single tasking, multi-thread는 multi-tasking을 하게 된다.
// 여러 개의 응용 프로그램을 실행하고 싶을 경우 또는 네트워크 작업을 효율적으로 운영하려는 경우, Thread 처리는 필수적이다.
public class Ex46Thread implements Runnable {
	public Ex46Thread(){
	 
	}
	
	public Ex46Thread(String name) {
		Thread tt = new Thread(this, name);
		tt.start();	// run()을 호출
	}
	
	@Override
	public void run(){
		// start()에 의해 호출되며 run 처리가 끝나면 Thread 작업이 종료된다.
		for(int i=0;i<=50;i++) {
			System.out.println(i + Thread.currentThread().getName());
			try {
				Thread.sleep(10);	// 1000ms: 1초
				
			} catch (Exception e) {
				// TODO: handle exception
			} 
		}
		
	}
	
	public static void main(String[] args) {	// 기본적으로 모든 프로그램은 main thread가 자동 실행된다.
		
		try {
			// 사용자 정의 thread를 사용하지 않은 경우
//		Ex46Thread my1 = new Ex46Thread();
//		Ex46Thread my2 = new Ex46Thread();
//		my1.run();	// 처음 요청이 모두 처리되면 다음 요청이 처리됨.
//		my2.run();
			
			// 사용자 정의 thread를 사용하는 경우
			// 첫번째 생성자
			Ex46Thread my1 = new Ex46Thread();
			Ex46Thread my2 = new Ex46Thread();
			Thread t1 = new Thread(my1, "하나");
			Thread t2 = new Thread(my2, "둘");
			t1.start();	// run method 호줄
			t2.start();
			
			t2.setPriority(9);	// thread scheduler에 우선 순위를 신청.
//			t2.setPriority(Thread.MAX_PRIORITY);	
			
			t1.join();	// 사용자 정의 thread가 종료될 때까지 메인 thread를 대기시킴.
			t2.join();
			
			// 두번째 생성자
//		new Ex46Thread("음악");	// thread scheduler에 의해 순차적인 처리가 아니라 random하게 요청이 처리.
//		new Ex46Thread("프린트");
			System.out.println("프로그램 종료");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
