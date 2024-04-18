package com.bitlab.trelloproject.repository;

import com.bitlab.trelloproject.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository <Comments, Long> {
}
