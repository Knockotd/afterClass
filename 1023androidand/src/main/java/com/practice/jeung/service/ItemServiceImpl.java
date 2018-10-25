package com.practice.jeung.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.jeung.dao.ItemDAO;
import com.practice.jeung.domain.ItemVO;

@Service
public class ItemServiceImpl implements ItemService {
	
	
	@Autowired
	private ItemDAO itemDao;

	@Override
	public List<ItemVO> idAndName(HttpServletRequest request) {
		return itemDao.idAndName();
	}

	@Override
	public ItemVO itemTable(HttpServletRequest request) {
		//파라미터 가져오기- 웹은 파라미터를 문자로밖에 못 줌.
		String itemid  = request.getParameter("itemid");
		//파라미터를 정수로 변환해서 Dao 메소드에게 전달
		return itemDao.itemTable(Integer.parseInt(itemid));
	}

}
