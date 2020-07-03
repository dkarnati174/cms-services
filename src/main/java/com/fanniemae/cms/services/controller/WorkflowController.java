package com.fanniemae.cms.services.controller;

import com.fanniemae.cms.services.models.Workflows;
import com.fanniemae.cms.services.service.WorkflowService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workflows")
public class WorkflowController {

    @Autowired
    WorkflowService workflowService;

    @RequestMapping(value ="", method = RequestMethod.GET)
    public List<Workflows> getAllWorkflows() {
        return workflowService.getAllWorkflows();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Workflows getWorkflowById(@PathVariable("id") ObjectId _id) {
        return workflowService.getWorkflowsById(_id);
    }

    @RequestMapping(value ="", method = RequestMethod.POST)
    public Workflows createApplication(@RequestBody Workflows workflows) {
        workflowService.createWorkflow(workflows);
        return workflows;
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyWorkflowById(@PathVariable("id") ObjectId id, @RequestBody Workflows workflows) {
        workflowService.updateWorkflowById(id,workflows);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteWorkflowById(@PathVariable("id") ObjectId id) {
        workflowService.deleteWorkflow(id);
    }


}
