package com.jawa.reactive.service;

import com.jawa.reactive.entities.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class UserService {
    User user1 = new User("Jawahar", 32, "Veppampattu");
    User user2 = new User("Nirmala", 28, "Veppampattu");
    User user3 = new User("Dharshan", 2, "Veppampattu");

    public Flux<User> getUsers() {
        return Flux.just(user1,user2,user3);
    }

}
