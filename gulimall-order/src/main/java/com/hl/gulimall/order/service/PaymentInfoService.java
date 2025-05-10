package com.hl.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hl.common.utils.PageUtils;
import com.hl.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author hl
 * @email 1844618397@qq.com
 * @date 2025-05-10 21:13:41
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

