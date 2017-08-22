/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreatePaymentRequestBuilder {
    //the instance to build
    private CreatePaymentRequest createPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreatePaymentRequestBuilder() {
        createPaymentRequest = new CreatePaymentRequest();
    }

    /**
     * Payment method
     */
    public CreatePaymentRequestBuilder paymentMethod(String paymentMethod) {
        createPaymentRequest.setPaymentMethod(paymentMethod);
        return this;
    }

    /**
     * Settings for credit card payment
     */
    public CreatePaymentRequestBuilder creditCard(CreateCreditCardPaymentRequest creditCard) {
        createPaymentRequest.setCreditCard(creditCard);
        return this;
    }

    /**
     * Settings for boleto payment
     */
    public CreatePaymentRequestBuilder boleto(CreateBoletoPaymentRequest boleto) {
        createPaymentRequest.setBoleto(boleto);
        return this;
    }

    /**
     * Currency. Must be informed using 3 characters
     */
    public CreatePaymentRequestBuilder currency(String currency) {
        createPaymentRequest.setCurrency(currency);
        return this;
    }

    /**
     * Settings for voucher payment
     */
    public CreatePaymentRequestBuilder voucher(CreateVoucherPaymentRequest voucher) {
        createPaymentRequest.setVoucher(voucher);
        return this;
    }

    /**
     * Settings for bank transfer payment
     */
    public CreatePaymentRequestBuilder bankTransfer(CreateBankTransferPaymentRequest bankTransfer) {
        createPaymentRequest.setBankTransfer(bankTransfer);
        return this;
    }

    /**
     * Gateway affiliation code
     */
    public CreatePaymentRequestBuilder gatewayAffiliationId(String gatewayAffiliationId) {
        createPaymentRequest.setGatewayAffiliationId(gatewayAffiliationId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreatePaymentRequest build() {
        return createPaymentRequest;
    }
}