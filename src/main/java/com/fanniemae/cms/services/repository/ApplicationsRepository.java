package com.fanniemae.cms.services.repository;
import com.fanniemae.cms.services.models.Applications;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ApplicationsRepository extends MongoRepository<Applications, String> {

    Applications findBy_id(ObjectId _id);

}
