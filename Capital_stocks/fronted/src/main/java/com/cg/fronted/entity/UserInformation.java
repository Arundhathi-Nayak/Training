package com.cg.fronted.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserInformation {

    private Long accountId; //Id
    private String username; //Username
    private String password; //Password


}
