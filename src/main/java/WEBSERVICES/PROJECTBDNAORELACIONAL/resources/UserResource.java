package WEBSERVICES.PROJECTBDNAORELACIONAL.resources;

import WEBSERVICES.PROJECTBDNAORELACIONAL.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {


    public ResponseEntity<List<User>> findById(){
        User maria = new User("1","Maria Silva", "maria@gmail.com");
        User alex = new User("2","Alex brown", "alex@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria, alex));
        return ResponseEntity.ok().body(list);
    }
}
