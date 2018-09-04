package arrays;

import java.util.Arrays;

public class ArraysExam {

	public static void main(String[] args) {
		//배열 생성
		int [] ar = {30,20,40,24,32,37,29};
		//배열의 데이터를 전부 출력
		for(int imsi : ar) {
			System.out.println(imsi + "\t");
		}
		System.out.println();
		
		//정렬이 안 된 생태에서 이분검색 : 이상한 값이 나옴.
		//indexOf, lastIndexOf, find 등의 메소드는 사용법이 동일
		//Arrays.sort(ar); //정렬을 하고 하면 데이터가 존재한다고 나옵니다.
		Arrays.sort(ar);
		int idx = Arrays.binarySearch(ar, 40);
		if(idx<0) {
			System.out.println("데이터가 존재하지 않습니다.");
		}else {
			System.out.println(idx+"번째에 존재합니다.");
		}
		
	}

}
