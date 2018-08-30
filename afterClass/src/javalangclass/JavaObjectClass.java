package javalangclass;

public class JavaObjectClass {

	public static void main(String[] args) {
		
		Object obj = "Hello";

		System.out.println(obj);

		//대문자로 변경
 
		//obj.toUpperCase(); --> 안 됨.

		//출력이 아니라 다른 용도로 사용할 때는 반드시 형변환 해서 사용

		String dae = ((String)obj).toUpperCase();

		System.out.println(dae);

	int x = 100;
	//Object 타입에는 모든 데이터 대입이 가능
	//int 가 대입된 것이 아니고 Integer로 변환해서 대입됩니다.
	obj = x;
	System.out.println(obj);
	//참조형은 기본형으로 강제 형변환이 안 됩니다.
	//참조형을 기본형으로 변경하고자 하면 Wrapper로 형변환 한 후 대입해야 합니다.
	//이클립스 버전에 따라서 되기도 하지만 1.7 버전 아래 에서는 안되기 때문에 기본적으로 안 된다고 해야 한다.
	//이클립스 컨파일러가 업그레이드 되었을 수도 있다.
	x = (int)obj;
	System.out.println(x);
	x = (Integer)obj;
	System.out.println(x);
	}

}
