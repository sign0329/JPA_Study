package com.ll.jpa_20241011.domain.member.repository;

import com.ll.jpa_20241011.domain.member.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
