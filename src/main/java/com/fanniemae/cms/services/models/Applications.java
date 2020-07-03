package com.fanniemae.cms.services.models;
import lombok.Data;

import org.bson.types.ObjectId;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "applications")
public class Applications {



    @Id
    private ObjectId _id;
    private String name;
    private String appCode;
    private String path;
    private String owner;
    private List<Metadata> metadataFields;
    private List<Roles> roles;
    private List<Workflows> workflows;


}
