package com.yangwanyu.senior1.week2.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yangwanyu.senior1.week2.domain.Goods;
import com.yangwanyu.senior1.week2.vo.GoodsVO;

public interface GoodsService {
	
	/**
	 * 
	    * @Title: selects
	    * @Description: 多条件模糊查询
	    * @param @param goodsVO
	    * @param @param page
	    * @param @param pageSize
	    * @param @return    参数
	    * @return PageInfo<Goods>    返回类型
	    * @throws
	 */
	PageInfo<Goods> selects(GoodsVO goodsVO,Integer page,Integer pageSize);
	
	/**
	 * 
	    * @Title: insert
	    * @Description: 批量插入
	    * @param @param goods
	    * @param @return    参数
	    * @return int    返回类型
	    * @throws
	 */
	int insert(List<Goods> goods);
	
}
