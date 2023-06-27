package com.tyza66.alipay.pojo;

import lombok.Data;

/**
 * Author: tyza66
 * Date: 2023/6/27 7:59
 * Github: https://github.com/tyza66
 **/

@Data
public class AliPay {
    private String traceNo;
    private double totalAmount;
    private String subject;
    private String alipayTraceNo;
}
