package br.usp.Apprest.repository;

import br.usp.Apprest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
