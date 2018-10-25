package com.practice.jeung;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.practice.jeung.dao.ItemDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })

public class ItemTest {
	@Autowired
	private SqlSession sqlSession;
	@Autowired
	private ItemDAO dao;
	
	@Test
	public void sqlsessionTest() throws Exception {
		//System.out.println(sqlSession);
		//System.out.println(sqlSession.selectList("item.idAndName"));
		//System.out.println(sqlSession.selectOne("item.itemTable", 1)+"");
		
		//이게 안뜬다면, 기본패키지에 있는지, @Repository 붙였는지
		System.out.println(dao);
		System.out.println(dao.idAndName());
		System.out.println(dao.itemTable(1));
	}

}
