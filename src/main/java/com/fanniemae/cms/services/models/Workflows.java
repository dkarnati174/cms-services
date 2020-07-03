package com.fanniemae.cms.services.models;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "workflows")
public class Workflows {
    @Id
    private ObjectId _id;
    private String name;
    private String type;
    private List<State> states;
    private State defaultState;

}
