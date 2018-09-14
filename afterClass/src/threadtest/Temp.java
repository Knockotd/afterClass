package threadtest;

import java.util.concurrent.Semaphore;

public class Temp implements Runnable {
//동시에 수행할 수 있는 스레드의 개수를 설정할 수 잇는 클래스의 변수
	Semaphore semaphore;
	public Temp (Semaphore semaphore) {
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		try {
		//	토큰을 취득해서 실행
		semaphore.acquire();
		Thread.sleep(5000);
		System.out.println("Hello World");
		//토큰을 반납
		semaphore.release();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
