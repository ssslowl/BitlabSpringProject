package com.bitlab.trelloproject.repository;

import com.bitlab.trelloproject.entity.TaskCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TaskCategoriesRepository extends JpaRepository<TaskCategories, Long> {
}
