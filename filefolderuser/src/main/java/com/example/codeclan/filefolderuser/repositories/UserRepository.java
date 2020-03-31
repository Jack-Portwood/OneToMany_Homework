package com.example.codeclan.filefolderuser.repositories;

import com.example.codeclan.filefolderuser.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
