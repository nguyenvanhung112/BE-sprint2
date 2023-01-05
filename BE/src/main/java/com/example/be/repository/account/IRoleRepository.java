package com.example.be.repository.account;

import com.example.be.model.account.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IRoleRepository extends JpaRepository<Role, Integer> {
}
