package com.practice.jeung;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.jeung.domain.ItemVO;
import com.practice.jeung.service.ItemService;

@RestController
public class ItemController {
	@Autowired
	private ItemService itemService;
	//url은 모두 소문자로 합니다.
	//데이터를 가져오는 건 GET
	//데이터를 insert 하는 건 POST
	@RequestMapping(value="idandname",method=RequestMethod.GET)
	public List<ItemVO> idAndName (HttpServletRequest request){
		return itemService.idAndName(request);
	}
	
	@RequestMapping(value="itemtable",method=RequestMethod.GET)
	public ItemVO itemTable (HttpServletRequest request){
		return itemService.itemTable(request);
	}
}
