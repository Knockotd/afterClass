package threadtest;

public class Calc implements Runnable {
//합계를 저장할 변수
	private int result;
	//1부터 2만까지 진행할 변수
	private int idx;
	//result 의 getter
	public int getResult() {
		return result;
	}
	//idx 값을 10000번 증가시키면서 result에 추가하는 메소드
	private void sum() {
		//this의 자원을 사용하는 스레드는 이 코드 블럭이 끝날때까지 수행을 못함
		//괄호 안에는 무조건 참조형이 들어가야하는데 이유는, 기본형의  stack은 마지막에 넣은 값을 먼저 꺼내기 때문에 락을 걸 수 없기 때문입니다.
		synchronized(this) {
		for(int i=0; i<1000; i=i+1) {
			idx=idx+1;
			try {
			Thread.sleep(1);
			}catch(Exception e) {
				System.out.println("스레드 종료");
				return;
			}
			result=result+idx;
		}
		}
	
	}
	@Override
	public void run() {
		sum();
	}

}
