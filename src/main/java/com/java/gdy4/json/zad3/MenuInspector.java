package com.java.gdy4.json.zad3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor


public class MenuInspector {
    private String type;
    private List<MenuItems> menuItems;
    private int offset;
    private int number;
    private int totalMenuItems;
    private int processingTimeMs;
    private Long expires;

}
