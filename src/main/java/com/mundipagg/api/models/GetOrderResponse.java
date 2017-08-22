/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetOrderResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5536290856291523504L;
    private String id;
    private String code;
    private String currency;
    private List<GetOrderItemResponse> items;
    private GetCustomerResponse customer;
    private String status;
    private Date createdAt;
    private Date updatedAt;
    private List<GetChargeResponse> charges;
    private String invoiceUrl;
    private GetShippingResponse shipping;
    private LinkedHashMap<String, String> metadata;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("currency")
    public String getCurrency ( ) { 
        return this.currency;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("currency")
    public void setCurrency (String value) { 
        this.currency = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("items")
    public List<GetOrderItemResponse> getItems ( ) { 
        return this.items;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("items")
    public void setItems (List<GetOrderItemResponse> value) { 
        this.items = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("customer")
    public GetCustomerResponse getCustomer ( ) { 
        return this.customer;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("customer")
    public void setCustomer (GetCustomerResponse value) { 
        this.customer = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("created_at")
    public Date getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("created_at")
    public void setCreatedAt (Date value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("updated_at")
    public Date getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt (Date value) { 
        this.updatedAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("charges")
    public List<GetChargeResponse> getCharges ( ) { 
        return this.charges;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("charges")
    public void setCharges (List<GetChargeResponse> value) { 
        this.charges = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("invoice_url")
    public String getInvoiceUrl ( ) { 
        return this.invoiceUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("invoice_url")
    public void setInvoiceUrl (String value) { 
        this.invoiceUrl = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("shipping")
    public GetShippingResponse getShipping ( ) { 
        return this.shipping;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("shipping")
    public void setShipping (GetShippingResponse value) { 
        this.shipping = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("metadata")
    public LinkedHashMap<String, String> getMetadata ( ) { 
        return this.metadata;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("metadata")
    public void setMetadata (LinkedHashMap<String, String> value) { 
        this.metadata = value;
    }
 
}
 