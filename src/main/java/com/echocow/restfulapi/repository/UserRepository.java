package com.echocow.restfulapi.repository;

import com.echocow.restfulapi.entry.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


    User findUserByUsername(String username);

}
