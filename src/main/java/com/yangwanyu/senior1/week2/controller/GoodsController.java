package com.yangwanyu.senior1.week2.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.yangwanyu.senior1.week2.domain.Goods;
import com.yangwanyu.senior1.week2.service.GoodsService;
import com.yangwanyu.senior1.week2.vo.GoodsVO;

@Controller
public class GoodsController {
	
	@Resource
	private GoodsService service;
	
	@RequestMapping("selects")
	public String selects(Model model,GoodsVO goodsVO,@RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "3")Integer pageSize) {
		PageInfo<Goods> info = service.selects(goodsVO, page, pageSize);
		model.addAttribute("info", info);
		model.addAttribute("goodsVO", goodsVO);
		return "goods";
	}

}
