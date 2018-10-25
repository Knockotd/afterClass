package imagedownload;

import java.io.File;

public class ImageDownload {

	public static void main(String[] args) {
		String addr = "https://i.ytimg.com/vi/IJ1cvt-4Nc4/maxresdefault.jpg";
		String [] f = addr.split("/");
		//저장할 파일 경로 만들기
		String filepath = "/Users/503-main/Documents/" 
				+ f[f.length-1];
		//파일 존재 여부를 확인해서 존재하면 리턴
		File file = new File(filepath);
		if(file.exists()) {
			System.out.println("이미 파일이 있습니다.");
			return;
		}
		
	}

}
