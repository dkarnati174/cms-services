package com.fanniemae.cms.services.models;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Data
public class State {
    @Id
    private ObjectId _id;
    private String name;
    private String description;

}
