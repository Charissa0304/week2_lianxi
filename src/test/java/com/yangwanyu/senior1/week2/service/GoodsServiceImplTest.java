package com.yangwanyu.senior1.week2.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangwanyu.senior1.week2.domain.Goods;
import com.ywy.common.utils.StreamUtil;
import com.ywy.common.utils.StringUtil;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class GoodsServiceImplTest {

	@Resource
	private GoodsService service;
	
	@Test
	public void testSelects() {
		
	}

	@Test
	public void testInsert() throws IOException  {
	    List<Goods> goodsList=new ArrayList<Goods>();
	    List<String> list = StreamUtil.read(this.getClass().getResourceAsStream("/data.txt"));
	    for(int j=0;j<list.size();j++) {
	    	String[] s = list.get(j).split("\\==");
	    	Goods goods=new Goods();
	    	if(StringUtil.hasText(s[0])) {
	    		goods.setId(Integer.parseInt(s[0]));
	    	}
	    	if(StringUtil.hasText(s[1])) {
	    		goods.setName(s[1]);
	    	}
	    	if(StringUtil.hasText(s[2])) {
	    		String price = s[2].substring(1);
	    		if(StringUtil.isNumber(price)) {
	    			BigDecimal p=new BigDecimal(price);
	    			goods.setPrice(p);
	    		}
	    	}
	    	if(s.length>3 && StringUtil.hasText(s[3])) {
	    		String sales= s[3].substring(0, s[3].length()-1);
	    		goods.setSales(Integer.parseInt(sales));
	    	}else {
	    		goods.setSales(0);
	    	}
	       goodsList.add(goods);
	    }
	   service.insert(goodsList);
	}
}
