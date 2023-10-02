package bookservice.bookservice.domain.repository;

import bookservice.bookservice.domain.entity.IdentityManager;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IdentityRepository extends MongoRepository<IdentityManager,String> {
}
