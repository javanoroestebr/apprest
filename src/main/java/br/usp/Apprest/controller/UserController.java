package br.usp.Apprest.controller;

import br.usp.Apprest.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping("users")
    public List<User> getAll(){
        List<User> list = new ArrayList<User>();
        User user = new User();
        user.setId(1L);
        user.setName("Caio");
        user.setUsername("neo");
        user.setEmail("neo@gmail");
        list.add(user);

        User user1 = new User(2L,"Rodrigo","trix","trix@gmail.com");
        list.add(user1);
        return list;
    }

}
