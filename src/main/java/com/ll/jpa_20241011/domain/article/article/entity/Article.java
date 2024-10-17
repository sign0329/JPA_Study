package com.ll.jpa_20241011.domain.article.article.entity;

import com.ll.jpa_20241011.domain.member.member.entity.Member;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @ManyToOne
    private Member author;
    private String title;
    private String body;

}

