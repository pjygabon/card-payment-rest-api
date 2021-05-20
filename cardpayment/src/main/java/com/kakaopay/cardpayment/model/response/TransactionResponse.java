package com.kakaopay.cardpayment.model.response;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class TransactionResponse {
    private String transactionno;	// 관리번호
	private String sendmessage;		// 카드사에 전달한 String 데이터
}
