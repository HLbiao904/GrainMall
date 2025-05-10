package com.hl.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hl.common.utils.PageUtils;
import com.hl.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author hl
 * @email 1844618397@qq.com
 * @date 2025-05-10 20:34:10
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

