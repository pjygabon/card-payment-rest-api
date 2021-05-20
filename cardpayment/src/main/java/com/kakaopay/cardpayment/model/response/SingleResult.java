package com.kakaopay.cardpayment.model.response;

public class SingleResult<T> extends CommonResult {
    private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
