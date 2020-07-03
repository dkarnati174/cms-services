package com.fanniemae.cms.services.repository;

import com.fanniemae.cms.services.models.Workflows;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkflowsRepository extends MongoRepository<Workflows,String> {

    Workflows findBy_id(ObjectId _id);
    Workflows findByName(String name);

}
