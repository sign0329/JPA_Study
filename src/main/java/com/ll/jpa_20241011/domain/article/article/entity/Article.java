package com.ll.jpa_20241011.domain.article.article.entity;

import com.ll.jpa_20241011.domain.member.member.entity.Member;
import com.ll.jpa_20241011.global.jap.baseEntity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;

import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@SuperBuilder
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@Setter
@Getter
@ToString(callSuper = true)
public class Article extends BaseEntity {

    @ManyToOne(fetch = LAZY)
    private Member author;
    private String title;
    private String body;

}

