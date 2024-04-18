package com.bitlab.trelloproject.repository;


import com.bitlab.trelloproject.entity.Folder;
import com.bitlab.trelloproject.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TasksRepository extends JpaRepository<Tasks, Long> {
    public List<Tasks> getTasksByFolder_Id(Long id);

    public void deleteByFolder_Id(Long id);
    public void deleteAllByFolder(Folder folder);
}
