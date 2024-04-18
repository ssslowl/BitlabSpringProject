package com.bitlab.trelloproject.controller;


import com.bitlab.trelloproject.entity.Folder;
import com.bitlab.trelloproject.entity.Tasks;
import com.bitlab.trelloproject.service.FolderService;
import com.bitlab.trelloproject.service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    FolderService FService;

    @Autowired
    TasksService TService;

    @GetMapping("/")
    public String home(Model model){
        List<Folder> folders = FService.getAllFolders();
        model.addAttribute("folders", folders);
        return "home";
    }

    @GetMapping("/folder")
    public String folder(@RequestParam Long id, Model model){
        Folder folder = FService.getFolder(id);
        model.addAttribute("folder", folder);
        List<Tasks> tasks = TService.getTasks(folder.getId());
        model.addAttribute("tasks", tasks);
        return "folder";
    }

    @PostMapping("/addTask")
    public String addTask(Tasks task){
        System.out.println(task.toString());
        TService.addTask(task);
        return "redirect:/folder?id=" + task.getFolder().getId();
    }

    @PostMapping("/updateTask")
    public String updateTask(Tasks task){
        TService.addTask(task);
        return "redirect:/folder?id=" + task.getFolder().getId();
    }

    @PostMapping("/folder")
    public String addFolder(Folder folder){
        FService.addFolder(folder);
        return "redirect:/";
    }

    @PostMapping("/deleteFolder")
    public String deleteFolder(Folder folder){
        FService.deleteFolder(folder);
        return "redirect:/";
    }
}

