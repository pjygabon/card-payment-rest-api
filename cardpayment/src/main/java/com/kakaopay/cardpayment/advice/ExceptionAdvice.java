package com.kakaopay.cardpayment.advice;

import com.kakaopay.cardpayment.advice.exception.CardpaymentException;
import com.kakaopay.cardpayment.model.response.CommonResult;
import com.kakaopay.cardpayment.service.ResponseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor
@RestControllerAdvice
public class ExceptionAdvice {

    private final ResponseService responseService = null;

    @ExceptionHandler(CardpaymentException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    protected CommonResult userNotFoundException(HttpServletRequest request, CardpaymentException e) {
        return responseService.getFailResult();
    }
}
