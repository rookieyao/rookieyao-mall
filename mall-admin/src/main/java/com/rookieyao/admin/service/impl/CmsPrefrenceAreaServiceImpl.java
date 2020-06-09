package com.rookieyao.admin.service.impl;

import com.rookieyao.mbg.mapper.CmsPrefrenceAreaMapper;
import com.rookieyao.mbg.model.CmsPrefrenceArea;
import com.rookieyao.mbg.model.CmsPrefrenceAreaExample;
import com.rookieyao.admin.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 * Created by rookieyao on 2018/6/1.
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
