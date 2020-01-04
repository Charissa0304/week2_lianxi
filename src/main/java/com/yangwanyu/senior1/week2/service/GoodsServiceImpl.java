package com.yangwanyu.senior1.week2.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yangwanyu.senior1.week2.dao.GoodsMapper;
import com.yangwanyu.senior1.week2.domain.Goods;
import com.yangwanyu.senior1.week2.vo.GoodsVO;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Resource
	private GoodsMapper mapper;
	
	@Override
	public PageInfo<Goods> selects(GoodsVO goodsVO, Integer page, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pageSize);
		List<Goods> list = mapper.selects(goodsVO);
		return new PageInfo<Goods>(list);
	}

	@Override
	public int insert(List<Goods> goods) {
		// TODO Auto-generated method stub
		return mapper.insert(goods);
	}



}
