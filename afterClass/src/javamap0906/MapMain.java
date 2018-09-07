package javamap0906;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		//데이터 구조 생성
		Map<String, Object> map = new LinkedHashMap<>();
		
		//실제 데이터 저장
		map.put("name", "루루");
		map.put("age", 1);
		
		//데이터를 가져와서 출력
		System.out.println(map.get("age"));
		//가져와서 1 더하기 - 작업을 할 때는 원래 자료형으로 변환 후 수행
		System.out.println((Integer)map.get("age")+1);
		//없는 키를 사용하면 null 리턴
		System.out.println(map.get("addr"));
		
		map.put("nation", "대한민국");
		
		
		System.out.println("-------------------------------");
		//모든 키를 조회
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key+":"+map.get(key));
		}
		
		//이름 , 전화번호, 나이를 저장하는 Map 의 List를 만들어서 테이블 처럼 출력

		
		List<Map<String,Object>> list = new ArrayList<>();
		map = new LinkedHashMap<>();
		map.put("name", "관리자");
		map.put("phone", "01000000000");
		map.put("age", 22);
		list.add(map);
		map = new LinkedHashMap<>();
		map.put("name", "관리자2");
		map.put("phone", "01000000002");
		map.put("age", 24);
		list.add(map);
		map = new LinkedHashMap<>();
		map.put("name", "관리자3");
		map.put("phone", "01000000003");
		map.put("age", 23);
		list.add(map);
		
		for(Map imsi : list) {
			System.out.println(imsi);
		}
		
		
		
	}

}
