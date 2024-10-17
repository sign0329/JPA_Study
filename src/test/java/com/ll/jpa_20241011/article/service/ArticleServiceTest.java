package com.ll.jpa_20241011.article.service;

import com.ll.jpa_20241011.domain.article.article.entity.Article;
import com.ll.jpa_20241011.domain.article.service.ArticleService;
import com.ll.jpa_20241011.domain.member.member.entity.Member;
import com.ll.jpa_20241011.domain.member.service.MemberService;
import com.ll.jpa_20241011.global.rsData.RsData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
@ActiveProfiles("test")
@Transactional
public class ArticleServiceTest {

    @Autowired
    private ArticleService articleService;
    @Autowired
    private MemberService memberService;

    @Test
    @DisplayName("글쓰기")
    void t1(){
        RsData<Article> writeRs = articleService.write(1, "제목", "내용");
        Article article = writeRs.getData();

        assertThat(article.getId()).isGreaterThan(0L);

    }

    @Test
    @DisplayName("1번 글의 작성자의 username은 user1이다")
    void t2(){
        Article article = articleService.findById(1L).get();
        Member author = article.getAuthor();

        assertThat(author.getUsername()).isEqualTo("user1");

    }

}
