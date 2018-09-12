package threadtest;

public class ThreadStop {

	public static void main(String[] args) {
		//스레드 생성
		Thread th1 = new Thread() {
			@Override
			//스레드로 수행할 내용
			public void run() {
				for(int i=0;i<10;i=i+1) {
					try {
						Thread.sleep(1000);
						System.out.println("진행률:"+((i+1)*10)+"%");
					}catch(InterruptedException e) {
						System.out.println("작업을 중지합니다.");
						return;
					}
				}
			}
		};
		//스레드 실행
		th1.start();
		//3초 후에 스레드를 중지하도록 interrupt를 호출
		try {
			Thread.sleep(3000);
			//스레드에게 중지 신호 보내기
			th1.interrupt();
		}catch(Exception e) {
			
		}
	}

}
