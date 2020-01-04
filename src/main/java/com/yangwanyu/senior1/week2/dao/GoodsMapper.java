package com.yangwanyu.senior1.week2.dao;

import java.util.List;

import com.yangwanyu.senior1.week2.domain.Goods;
import com.yangwanyu.senior1.week2.vo.GoodsVO;

public interface GoodsMapper {
	
	/**
	 * 
	    * @Title: selects
	    * @Description: 多条件模糊查询
	    * @param @param goodsVO
	    * @param @return    参数
	    * @return List<Goods>    返回类型
	    * @throws
	 */
	List<Goods> selects(GoodsVO goodsVO);
	
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
