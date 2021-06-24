package com.itauge.springbootlayui.vo;

import lombok.Data;

import java.util.List;

@Data
public class BarVO {
    private List<String> names;
    private List<Integer> values;
}
