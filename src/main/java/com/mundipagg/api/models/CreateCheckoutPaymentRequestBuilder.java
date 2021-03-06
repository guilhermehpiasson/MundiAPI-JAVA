/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreateCheckoutPaymentRequestBuilder {
    //the instance to build
    private CreateCheckoutPaymentRequest createCheckoutPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCheckoutPaymentRequestBuilder() {
        createCheckoutPaymentRequest = new CreateCheckoutPaymentRequest();
    }

    /**
     * Accepted Payment Methods
     */
    public CreateCheckoutPaymentRequestBuilder acceptedPaymentMethods(List<String> acceptedPaymentMethods) {
        createCheckoutPaymentRequest.setAcceptedPaymentMethods(acceptedPaymentMethods);
        return this;
    }

    /**
     * Success url
     */
    public CreateCheckoutPaymentRequestBuilder successUrl(String successUrl) {
        createCheckoutPaymentRequest.setSuccessUrl(successUrl);
        return this;
    }

    /**
     * Default payment method
     */
    public CreateCheckoutPaymentRequestBuilder defaultPaymentMethod(String defaultPaymentMethod) {
        createCheckoutPaymentRequest.setDefaultPaymentMethod(defaultPaymentMethod);
        return this;
    }

    /**
     * Gateway Affiliation Id
     */
    public CreateCheckoutPaymentRequestBuilder gatewayAffiliationId(String gatewayAffiliationId) {
        createCheckoutPaymentRequest.setGatewayAffiliationId(gatewayAffiliationId);
        return this;
    }

    /**
     * Card payment request
     */
    public CreateCheckoutPaymentRequestBuilder creditCard(CreateCheckoutCardPaymentRequest creditCard) {
        createCheckoutPaymentRequest.setCreditCard(creditCard);
        return this;
    }

    /**
     * Boleto payment request
     */
    public CreateCheckoutPaymentRequestBuilder boleto(CreateCheckoutBoletoPaymentRequest boleto) {
        createCheckoutPaymentRequest.setBoleto(boleto);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCheckoutPaymentRequest build() {
        return createCheckoutPaymentRequest;
    }
}