package stream0918;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;



public class ObjectFileInputOutput {

	public static void main(String[] args) {
		//기록할 파일의 경로 생성 - 도큐면트 디렉토리에 오늘 날짜로
				Calendar cal = Calendar.getInstance();
				Date date = new Date(cal.getTimeInMillis());
				String path = "/Users/a503-26/Documents/" + date.toString() +".dat";
try(FileOutputStream tos = new FileOutputStream(path);
		ObjectOutputStream oos = new  ObjectOutputStream(tos)){
	
Data data = new Data();
	data.setNum(1);
	data.setName("안정은");
	oos.writeObject(data);
	
	
}catch(Exception e) {
	System.out.println(e.getMessage());
	e.printStackTrace();
}


try(FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);){
	Data data = (Data)ois.readObject();
	System.out.println(data);
	
	
	
}catch(Exception e) {
	System.out.println(e.getMessage());
	e.printStackTrace();
}



	}

}
