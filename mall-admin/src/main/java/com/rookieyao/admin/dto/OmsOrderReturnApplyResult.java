package com.rookieyao.admin.dto;

import com.rookieyao.mbg.model.OmsCompanyAddress;
import com.rookieyao.mbg.model.OmsOrderReturnApply;
import lombok.Getter;
import lombok.Setter;

/**
 * 申请信息封装
 * Created by macro on 2018/10/18.
 */
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @Getter
    @Setter
    private OmsCompanyAddress companyAddress;
}
