package com.jawa.springaop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ManagementDAPImpl implements ManagementDAO{
    @Override
    public Integer getCode(Integer number) {
        return number+10;
    }
}
