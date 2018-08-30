package string0829;

public class Main {

	public static void main(String[] args) {

		// charAt 과 length 메소드를 이용해서 모두 소문자로 변환
		// 동일한 문자의 경우 대문자가 소문자보다 값이 32가 작습니다.
		String msg = "I am a Boy";
		String result ="";
		//한글자씩 꺼내기
		for(int i=0; i<msg.length(); i++) {
			char ch = msg.charAt(i);
			//대문자의 경우
			if(ch>='A' && ch <= 'Z') {
				//산술연산은 최소 단위는 int이므로 char에 대입할려면 형변환을 해야 합니다.
				ch = (char)(ch+32);
			}
			result = result+ch;
		}
		System.out.println(result);
		
		//모두 대문자로 만들어서 출력해보기
		String result1 = "";
		for(int i = 0; i<msg.length(); i=i+1) {
		char dae = msg.charAt(i);
		//if(dae<'A' || dae>'Z') { //띄어쓰기가 안 됨.
		if(dae>='a' && dae<='z') {
				
		dae= (char)(dae-32);
		}
		result1 = result1 + dae;
		}
		System.out.println(result1);
		
		//문자열을 정수로 변환 : Integer.parseInt(정수 문자열)
		String data ="30,20,40";
		//,로 구분된 문자열을 숫자로 변환해서 합계를 구해보기
		//split 함수를 이용
		String [] imsi = data.split(",");
		int i = 0;
		int sum = 0;
		while(imsi.length>i) {
			int a = Integer.parseInt(imsi[i]);
			sum = sum + a;
					i = i + 1;
		}
		
		System.out.println(sum);
		sum = 0;
		//이게 더 간단함
		for(String temp : imsi) {
			sum = sum+Integer.parseInt(temp);
		}
		System.out.println(sum);
		
		int x = 10;
		int y = 20;
		//x:10 y:20 의 형식으로 문자열을 만들어서 출력 + 사용하지않고
		String display = String.format("x:%d y:%d", x,y);
		System.out.println(display);

		
		
		//아래 문자열에서 확장자만 추출 - 마자막 .뒤의 글자만 가져오기
		String filename = "잘부탁드립니다.mp3";
		//split()을 이용
		String [] ar = filename.split("\\.");
		System.out.println(ar[ar.length-1]);
		
		//indexOf 와 substring 이용 가능
		int fileIndex = filename.lastIndexOf(".");
		System.out.println(filename.substring(fileIndex+1));
		
	}

}
