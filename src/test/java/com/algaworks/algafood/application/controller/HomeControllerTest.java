package com.algaworks.algafood.application.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("integration-test")
class HomeControllerTest {

    @Autowired
    private HomeController controller;

    @Test
    @DisplayName("Then return body and status code 200")
    public void success() {
        ResponseEntity<String> response = controller.index();

        Assertions.assertEquals(200, response.getStatusCode().value());
        Assertions.assertEquals("Test Property", response.getBody());
    }
}
