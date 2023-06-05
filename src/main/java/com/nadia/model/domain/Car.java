package com.nadia.model.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author Nadia Filatova
 * @since 6/1/23
 */

@Data
@Builder
public class Car {
    private int id;
    private Mark mark;
    private String model;
    private int price;
}
