package com.algaworks.algafood.domain.service.cozinha;

import com.algaworks.algafood.domain.repository.cozinha.CozinhaRepository;
import org.springframework.stereotype.Service;

@Service
public class CozinhaService {

    private final CozinhaRepository cozinhaRepository;

    public CozinhaService(final CozinhaRepository cozinhaRepository) {
        this.cozinhaRepository = cozinhaRepository;
    }

    public void create(){
        cozinhaRepository.create();
    }
}
