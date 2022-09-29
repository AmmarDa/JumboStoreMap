package com.example.jumboStoreMap.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPosition {

    @JsonProperty
    private String productName;

    @JsonProperty
    private Integer bay;

    @JsonProperty
    private Integer box;

}
