package com.rajyawardhan.interceptor.flatmap;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Room {
    private String name;
    private List<String> people;
    private List<Integer> ages;
}
