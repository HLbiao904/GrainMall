package com.hl.gulimall.product.dao;

import com.hl.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hl
 * @email 1844618397@qq.com
 * @date 2025-05-10 00:25:23
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
