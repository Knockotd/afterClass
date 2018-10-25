package com.practice.jeung.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practice.jeung.domain.ItemVO;

@Repository
public class ItemDAO {
	@Autowired
	private SqlSession sqlSession;
	
	//테이블의 전체 데이터를 가져오는 메소드
	public List<ItemVO> idAndName(){
		return sqlSession.selectList("item.idAndName");
	}
	
	//itemid를 가지고 하나의 데이터를 가져오는 메소드
	public ItemVO itemTable(int itemid) {
		return sqlSession.selectOne("item.itemTable", itemid);
	}

}
