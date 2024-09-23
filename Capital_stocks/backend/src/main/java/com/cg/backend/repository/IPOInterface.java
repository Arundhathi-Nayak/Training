package com.cg.backend.repository;

import com.cg.backend.entity.IPOApplication;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IPOInterface {

    void applyIPO(IPOApplication ipoApplication);

    void allocation(Double price);

    Optional<IPOApplication> statusIPO(Long accountId);


}
