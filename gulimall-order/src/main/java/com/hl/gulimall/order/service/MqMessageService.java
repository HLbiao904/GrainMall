package com.hl.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hl.common.utils.PageUtils;
import com.hl.gulimall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author hl
 * @email 1844618397@qq.com
 * @date 2025-05-10 21:13:41
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

