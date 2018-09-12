package threadtest;

//Thread로부터 상속받는 클래스
class ThreadEx extends Thread{
	@Override //아래 메소드가 overriding 된 메소드라는 것을 알려준다. 어노테이션이라고 한다. 그래서 메소드 이름이 틀리면 오류가 난다.
	public void run() {
		for(int i=0; i<10;i++) {
			//1초 대기
			try {
				Thread.sleep(1000);
				//스레드 이름 출력
				System.out.println(this.getName());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		//스레드 객체 생성
		Thread thread1 = new ThreadEx();
		//스레드 실행
		thread1.start();
		
		//익명객체를 이용하는 방법 - 보통은 따로 클래스를 만들지 않고 이 방법을 씁니다.
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				for(int i=0; i<10;i++) {
					try {
					Thread.sleep(1000);
					System.out.println(getName());
					}catch(Exception e) {
					}
				}
			}
		};
		thread2.start();
		
		//Runnable 인터페이스를 implements - Runnable 객체를 이용해서 스레드 객체를 생성하고 start()를 호출할 수 있음.
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i<10;i++) {
					try {
						Thread.sleep(2000);
						System.out.println(i);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread thread3 = new Thread(r);
		//데몬으로 설정 - 다른 스레드가 없으면 자동 중지됩니다.
		thread3.setDaemon(true);
		thread3.start();
		
	}

}
