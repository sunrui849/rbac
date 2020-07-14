package com.sr.rbac.service;

import com.sr.rbac.domain.Privilege;
import com.sr.rbac.domain.Role;
import com.sr.rbac.domain.UserInfo;
import com.sr.rbac.domain.common.PageInfo;
import com.sr.rbac.domain.common.Result;

import java.util.Set;

public interface UserService {
    Result createUser(UserInfo userInfo);
    Result updateUser(UserInfo userInfo);
    Result deleteByUserId(String userId);
    Result<UserInfo> findByUserId(String userId);
    Result<PageInfo<UserInfo>> queryUserPage(String matchName, Integer pageNumber, Integer pageSize);
    Result grantRole(Set<String> roleIdSet);
    Result<Set<Role>> queryUserRoles(String userId);
    Result<Set<Privilege>> queryUserPrivilege(String userId);

}
