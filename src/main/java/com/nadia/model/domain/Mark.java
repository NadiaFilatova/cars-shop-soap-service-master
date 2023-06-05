package com.nadia.model.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author Nadia Filatova
 * @since 6/1/23
 */

@Data
@Builder
public class Mark {
    private int id;
    private String mark;
}
