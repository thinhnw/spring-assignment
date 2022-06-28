package com.springboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repo) {
        return args -> {
//            Student john = new Student("John Doe",  LocalDate.of(1999,12,04), "xyz@email.com");
//            Student jane = new Student("Mary Jane",  LocalDate.of(2000,12,04), "xyz@email.com");
//            repo.saveAll(List.of(john, jane));
        };
    }
}
