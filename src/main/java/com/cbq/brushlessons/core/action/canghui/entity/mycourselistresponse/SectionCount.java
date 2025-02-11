package com.cbq.brushlessons.core.action.canghui.entity.mycourselistresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class SectionCount {
    @lombok.Getter(onMethod_ = {@JsonProperty("completeCount")})
    @lombok.Setter(onMethod_ = {@JsonProperty("completeCount")})
    private long completeCount;
    @lombok.Getter(onMethod_ = {@JsonProperty("totalCount")})
    @lombok.Setter(onMethod_ = {@JsonProperty("totalCount")})
    private long totalCount;
}
