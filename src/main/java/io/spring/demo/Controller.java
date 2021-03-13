package io.spring.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final TextService textService;

    public Controller(TextService textService) {
        this.textService = textService;
    }

    @GetMapping(path = "/search")
    public ResponseEntity<String> compressesMessage(@RequestParam String message) {
        return ResponseEntity.ok(textService.handle(message));
    }
}
