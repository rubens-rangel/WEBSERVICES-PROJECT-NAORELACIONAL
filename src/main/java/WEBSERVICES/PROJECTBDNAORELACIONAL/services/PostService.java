package WEBSERVICES.PROJECTBDNAORELACIONAL.services;

import WEBSERVICES.PROJECTBDNAORELACIONAL.domain.Post;
import WEBSERVICES.PROJECTBDNAORELACIONAL.repository.PostRepository;
import WEBSERVICES.PROJECTBDNAORELACIONAL.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}