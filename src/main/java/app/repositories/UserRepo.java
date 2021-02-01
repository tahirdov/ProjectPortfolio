package app.repositories;

import app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    User findUserByUserId (Long userId);
    Optional<User> findUserByUserMail (String mail);

    @Override
    <S extends User> S save(S s);
}
