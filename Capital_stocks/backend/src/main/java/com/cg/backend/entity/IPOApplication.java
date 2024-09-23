package com.cg.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class IPOApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;//Id
    private Long stockId;//Stock Identifier
    private Long accountId;//Account Identifier
    private Double bidAmount;//Applied Amount
    private int numberOfShares;//Number of Shares
    private String status;//Status of Application{Pending,Allocated}

}
