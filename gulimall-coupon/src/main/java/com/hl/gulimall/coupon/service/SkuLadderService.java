package com.hl.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hl.common.utils.PageUtils;
import com.hl.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author hl
 * @email 1844618397@qq.com
 * @date 2025-05-10 20:34:10
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

