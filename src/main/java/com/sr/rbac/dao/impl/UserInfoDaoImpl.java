package com.sr.rbac.dao.impl;

import com.sr.rbac.dao.UserInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author: sunrui62
 * @date: 2020/7/14 17:21
 * @description: TODO
 */
@Component
@ConditionalOnProperty(prefix = "com.sr.rbac.dao", name = "useDefaultUserInfoDao", havingValue = "true", matchIfMissing = true)
public class UserInfoDaoImpl implements UserInfoDao {

    @Autowired
    private DataSource dataSource;
}
