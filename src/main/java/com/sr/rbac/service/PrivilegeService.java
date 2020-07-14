package com.sr.rbac.service;

import com.sr.rbac.domain.Privilege;
import com.sr.rbac.domain.common.PageInfo;
import com.sr.rbac.domain.common.Result;

public interface PrivilegeService {
    Result createPrivilege(Privilege privilege);
    Result updatePrivilege(Privilege privilege);
    Result deletePrivilege(String privilegeId);
    Result<Privilege> findByPrivilegeId(String privilegeId);
    Result<PageInfo<Privilege>> queryPrivilegePage(String matchName, String type, Integer pageNumber, Integer pageSize);

}
