package com.kakaopay.cardpayment.model.response;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class CommonResult {
    private boolean success;
    private int code;
    private String msg;
}