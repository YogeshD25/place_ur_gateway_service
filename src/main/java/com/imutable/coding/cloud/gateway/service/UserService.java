package com.imutable.coding.cloud.gateway.service;


import com.imutable.coding.cloud.gateway.model.Userdata;
import com.imutable.coding.cloud.gateway.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Mono<Userdata> findByUsername(String username) {
        Mono<Userdata> data = userRepository.findByEmail(username);
        return data.switchIfEmpty(Mono.empty());
    }

    public Flux<Userdata> getAllUser() {
        return userRepository.findAll();
    }

    public Mono<Userdata> addUpdateUser(Userdata userdata) {
        return userRepository.save(userdata);
    }

}
