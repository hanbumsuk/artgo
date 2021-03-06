package com.bitcamp.artgo.payment.service;

import java.util.List;
import java.util.Map;
import com.bitcamp.artgo.payment.model.PaymentDto;

/**
* 파일명: PaymentService.java
* 설 명: 설명내용
* 작성일: 2019. 1. 11.
* 작성자: 고 우 혁
*/

public interface PaymentService {
  int writePayment(PaymentDto paymentDto);
  List<PaymentDto> getPaymentList(Map<String, String> param);
  String getMinPaymentList(Map<String, String> param);
  String getPaymentDetail(int pno);
}


/**
* @함수명 : cardInsert(CardDTO card)
* @작성일 : 2019. 1. 11.
* @작성자 : 고 우 혁
* @설명 : 카드를 생성한다.
* @param CardDTO - projectNum, cardName
* @return int 성공한 갯수
**/