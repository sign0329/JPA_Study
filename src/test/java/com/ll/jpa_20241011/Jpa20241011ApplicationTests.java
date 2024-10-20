package com.ll.jpa_20241011;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootTest
@EnableJpaAuditing// @CreatedDate, @LastModifiedDate를 사용하기 위해 필요
class Jpa20241011ApplicationTests {

    @Test
    void contextLoads() {
    }

}
