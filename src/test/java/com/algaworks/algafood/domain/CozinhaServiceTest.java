package com.algaworks.algafood.domain;

import com.algaworks.algafood.domain.service.cozinha.CozinhaService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CozinhaServiceTest {

    @Autowired
    private CozinhaService cozinhaService;

    @Test
    @DisplayName("Must successfully create a kitchen")
    void create() {
        cozinhaService.create();
    }
}
