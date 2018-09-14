package threadtest;

import java.util.concurrent.Semaphore;

public class MainSemaphore {

	public static void main(String[] args) {
		//동시에 실행할 수 있는 개수를 설정
		Semaphore semaphore = new Semaphore(3);
		
		Temp temp = new Temp(semaphore);
		Thread th1 = new Thread(temp);
		Thread th2 = new Thread(temp);
		Thread th3 = new Thread(temp);
		Thread th4 = new Thread(temp);
		Thread th5 = new Thread(temp);
		
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
	}

}
