/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetAnticipationLimitsResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5190427456767636613L;
    private GetAnticipationLimitResponse max;
    private GetAnticipationLimitResponse min;
    /** GETTER
     * Max limit
     */
    @JsonGetter("max")
    public GetAnticipationLimitResponse getMax ( ) { 
        return this.max;
    }
    
    /** SETTER
     * Max limit
     */
    @JsonSetter("max")
    public void setMax (GetAnticipationLimitResponse value) { 
        this.max = value;
    }
 
    /** GETTER
     * Min limit
     */
    @JsonGetter("min")
    public GetAnticipationLimitResponse getMin ( ) { 
        return this.min;
    }
    
    /** SETTER
     * Min limit
     */
    @JsonSetter("min")
    public void setMin (GetAnticipationLimitResponse value) { 
        this.min = value;
    }
 
}
 