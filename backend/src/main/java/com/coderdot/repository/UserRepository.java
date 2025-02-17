package com.coderdot.repository;

import com.coderdot.entities.User;
import com.coderdot.entities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByRole(UserRole userRole);

    Optional<User> findFirstByEmail(String email);


}
