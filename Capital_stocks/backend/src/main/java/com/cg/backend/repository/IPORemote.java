package com.cg.backend.repository;

import com.cg.backend.entity.IPOApplication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IPORemote extends JpaRepository<IPOApplication,Long> {
    @Modifying
    @Transactional
    @Query("UPDATE IPOApplication  p SET p.status = :`Approved` WHERE p.bidAmount <= :bidAmount")
    void updateStatusByPrice( @Param("bidAmount") Double bidAmount);
}
