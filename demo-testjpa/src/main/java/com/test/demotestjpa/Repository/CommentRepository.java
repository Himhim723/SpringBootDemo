package com.test.demotestjpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demotestjpa.entity.Comment;


@Repository
public interface CommentRepository extends JpaRepository<Comment, String> {
}
