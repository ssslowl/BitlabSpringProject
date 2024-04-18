package com.bitlab.trelloproject.repository;


import com.bitlab.trelloproject.entity.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface FolderRepository extends JpaRepository<Folder, Long> {
    void deleteById(Long id);
}