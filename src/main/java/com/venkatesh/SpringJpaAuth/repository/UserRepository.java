package com.venkatesh.SpringJpaAuth.repository;

import com.venkatesh.SpringJpaAuth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    public User findByUsername(String username);
}
