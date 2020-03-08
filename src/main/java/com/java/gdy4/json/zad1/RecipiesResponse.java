package com.java.gdy4.json.zad1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor

    public class RecipiesResponse {
    private List<RecipeResult> results;
    private String baseUri;
    private int offset;
    private int number;
    private int totalResults;
    private int processingTimeMs;
    private Long expires;
    @JsonProperty("isStale")
    private boolean stale;

}
