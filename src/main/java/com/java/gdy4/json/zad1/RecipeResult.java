package com.java.gdy4.json.zad1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@ToString(of = {"id","title"})
public class RecipeResult {
    private int id;
    private int readyInMinutes;
    private int servings;
    private String title;
    private String image;
    private List<String> imageUrls;

}
