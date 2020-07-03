package com.fanniemae.cms.services.service;


import com.fanniemae.cms.services.models.Applications;
import com.fanniemae.cms.services.repository.ApplicationsRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationsRepository applicationsRepository;

    public List<Applications> getAllApplications() {
        return applicationsRepository.findAll();
    }

    public Applications getApplicationById(ObjectId _id) {
        return applicationsRepository.findBy_id(_id);
    }

    public Applications createApplication(Applications applications) {
        applications.set_id(ObjectId.get());
        applicationsRepository.save(applications);
        return applications;
    }

    public void updateApplicationById(ObjectId id, Applications applications) {
        applications.set_id(id);
        applicationsRepository.save(applications);
    }

    public void deleteApplication(ObjectId id) {
        applicationsRepository.delete(applicationsRepository.findBy_id(id));
    }

}
