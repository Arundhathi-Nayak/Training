package com.cg.fronted.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Stock {

    private Long stockId; //Id
    private String stockName; //Stock Name
    private Double price; //Listing Price
    private Double status;  //Status of IPO{Pending,Allocated}
}
