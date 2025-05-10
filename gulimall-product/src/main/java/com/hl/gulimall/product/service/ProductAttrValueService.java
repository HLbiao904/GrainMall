package com.hl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hl.common.utils.PageUtils;
import com.hl.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author hl
 * @email 1844618397@qq.com
 * @date 2025-05-10 00:25:23
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

