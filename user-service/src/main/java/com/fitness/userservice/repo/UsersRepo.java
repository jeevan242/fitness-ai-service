package com.fitness.userservice.repo;

import com.fitness.userservice.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<Users, String> {
    boolean existsByEmail(String email);

}
