package stringdownload0927;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class StringDownload {

	public static void main(String[] args) {
		try {
			//다운로드 받을 주소를 생성
			//주소에 한글이나 특수문자 있으면 
			//String addr = URLEncoder.encode(주소, "utf-8");
			//URL url = new URL(addr);
			URL url = new URL("https://brunch.co.kr/@munchi/68");
			//연결 - 상위 타입으로 생성 되므로 형변환을 함
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			//문자열을 다운로드 받을 스트림 생성
		BufferedReader br = new BufferedReader(new InputStreamReader( con.getInputStream()));
		//다운로드 받은 문자열을 저장하기 위한 변수
		String html ="";
		//줄단위로 읽어서 html에 추가하기
		StringBuilder sb = new StringBuilder();
		while(true) {
			//한 줄 읽기
			String line = br.readLine();
			//읽은 내용이 없으면 종료
			if(line == null) break;
			//읽은 내용이 있으면 sb에 추가
			sb.append(line+"\n");
		}
		//전부 읽으면 String에 복사
		html = sb.toString();
		//연결 객체 연결 해제
		br.close();
		con.disconnect();
		System.out.println(html);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
