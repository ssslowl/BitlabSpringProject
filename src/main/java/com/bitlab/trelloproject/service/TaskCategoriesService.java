package com.bitlab.trelloproject.service;


import com.bitlab.trelloproject.repository.TaskCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskCategoriesService {
    @Autowired
    TaskCategoriesRepository TaskCategoriesRepository;

}
