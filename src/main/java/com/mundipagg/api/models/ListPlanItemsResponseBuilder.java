/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class ListPlanItemsResponseBuilder {
    //the instance to build
    private ListPlanItemsResponse listPlanItemsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ListPlanItemsResponseBuilder() {
        listPlanItemsResponse = new ListPlanItemsResponse();
    }

    /**
     * The plan items
     */
    public ListPlanItemsResponseBuilder data(List<GetPlanItemResponse> data) {
        listPlanItemsResponse.setData(data);
        return this;
    }

    /**
     * Paging object
     */
    public ListPlanItemsResponseBuilder paging(PagingResponse paging) {
        listPlanItemsResponse.setPaging(paging);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListPlanItemsResponse build() {
        return listPlanItemsResponse;
    }
}