package com.sr.rbac.service.impl;

import com.sr.rbac.domain.Privilege;
import com.sr.rbac.domain.Role;
import com.sr.rbac.domain.common.PageInfo;
import com.sr.rbac.domain.common.Result;
import com.sr.rbac.service.RoleService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author: sunrui62
 * @date: 2020/7/14 16:13
 * @description: TODO
 */
@Service
@ConditionalOnProperty(prefix = "com.sr.rbac.service", name = "useDefaultRoleService", havingValue = "true", matchIfMissing = true)
public class RoleServiceImpl implements RoleService {
    @Override
    public Result createRole(Role role) {
        return null;
    }

    @Override
    public Result updateRole(Role role) {
        return null;
    }

    @Override
    public Result deleteRole(String roleId) {
        return null;
    }

    @Override
    public Result<Role> findByRoleId(String roleId) {
        return null;
    }

    @Override
    public Result<PageInfo<Role>> queryRolePage(String matchName, Integer pageNumber, Integer pageSize) {
        return null;
    }

    @Override
    public Result bindingPrivilege(Set<String> privilegeIdSet) {
        return null;
    }

    @Override
    public Result<Set<Privilege>> queryRolePrivilege(String roleId) {
        return null;
    }
}
