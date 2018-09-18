package stream0918;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.Date;

public class ByteFileReadWrite {

	public static void main(String[] args) {
		//기록할 파일의 경로 생성 - 도큐면트 디렉토리에 오늘 날짜로
		Calendar cal = Calendar.getInstance();
		Date date = new Date(cal.getTimeInMillis());
		String path = "/Users/a503-26/Documents/0918stream" + date.toString() +".txt";
//		위 경로를 가지고 FileOutputStream 객체를 생성
		try(FileOutputStream fos = new FileOutputStream(path);
				PrintStream pw = new PrintStream(fos);){
			//문자열 객체 생성
			String msg = "안녕하세요 반갑습니다.";
			//문자열을 바이트 배열로 변환해서 기록
			pw.write(msg.getBytes());
			//기록이 제대로 안 될 수도 있기 때문에 flush 도 호출해야 합니다.
			//Buffer를 사용하므로 버퍼의 마지막 내용이 출력이 안 될 수 있습니다.
			pw.flush();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
//		String path = "/Users/a503-26/Documents/0918streamTue\\ Sep\\ 18\\ 19\\:00\\:55\\ KST\\ 2018.txt ";
		try(FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);){
	//한꺼번에 전부 읽어서 출력하기
			//전체데이터를 저장할 수 있는 배열을 생성
			byte [] b = new byte[fis.available()];
			bis.read(b);
			//바이트 배열을 문자열로 변환
			String msg = new String(b, "utf-8");
			System.out.println(msg);
}catch(Exception e) {
	System.out.println(e.getMessage());
	e.printStackTrace();
		
	}

}
}