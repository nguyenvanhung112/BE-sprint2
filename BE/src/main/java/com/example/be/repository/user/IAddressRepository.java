package com.example.be.repository.user;

import com.example.be.model.users.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IAddressRepository extends JpaRepository<Address, Integer> {
}
