package com.example.be.repository.user;

import com.example.be.model.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IUserRepository extends JpaRepository<User, Integer> {
    @Query(
            value = " select * from user where email = :email ", nativeQuery = true
    )
    User getUserByEmail(@Param("email") String email);

    boolean existsByEmail(String email);
}
