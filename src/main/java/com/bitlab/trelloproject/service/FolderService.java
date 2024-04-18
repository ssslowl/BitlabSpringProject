package com.bitlab.trelloproject.service;

import com.bitlab.trelloproject.entity.Folder;
import com.bitlab.trelloproject.repository.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FolderService {
    @Autowired
    private FolderRepository folderRepository;

    public List<Folder> getAllFolders(){
        return folderRepository.findAll();
    }

    public Folder getFolder(Long id){
        return  folderRepository.getReferenceById(id);
    }

    public void addFolder(Folder newFolder){
        folderRepository.save(newFolder);
    }

    public void deleteFolder(Folder folder) {folderRepository.deleteById(folder.getId());}
}
