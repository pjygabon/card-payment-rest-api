package com.kakaopay.cardpayment.model.request;

import java.math.BigDecimal;
import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class CancelRequest {
	private String transactionno;		// 관리번호
	private BigDecimal cancelamount;	// 취소금액
	private BigDecimal canceltax;		// 부가가치세
}
