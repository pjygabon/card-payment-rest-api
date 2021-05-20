package com.kakaopay.cardpayment.repository;

import com.kakaopay.cardpayment.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TransactionJpaRepo extends JpaRepository<Transaction, Long> {

}
