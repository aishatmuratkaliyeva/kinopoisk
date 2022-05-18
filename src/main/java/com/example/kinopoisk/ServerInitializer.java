package com.example.kinopoisk;

import com.example.kinopoisk.model.User;
import com.example.kinopoisk.repo.UserRepo;
import com.example.kinopoisk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ServerInitializer implements ApplicationRunner {
	@Autowired
	private UserRepo userRepo;
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        User user = new User("Admin", "admin@gmail.com", "admin", true);
		userRepo.save(user);
    }
}
