package WEBSERVICES.PROJECTBDNAORELACIONAL.repository;

import WEBSERVICES.PROJECTBDNAORELACIONAL.domain.Post;
import WEBSERVICES.PROJECTBDNAORELACIONAL.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}