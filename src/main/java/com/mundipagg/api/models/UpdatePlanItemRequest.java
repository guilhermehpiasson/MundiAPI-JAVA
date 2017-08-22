/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UpdatePlanItemRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4908934336306724426L;
    private String name;
    private String description;
    private String status;
    private UpdatePricingSchemeRequest pricingScheme;
    private Integer quantity;
    private Integer cycles;
    /** GETTER
     * Item name
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Item name
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * Description
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Description
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Item status
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Item status
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * Pricing scheme
     */
    @JsonGetter("pricing_scheme")
    public UpdatePricingSchemeRequest getPricingScheme ( ) { 
        return this.pricingScheme;
    }
    
    /** SETTER
     * Pricing scheme
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme (UpdatePricingSchemeRequest value) { 
        this.pricingScheme = value;
    }
 
    /** GETTER
     * Quantity
     */
    @JsonGetter("quantity")
    public Integer getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * Quantity
     */
    @JsonSetter("quantity")
    public void setQuantity (Integer value) { 
        this.quantity = value;
    }
 
    /** GETTER
     * Number of cycles that the item will be charged
     */
    @JsonGetter("cycles")
    public Integer getCycles ( ) { 
        return this.cycles;
    }
    
    /** SETTER
     * Number of cycles that the item will be charged
     */
    @JsonSetter("cycles")
    public void setCycles (Integer value) { 
        this.cycles = value;
    }
 
}
 