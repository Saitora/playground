package com.example.demo.config;

import lombok.Data;

@Data
public class ToggleProperty {

    private Boolean enabled = false;
    private String description = "";

    public static ToggleProperty getDefault() {
        ToggleProperty defProp = new ToggleProperty();
        defProp.setDescription("default toggle property, always false");
        return defProp;
    }

}
