package com.ll.jpa_20241011.domain.article.service;

import com.ll.jpa_20241011.domain.article.article.entity.Article;
import com.ll.jpa_20241011.domain.article.repository.ArticleRepository;
import com.ll.jpa_20241011.domain.member.member.entity.Member;
import com.ll.jpa_20241011.global.rsData.RsData;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
@Transactional(readOnly = true)
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Transactional
    public RsData<Article> write(long authorId, String title, String body){
        Article article = Article.builder()
                .modifyData(LocalDateTime.now())
                .author(Member.builder().id(authorId).build())
                .title(title)
                .body(body)
                .build();

        articleRepository.save(article);
        return RsData.of("200", "%d 게시글이 작성되었습니다".formatted(article.getId()),article);
    }

    @Transactional
    public void modify(Article article, String title, String body  ){
        article.setTitle(title);
        article.setBody(body);

        articleRepository.save(article);
        article.setModifyData(LocalDateTime.now());
    }

    public Optional<Article> findById(long id){
        return articleRepository.findById(id);
    }

}
