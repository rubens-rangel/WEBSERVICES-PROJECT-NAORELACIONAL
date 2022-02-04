package WEBSERVICES.PROJECTBDNAORELACIONAL.config;



import WEBSERVICES.PROJECTBDNAORELACIONAL.domain.Post;
import WEBSERVICES.PROJECTBDNAORELACIONAL.domain.User;
import WEBSERVICES.PROJECTBDNAORELACIONAL.repository.PostRepository;
import WEBSERVICES.PROJECTBDNAORELACIONAL.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        SimpleDateFormat sdf = new SimpleDateFormat(("dd/MM/yyyy"));
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        Post post1 = new Post(null, sdf.parse("21/03/2018"), "partiu viagem", " Vou viajar para são paulo, abraços!", maria);
        Post post2 = new Post(null, sdf.parse("23/03/2018"), "bom dia!", " Acordei bem hoje!", maria);

        userRepository
                .saveAll(Arrays.asList(maria, alex, bob));

        postRepository.saveAll(Arrays.asList(post1,post2));
    }
}
