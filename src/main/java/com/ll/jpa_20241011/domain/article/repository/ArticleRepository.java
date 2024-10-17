package com.ll.jpa_20241011.domain.article.repository;

import com.ll.jpa_20241011.domain.article.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
