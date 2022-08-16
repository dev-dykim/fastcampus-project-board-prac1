package com.fastcampus.projectboardprac1.repository;

import com.fastcampus.projectboardprac1.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}