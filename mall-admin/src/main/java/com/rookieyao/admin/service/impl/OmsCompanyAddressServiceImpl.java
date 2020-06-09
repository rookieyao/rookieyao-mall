package com.rookieyao.admin.service.impl;

import com.rookieyao.mbg.mapper.OmsCompanyAddressMapper;
import com.rookieyao.mbg.model.OmsCompanyAddress;
import com.rookieyao.mbg.model.OmsCompanyAddressExample;
import com.rookieyao.admin.service.OmsCompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址管理Service实现类
 * Created by rookieyao on 2018/10/18.
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;

    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
