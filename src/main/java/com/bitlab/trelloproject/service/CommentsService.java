package com.bitlab.trelloproject.service;


import com.bitlab.trelloproject.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsService {
    @Autowired
    CommentsRepository commentsRepository;
}
