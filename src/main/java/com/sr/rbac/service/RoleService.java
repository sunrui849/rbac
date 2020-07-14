package com.sr.rbac.service;

import com.sr.rbac.domain.Privilege;
import com.sr.rbac.domain.Role;
import com.sr.rbac.domain.common.PageInfo;
import com.sr.rbac.domain.common.Result;

import java.util.Set;

public interface RoleService {
    Result createRole(Role role);
    Result updateRole(Role role);
    Result deleteRole(String roleId);
    Result<Role> findByRoleId(String roleId);
    Result<PageInfo<Role>> queryRolePage(String matchName, Integer pageNumber, Integer pageSize);
    Result bindingPrivilege(Set<String> privilegeIdSet);
    Result<Set<Privilege>> queryRolePrivilege(String roleId);

}
