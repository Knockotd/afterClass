package stringbuilder0830;

public class Main {
	
	public static void main (String [] args) {
		
	int x = 10;
	//10 -> "10" 으로 변환
	String result = String.format("%d", x); //권장
	System.out.println(result);
	result = x + "";
	System.out.println(result);
	
	//result 문자열을 실수 10.0으로 변환
	//좌우 공백 여부나 문자가 포함되어 있는지 확인해보는 것이 좋습니다.
	double d = Double.parseDouble(result);
	System.out.println(d);
		
	String [] ar = {
			"String",
			"StringBuilder",
			"StringBuffer"
	};
	//위 배열의 모든 요소를 순서대로 출력
	for(String imsi : ar) {
		System.out.println(imsi);
	}
	
	
	String [][] korean = {{"가","나","다"},{"아","야","어"}};
	for(String [] imsi : korean) {
		for(String temp : imsi) {
			System.out.print(temp+"\t");
		}
		System.out.println();
	}

	String msg = "dksdjxkdsldkscxdskx";

	//배열의 크기를 정하기 위해서 x가 몇 번 들어가는지 확인하기
	int cnt = 0;
	for(int i=0; i<msg.length(); i=i+1) {
		int aa = msg.indexOf("x");
		msg=msg.substring(aa+1);
		if(aa != -1) {
			cnt = cnt+1;
		}
		aa=0; 
	}
	//변경된 msg 값 초기화
	msg = "dksdjxkdsldkscxdskx";
	
	int c=0;
	int [] a = new int[cnt];
	for(int i=0; i<msg.length(); i=i+1) {
		c = msg.indexOf("x");
		if(i==0) {
			a[i] = c;
		}else{
		a[i] = a[i-1]+1+c;
		}
		msg=msg.substring(c+1);
	}
	
	//순회해서 데이터 출력
	for(int b : a) {
		System.out.println(b);
	}
}
}
