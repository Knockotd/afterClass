package threadtest;

public class MainCalc {

	public static void main(String[] args) {
		//Runnable 인터페이스를 implements 한 객체를 생성
		Calc calc = new Calc();
		//위의 객체를 이용해서 스레드 객체를 생성
		Thread th1 = new Thread(calc);
		//스레드로 수행
		th1.start();
		//위의 객체를 이용해서 스레드 객체를 생성
				Thread th2 = new Thread(calc);
				//스레드로 수행
				th2.start();
		
		try {
		Thread.sleep(10000);
		System.out.println(calc.getResult());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
