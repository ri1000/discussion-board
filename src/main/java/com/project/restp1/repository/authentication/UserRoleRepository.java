package com.project.restp1.repository.authentication;

import com.project.restp1.model.dataDB.Role;
import com.project.restp1.model.dataDB.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {

    Optional<UserRole> findByName(Role name);
}
