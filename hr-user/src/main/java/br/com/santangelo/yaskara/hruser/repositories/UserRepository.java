package br.com.santangelo.yaskara.hruser.repositories;

import br.com.santangelo.yaskara.hruser.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
