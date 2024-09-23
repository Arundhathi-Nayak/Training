package com.cg.backend.service;

import com.cg.backend.entity.UserInformation;
import com.cg.backend.repository.UserRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService implements UserDetailsService {
    @Autowired
    UserRemote userRemote;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails user = userRemote.findByUsername(username);
        if (user == null) {
//      logger.info(resourceBundle.getString("db.customer.notfound"));
            throw new UsernameNotFoundException(username);
        }
        return user;
    }

    public void createUser(UserInformation userInformation) {
        userRemote.save(userInformation);
    }


}
