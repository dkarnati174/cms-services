package com.fanniemae.cms.services.service;

import com.fanniemae.cms.services.models.Workflows;
import com.fanniemae.cms.services.repository.WorkflowsRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WorkflowService {


    @Autowired
    private WorkflowsRepository workflowsRepository;


    public List<Workflows> getAllWorkflows(){

        return workflowsRepository.findAll();
    }

    public Workflows getWorkflowsById(ObjectId _id) {
        return workflowsRepository.findBy_id(_id);
    }


    public Workflows createWorkflow(Workflows workflows){
        workflows.set_id(ObjectId.get());
        workflowsRepository.save(workflows);
        return workflows;
    }

    public Workflows updateWorkflowById(ObjectId id, Workflows workflows){
        workflows.set_id(id);
        workflowsRepository.save(workflows);
        return workflows;
    }
    public void deleteWorkflow(ObjectId id) {
        workflowsRepository.delete(workflowsRepository.findBy_id(id));
    }


}
