package com.algaworks.algafood.infrastructure.persistence.cozinha;

import com.algaworks.algafood.infrastructure.data.model.cozinha.CozinhaDocument;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CozinhaMongoRepository extends MongoRepository<CozinhaDocument, ObjectId> {
}
