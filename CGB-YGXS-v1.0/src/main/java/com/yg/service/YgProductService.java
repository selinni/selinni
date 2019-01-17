package com.yg.service;

import java.util.List;

import com.yg.entity.YgProduct;

public interface YgProductService {
	  /*<select id="findPageObjects"
	             resultType="com.yg.entity.YgProduct">
	           select * from ygxs_product where id=#{id} 
	           <!-- <include refid="queryWhereId"/> -->
	          <!--  limit #{startIndex},#{pageSize} -->
	     </select>*/
	YgProduct findPageObjects (Integer id);
	List<YgProduct> selectAll ();
	
}
