package com.hl.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hl.common.utils.PageUtils;
import com.hl.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author hl
 * @email 1844618397@qq.com
 * @date 2025-05-10 21:00:38
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

