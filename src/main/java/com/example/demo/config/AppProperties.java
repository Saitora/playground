package com.example.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;

@Data
@ConfigurationProperties(prefix = "app")
public class AppProperties {

    private HashMap<String, ToggleProperty> toggles;

}
