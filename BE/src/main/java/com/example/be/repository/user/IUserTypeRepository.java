package com.example.be.repository.user;

import com.example.be.model.users.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IUserTypeRepository extends JpaRepository<UserType,Integer> {
}
