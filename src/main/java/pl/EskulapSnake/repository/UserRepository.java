package pl.EskulapSnake.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.EskulapSnake.model.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository   <User, Long> {

    @Query()
    Optional<User>findUserByUserName(String userName);
}
