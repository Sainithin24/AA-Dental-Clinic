package com.aa.clinic.service;

import com.aa.clinic.entity.Users;
import com.aa.clinic.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class AdminUserInitializer {
    @Bean
    public CommandLineRunner createAdminUser(UserRepository userRepository, PasswordEncoder passwordEncoder){
        return args ->{
            if (userRepository.findByUsername("admin").isEmpty()){
                Users admin =new Users();
                admin.setUsername("admin");
                admin.setPassword(passwordEncoder.encode("admin1234"));
                admin.setRole("ROLE_ADMIN");
                userRepository.save(admin);
                System.out.println("Default admin user created!");
            }
        };
    }
}
