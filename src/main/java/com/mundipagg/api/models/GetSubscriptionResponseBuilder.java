/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class GetSubscriptionResponseBuilder {
    //the instance to build
    private GetSubscriptionResponse getSubscriptionResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetSubscriptionResponseBuilder() {
        getSubscriptionResponse = new GetSubscriptionResponse();
    }

    public GetSubscriptionResponseBuilder id(String id) {
        getSubscriptionResponse.setId(id);
        return this;
    }

    public GetSubscriptionResponseBuilder code(String code) {
        getSubscriptionResponse.setCode(code);
        return this;
    }

    public GetSubscriptionResponseBuilder startAt(Date startAt) {
        getSubscriptionResponse.setStartAt(startAt);
        return this;
    }

    public GetSubscriptionResponseBuilder interval(String interval) {
        getSubscriptionResponse.setInterval(interval);
        return this;
    }

    public GetSubscriptionResponseBuilder intervalCount(int intervalCount) {
        getSubscriptionResponse.setIntervalCount(intervalCount);
        return this;
    }

    public GetSubscriptionResponseBuilder billingType(String billingType) {
        getSubscriptionResponse.setBillingType(billingType);
        return this;
    }

    public GetSubscriptionResponseBuilder currentPeriod(GetPeriodResponse currentPeriod) {
        getSubscriptionResponse.setCurrentPeriod(currentPeriod);
        return this;
    }

    public GetSubscriptionResponseBuilder paymentMethod(String paymentMethod) {
        getSubscriptionResponse.setPaymentMethod(paymentMethod);
        return this;
    }

    public GetSubscriptionResponseBuilder currency(String currency) {
        getSubscriptionResponse.setCurrency(currency);
        return this;
    }

    public GetSubscriptionResponseBuilder installments(int installments) {
        getSubscriptionResponse.setInstallments(installments);
        return this;
    }

    public GetSubscriptionResponseBuilder status(String status) {
        getSubscriptionResponse.setStatus(status);
        return this;
    }

    public GetSubscriptionResponseBuilder createdAt(Date createdAt) {
        getSubscriptionResponse.setCreatedAt(createdAt);
        return this;
    }

    public GetSubscriptionResponseBuilder updatedAt(Date updatedAt) {
        getSubscriptionResponse.setUpdatedAt(updatedAt);
        return this;
    }

    public GetSubscriptionResponseBuilder customer(GetCustomerResponse customer) {
        getSubscriptionResponse.setCustomer(customer);
        return this;
    }

    public GetSubscriptionResponseBuilder creditCard(GetCardResponse creditCard) {
        getSubscriptionResponse.setCreditCard(creditCard);
        return this;
    }

    public GetSubscriptionResponseBuilder items(List<GetSubscriptionItemResponse> items) {
        getSubscriptionResponse.setItems(items);
        return this;
    }

    public GetSubscriptionResponseBuilder statementDescriptor(String statementDescriptor) {
        getSubscriptionResponse.setStatementDescriptor(statementDescriptor);
        return this;
    }

    public GetSubscriptionResponseBuilder metadata(LinkedHashMap<String, String> metadata) {
        getSubscriptionResponse.setMetadata(metadata);
        return this;
    }

    public GetSubscriptionResponseBuilder setup(GetSetupResponse setup) {
        getSubscriptionResponse.setSetup(setup);
        return this;
    }

    public GetSubscriptionResponseBuilder nextBillingAt(Date nextBillingAt) {
        getSubscriptionResponse.setNextBillingAt(nextBillingAt);
        return this;
    }

    public GetSubscriptionResponseBuilder billingDay(Integer billingDay) {
        getSubscriptionResponse.setBillingDay(billingDay);
        return this;
    }

    public GetSubscriptionResponseBuilder minimumPrice(Integer minimumPrice) {
        getSubscriptionResponse.setMinimumPrice(minimumPrice);
        return this;
    }

    public GetSubscriptionResponseBuilder canceledAt(Date canceledAt) {
        getSubscriptionResponse.setCanceledAt(canceledAt);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetSubscriptionResponse build() {
        return getSubscriptionResponse;
    }
}