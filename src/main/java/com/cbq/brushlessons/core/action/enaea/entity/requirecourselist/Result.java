package com.cbq.brushlessons.core.action.enaea.entity.requirecourselist;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@lombok.Data
public class Result {
    @lombok.Getter(onMethod_ = {@JsonProperty("list")})
    @lombok.Setter(onMethod_ = {@JsonProperty("list")})
    private List<ListElement> list;
}
