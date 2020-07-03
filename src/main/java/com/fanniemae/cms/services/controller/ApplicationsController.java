package com.fanniemae.cms.services.controller;
import com.fanniemae.cms.services.models.Applications;
import com.fanniemae.cms.services.service.ApplicationService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/applications")
public class ApplicationsController {

@Autowired
private ApplicationService applicationService;

    @RequestMapping(value ="", method = RequestMethod.GET)
    public List<Applications> getAllApplications() {
        return applicationService.getAllApplications();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Applications getApplicationById(@PathVariable("id") ObjectId _id) {
        return applicationService.getApplicationById(_id);
    }

    @RequestMapping(value ="", method = RequestMethod.POST)
    public Applications createApplication(@RequestBody Applications applications) {
        applicationService.createApplication(applications);
        return applications;
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyApplicationById(@PathVariable("id") ObjectId id, @RequestBody Applications applications) {
        applicationService.updateApplicationById(id,applications);
    }
    @RequestMapping(value = "{/id}", method = RequestMethod.DELETE)
    public void deleteApplicationById(@PathVariable("id") ObjectId id){
        applicationService.deleteApplication(id);
    }

}
