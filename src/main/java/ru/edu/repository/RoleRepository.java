package ru.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.edu.entity.User;

@Repository
public interface RoleRepository extends JpaRepository<User, Long> {
}
