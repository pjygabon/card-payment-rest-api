package com.kakaopay.cardpayment.advice.exception;

public class CardpaymentException extends RuntimeException {
	public CardpaymentException(String msg, Throwable t) {
		super(msg, t);
	}

	public CardpaymentException(String msg) {
		super(msg);
	}

	public CardpaymentException() {
		super();
	}
}
