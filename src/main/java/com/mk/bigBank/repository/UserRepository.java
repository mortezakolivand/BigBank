package com.mk.bigBank.repository;


import com.mk.bigBank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<User, Long > {

    @Query(value = "Select * from users u where u.email= ?1 ",nativeQuery = true)
    User findByEmail(String email);

}
