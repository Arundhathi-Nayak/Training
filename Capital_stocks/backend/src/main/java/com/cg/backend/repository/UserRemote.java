package com.cg.backend.repository;

import com.cg.backend.entity.UserInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRemote extends JpaRepository<UserInformation, String> {
    UserDetails findByUsername(String username);

}
