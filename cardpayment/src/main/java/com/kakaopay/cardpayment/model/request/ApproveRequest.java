package com.kakaopay.cardpayment.model.request;

import java.math.BigDecimal;
import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class ApproveRequest {
	private String cardno;				// 카드번호
	private String expirationdate;		// 카드유효기간
	private String cvc;					// cvc
	private String installmentmonth;	// 할부개월수
	private BigDecimal payamount;		// 거래금액
	private BigDecimal paytax;			// 부가가치세
}
