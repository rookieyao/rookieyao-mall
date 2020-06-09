package com.rookieyao.admin.service;

import com.rookieyao.mbg.model.CmsPrefrenceArea;

import java.util.List;

/**
 * 优选专区Service
 * Created by rookieyao on 2018/6/1.
 */
public interface CmsPrefrenceAreaService {
    /**
     * 获取所有优选专区
     */
    List<CmsPrefrenceArea> listAll();
}
