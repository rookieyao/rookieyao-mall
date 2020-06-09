package com.rookieyao.admin.dto;

import com.rookieyao.mbg.model.OmsOrder;
import com.rookieyao.mbg.model.OmsOrderItem;
import com.rookieyao.mbg.model.OmsOrderOperateHistory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 订单详情信息
 * Created by rookieyao on 2018/10/11.
 */
public class OmsOrderDetail extends OmsOrder {
    @Getter
    @Setter
    private List<OmsOrderItem> orderItemList;
    @Getter
    @Setter
    private List<OmsOrderOperateHistory> historyList;
}
