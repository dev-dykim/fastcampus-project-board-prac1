package com.fastcampus.projectboardprac1.repository;

import com.fastcampus.projectboardprac1.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
