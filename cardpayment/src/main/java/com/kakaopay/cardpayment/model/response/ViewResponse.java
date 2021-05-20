package com.kakaopay.cardpayment.model.response;

import java.math.BigDecimal;
import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class ViewResponse {
	private String transactionno;		// 관리번호
	private String cardno;				// 카드번호
	private String expirationdate;		// 카드유효기간
	private String cvc;					// cvc
    private String paymenttype;			// 결제/취소 구분
    private BigDecimal amount;			// 결제/취소 금액
    private BigDecimal tax;				// 부가가치세
}
