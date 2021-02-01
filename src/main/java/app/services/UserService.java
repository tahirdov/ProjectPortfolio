package app.services;

import app.entities.User;
import app.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;

    public Optional<User> findUserByEmail (String mail) {
        return repo.findUserByUserMail(mail);
    }


}
