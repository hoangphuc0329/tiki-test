package io.spring.demo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private TextService textService;

    @Test
    void compressesMessage() {
        restTemplate.getForObject("/search?message=abaasass", String.class);
        Mockito.verify(textService).handle("abaasass");
    }
}