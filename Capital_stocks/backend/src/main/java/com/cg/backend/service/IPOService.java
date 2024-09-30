package com.cg.backend.service;

import com.cg.backend.entity.IPOApplication;
import com.cg.backend.repository.IPOInterface;
import com.cg.backend.repository.IPORemote;
//import com.cg.backend.repository.UserRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IPOService implements IPOInterface {

    @Autowired
    IPORemote ipoRemote;
//    @Autowired
//    UserRemote userRemote;

    @Override
    public void applyIPO(IPOApplication ipoApplication) {
        ipoRemote.save(ipoApplication);
    }

    @Override
    public void allocation(Double price) {
        ipoRemote.updateStatusByPrice(price);
    }

    @Override
    public Optional<IPOApplication> statusIPO(Long accountId) {
        return ipoRemote.findById(accountId);
    }

    private Optional<IPOApplication> status(Long account) {
            return ipoRemote.findById(account);
    }
}
