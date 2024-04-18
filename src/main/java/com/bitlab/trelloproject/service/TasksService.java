package com.bitlab.trelloproject.service;


import com.bitlab.trelloproject.entity.Tasks;
import com.bitlab.trelloproject.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TasksService {
    @Autowired
    TasksRepository tasksRepository;



    public Tasks addTask(Tasks task){
        return  tasksRepository.save(task);
    }

    public List<Tasks> getTasks(Long id){
        return  tasksRepository.getTasksByFolder_Id(id);
    }


}
