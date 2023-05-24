package com.algaworks.algafood.infrastructure.repository.cozinha;

import com.algaworks.algafood.domain.repository.cozinha.CozinhaRepository;
import com.algaworks.algafood.infrastructure.data.model.cozinha.CozinhaDocument;
import com.algaworks.algafood.infrastructure.data.util.DataProvider;
import com.algaworks.algafood.infrastructure.data.util.UuidProvider;
import com.algaworks.algafood.infrastructure.persistence.cozinha.CozinhaMongoRepository;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public class CozinhaRepositoryImpl implements CozinhaRepository {

    private final CozinhaMongoRepository mongoRepository;
    private final Logger logger;

    public CozinhaRepositoryImpl(final CozinhaMongoRepository cozinhaMongoRepository, final Logger logger) {
        this.mongoRepository = cozinhaMongoRepository;
        this.logger = logger;
    }

    @Override
    public void create() {
        try {
            logger.info("Trying to create kitchen");
            CozinhaDocument document = new CozinhaDocument();
            document.setUuid(UuidProvider.getUuid());
            document.setCreateDate(DataProvider.getLocalDateTime());
            document.setUpdateDate(DataProvider.getLocalDateTime());
            mongoRepository.save(document);
        } catch (final Exception exception) {
            logger.error("Failed to create kitchen in database. Exception: {}", ExceptionUtils.getStackTrace(exception));
            throw exception;
        }
    }
}
