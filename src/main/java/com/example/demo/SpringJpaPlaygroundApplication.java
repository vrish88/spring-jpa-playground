package com.example.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaPlaygroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaPlaygroundApplication.class, args);
    }

    @Bean
    ApplicationRunner playground(PostRepository postRepository) {
        return args -> {
            postRepository.save(new Post(1L));

            System.out.println(postRepository.findById(1L));
        };
    }
}
