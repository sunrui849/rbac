package com.sr.rbac.service.impl;

import com.sr.rbac.domain.Privilege;
import com.sr.rbac.domain.Role;
import com.sr.rbac.domain.UserInfo;
import com.sr.rbac.domain.common.PageInfo;
import com.sr.rbac.domain.common.Result;
import com.sr.rbac.service.UserService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author: sunrui62
 * @date: 2020/7/14 15:58
 * @description: TODO
 */
@Service
@ConditionalOnProperty(prefix = "com.sr.rbac.service", name = "useDefaultUserService", havingValue = "true", matchIfMissing = true)
public class UserServiceImpl implements UserService {
    @Override
    public Result createUser(UserInfo userInfo) {
        return null;
    }

    @Override
    public Result updateUser(UserInfo userInfo) {
        return null;
    }

    @Override
    public Result deleteByUserId(String userId) {
        return null;
    }

    @Override
    public Result<UserInfo> findByUserId(String userId) {
        return null;
    }

    @Override
    public Result<PageInfo<UserInfo>> queryUserPage(String matchName, Integer pageNumber, Integer pageSize) {
        return null;
    }

    @Override
    public Result grantRole(Set<String> roleIdSet) {
        return null;
    }

    @Override
    public Result<Set<Role>> queryUserRoles(String userId) {
        return null;
    }

    @Override
    public Result<Set<Privilege>> queryUserPrivilege(String userId) {
        return null;
    }
}
