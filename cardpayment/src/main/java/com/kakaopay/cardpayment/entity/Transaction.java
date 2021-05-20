package com.kakaopay.cardpayment.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.*;

@Builder // builder를 사용할수 있게 합니다.
@Entity // jpa entity임을 알립니다.
@Getter // transaction 필드값의 getter를 자동으로 생성합니다.
@NoArgsConstructor // 인자없는 생성자를 자동으로 생성합니다.
@AllArgsConstructor // 인자를 모두 갖춘 생성자를 자동으로 생성합니다.
@Table(name = "transaction") // 'transaction' 테이블과 매핑됨을 명시
public class Transaction {
    @Id // primaryKey임을 알립니다.
    @Column(nullable = false, unique = true, length = 20)
    private String transactionno;
    @Column(nullable = false, length = 10)
    private String paymenttype;
    @Column(nullable = false, length = 20)
    private String originaltransactionno;
    @Column(nullable = false, length = 300)
    private String encodedcardinfo;
    @Column(nullable = false, length = 2)
    private String installmentmonth;
    @Column(nullable = false, length = 10)
    private BigDecimal amount;
    @Column(nullable = false, length = 10)
    private BigDecimal tax;
    @Column(nullable = false, length = 10)
    private BigDecimal ongoingamount;
    @Column(nullable = false, length = 10)
    private BigDecimal ongoingtax;
    @Column(nullable = false, length = 450)
    private String sendmessage;
    @Column(nullable = false)
    private LocalDateTime senddatetime;
    @Column(nullable = false)
    private LocalDateTime receivedatetime;
    @Column(nullable = false, length = 1)
    private String status; // 결제상태
    @Column(nullable = false, length = 3)
    private String result;
    @Column(nullable = false, length = 5)
    private String resultcode;
}
