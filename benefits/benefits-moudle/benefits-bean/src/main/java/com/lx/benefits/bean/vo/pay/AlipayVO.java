package com.lx.benefits.bean.vo.pay;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 支付请求参数
 */
@Data
public class AlipayVO implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 订单名称
     */
    private String subject;
    /**
     * 商户网站唯一订单号
     */
    private String out_trade_no;
    /**
     * 该笔订单允许的最晚付款时间
     */
    private String timeout_express;
    /**
     * 付款金额
     */
    private String total_amount;
    /**
     * 销售产品码，与支付宝签约的产品码名称
     */
    private String product_code;
}
