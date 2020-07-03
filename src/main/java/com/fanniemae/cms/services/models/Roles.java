package com.fanniemae.cms.services.models;

import lombok.Data;

import java.util.List;

@Data
public class Roles {
    private String name;
    private String appCode;
    private List<String> permissions;


}
