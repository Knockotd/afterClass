package anonymousClass_;

public class Main {

	public static void main(String[] args) {
		//인터페이스나 클래스를 상속한 클래스의 인스턴스를 만들 때는
		//변수는 인터페이스나 클래스 자료형으로 만들고
		//생성자는 상속받은 클래스의 것으로 호출합니다.
		
		Temp temp = new TempImpl();
		temp.disp();
		
		//클래스를 만들지 않고 상속받아서 사용하기
		Temp t = new Temp() {
 
			@Override
			public void disp() {
				System.out.println("관리자");
			}
			
		};
		t.disp();
	}

}
