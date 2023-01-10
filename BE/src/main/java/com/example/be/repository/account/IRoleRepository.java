package com.example.be.repository.account;

import com.example.be.model.account.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface IRoleRepository extends JpaRepository<Role, Integer> {
    @Query(
            value = " select role.id, role.name from role " +
                    " join account_role on role.id = account_role.role_id " +
                    " where account_id = :accountId ", nativeQuery = true
    )
    List<Role> getListRoleByAccountId(@Param("accountId") Integer accountId);
}
