package io.spring.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TextServiceTest {

    @Autowired
    private TextService textService;

    @Test
    void handle() {
        Assertions.assertThat(textService.handle("abaasass")).isEqualTo("aba2sas2");
        Assertions.assertThat(textService.handle("abaasasss")).isEqualTo("aba2sas3");
        Assertions.assertThat(textService.handle("aaabaasass")).isEqualTo("a3ba2sas2");
    }
}