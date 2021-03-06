package com.chukwuma.springsecurityjwt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "USER_TBL")
@Data
@NoArgsConstructor@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private long id;
    private String userName;
    private String password;
    private String email;
}
