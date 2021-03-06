/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UpdateChargePaymentMethodRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5239445449669918819L;
    private boolean updateSubscription;
    private String paymentMethod;
    private CreateCreditCardPaymentRequest creditCard;
    private CreateBoletoPaymentRequest boleto;
    private CreateVoucherPaymentRequest voucher;
    /** GETTER
     * Indicates if the payment method from the subscription must also be updated
     */
    @JsonGetter("update_subscription")
    public boolean getUpdateSubscription ( ) { 
        return this.updateSubscription;
    }
    
    /** SETTER
     * Indicates if the payment method from the subscription must also be updated
     */
    @JsonSetter("update_subscription")
    public void setUpdateSubscription (boolean value) { 
        this.updateSubscription = value;
    }
 
    /** GETTER
     * The new payment method
     */
    @JsonGetter("payment_method")
    public String getPaymentMethod ( ) { 
        return this.paymentMethod;
    }
    
    /** SETTER
     * The new payment method
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod (String value) { 
        this.paymentMethod = value;
    }
 
    /** GETTER
     * Credit card data
     */
    @JsonGetter("credit_card")
    public CreateCreditCardPaymentRequest getCreditCard ( ) { 
        return this.creditCard;
    }
    
    /** SETTER
     * Credit card data
     */
    @JsonSetter("credit_card")
    public void setCreditCard (CreateCreditCardPaymentRequest value) { 
        this.creditCard = value;
    }
 
    /** GETTER
     * Boleto data
     */
    @JsonGetter("boleto")
    public CreateBoletoPaymentRequest getBoleto ( ) { 
        return this.boleto;
    }
    
    /** SETTER
     * Boleto data
     */
    @JsonSetter("boleto")
    public void setBoleto (CreateBoletoPaymentRequest value) { 
        this.boleto = value;
    }
 
    /** GETTER
     * Voucher data
     */
    @JsonGetter("voucher")
    public CreateVoucherPaymentRequest getVoucher ( ) { 
        return this.voucher;
    }
    
    /** SETTER
     * Voucher data
     */
    @JsonSetter("voucher")
    public void setVoucher (CreateVoucherPaymentRequest value) { 
        this.voucher = value;
    }
 
}
 