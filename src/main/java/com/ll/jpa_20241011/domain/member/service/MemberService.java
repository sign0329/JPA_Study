package com.ll.jpa_20241011.domain.member.service;

import com.ll.jpa_20241011.domain.member.member.entity.Member;
import com.ll.jpa_20241011.domain.member.repository.MemberRepository;
import com.ll.jpa_20241011.global.rsData.RsData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public RsData<Member> join(String username, String password){
        Member member = Member.builder()
                .modifyData(LocalDateTime.now())
                .username(username)
                .password(password)
                .build();

        memberRepository.save(member);

        return RsData.of("200,", "%s 님 가입을 환영합니다.".formatted(username), member);
    }

    public Optional<Member> findById(long id){
        return memberRepository.findById(id);
    }
}
