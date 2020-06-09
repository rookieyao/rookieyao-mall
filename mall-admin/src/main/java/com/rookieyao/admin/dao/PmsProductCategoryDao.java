package com.rookieyao.admin.dao;

import com.rookieyao.admin.dto.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * 商品分类自定义Dao
 * Created by rookieyao on 2018/5/25.
 */
public interface PmsProductCategoryDao {
    /**
     * 获取商品分类包括子分类
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
