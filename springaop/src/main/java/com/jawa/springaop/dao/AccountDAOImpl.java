package com.jawa.springaop.dao;

import org.springframework.stereotype.Repository;

import java.sql.SQLOutput;

@Repository
public class AccountDAOImpl implements AccountDAO {
    @Override
    public void addAccount() {
        System.out.println(getClass() + "Adding the account");
    }
}
