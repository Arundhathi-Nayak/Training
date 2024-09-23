package com.cg.fronted.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class IPOApplication {

    private Long id;//Id
    private Long stockId;//Stock Identifier
    private Long accountId;//Account Identifier
    private Double bidAmount;//Applied Amount
    private int numberOfShares;//Number of Shares
    private String status;//Status of Application{Pending,Allocated}

}
