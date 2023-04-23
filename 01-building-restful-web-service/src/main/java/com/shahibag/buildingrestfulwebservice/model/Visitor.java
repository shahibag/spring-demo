package com.shahibag.buildingrestfulwebservice.model;

import lombok.Data;

/**
 * Description: visitor model
 *
 * @author : King
 * @version : v1.0
 * @since : 2023-04-24
 */

@Data
public class Visitor {

    private String content;

    private String id;

    public Visitor(String id, String content) {
        this.id = id;
        this.content = content;
    }
}
