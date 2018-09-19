package charaterstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class CharacterStream {

	public static void main(String[] args) {
		//한글이 포함된 URL
		
	String url = "https://www.naver.com?query=이순신";
	//위의 URL 은 인코딩 해서 요청을 전송해야 합니다.
	//파라미터 부분만 인코딩을 하면 됩니다.
	//파라미터 부분만 인코딩 하도록 수행
	
try {
	//인코딩
	url = URLEncoder.encode(url, "utf-8");
	System.out.println(url);
	//디코딩
	url = URLDecoder.decode(url, "utf-8");
	System.out.println(url);
}catch(Exception e) {
	e.printStackTrace();
}


//파일의 문자열 단위로 기록
try(
		//뒤에 true를 대입하면 이어쓰기, 생략하면 처음부터 다시쓰기
		FileOutputStream fos = new FileOutputStream("/Users/a503-26/Desktop/file.txt",true);
		PrintWriter pw = new PrintWriter(fos);) {
	pw.println("Hello");
	pw.println("\n안녕하세요");
	pw.println("\n반갑습니다.");
	pw.flush();
	//버퍼의 마지막 내용은 출력이 안 될 수 있으므로 flush비어주어야 합니다.
}catch(Exception e) {
	e.printStackTrace();
}


//문자열을 읽을 때는 BufferedReader를 이용하고 읽는 메소드는 readLine을 이용함
//readLine은 읽은 데이터 없으면 null 리턴
//한줄이 아니라 여러 줄을 읽을 때면 반복문을 null을 만날때까지 수행하면 됨.
//웹에선 문자열 받을 때 전체를 전부 읽어야만 의미있는 경우가 있다.
//xml,json,csv 등의 내용으 그럼.
//이런 경우, 줄 단위로 읽어서 한 곳에 저장한 후
//한꺼번에 사용해야 함.

try (BufferedReader br =
	new BufferedReader(
			new InputStreamReader(
					new FileInputStream("/Users/a503-26/Desktop/file.txt")))){
		//익은 내용을 전부 저장할 객체
	StringBuilder sb = new StringBuilder();
	while(true) {
		String line = br.readLine();
		if(line == null) {
			break;
			
		}sb.append(line+"\n");
		
	}
	String content = sb.toString();
	System.out.println(content);
}catch(Exception e) {
	e.printStackTrace();
}
	}

}
