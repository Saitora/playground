package com.example.demo.web.controller.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TipModel {

    private Integer id;
    private String tip;

}
