package com.rookieyao.admin.service;

import com.rookieyao.mbg.model.OmsCompanyAddress;

import java.util.List;

/**
 * 收货地址管Service
 * Created by rookieyao on 2018/10/18.
 */
public interface OmsCompanyAddressService {
    /**
     * 获取全部收货地址
     */
    List<OmsCompanyAddress> list();
}
