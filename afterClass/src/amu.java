
public class amu {

	public static void main(String[] args) {
		int[]ar= {100,76,34,82,36};
		//위의 배열을 선택 정렬을 이용해서 내림차순 정렬을 한 후 출력하시오.
		//선택정렬
		//첫번째 데이터부터 마지막 바로 앞 데이터까지 자신의 뒤에 있는 데이터들과 비교해 가면서 정렬하는 방식
		//성능이 나빠서 실제로 사용은 거의 하지 않지만 가장 쉬운 정렬 방법
		int j=0;
		while(true) {
			int i = 0;
		while(true) {
			if(ar[i] > ar[i+1]) {
				int temp = 0;
				temp=ar[i+1];
				ar[i+1]=ar[i];
				ar[i]=temp;
			}else {
			i=i+1;
			if(i >= ar.length-1) {
				break;
			}
			}
		}
		j=j+1;
		if(j>=ar.length-1) {
			break;
		}
		}
		for(int imsi : ar) {
			System.out.print(imsi+"/");
		}
		
		//내일 MySQL에서 작업하고자 하면 회원테이블을 만들어보기
	}

}
