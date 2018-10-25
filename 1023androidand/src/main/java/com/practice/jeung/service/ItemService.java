package com.practice.jeung.service;
//리턴 타입은 보통의 경우 Dao 메소드와 일치

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.practice.jeung.domain.ItemVO;

//매개변수는 제일쉽게 하는 방법은 HttpServletRequest
//파일이 있을 때는 앞에 Multipart

public interface ItemService {

	public List<ItemVO> idAndName(HttpServletRequest request);

	public ItemVO itemTable(HttpServletRequest request);

}
