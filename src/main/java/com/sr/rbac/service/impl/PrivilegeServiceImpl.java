package com.sr.rbac.service.impl;

import com.sr.rbac.domain.Privilege;
import com.sr.rbac.domain.common.PageInfo;
import com.sr.rbac.domain.common.Result;
import com.sr.rbac.service.PrivilegeService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

/**
 * @author: sunrui62
 * @date: 2020/7/14 16:13
 * @description: TODO
 */
@Service
@ConditionalOnProperty(prefix = "com.sr.rbac.service", name = "useDefaultPrivilegeService", havingValue = "true", matchIfMissing = true)
public class PrivilegeServiceImpl implements PrivilegeService {
    @Override
    public Result createPrivilege(Privilege privilege) {
        return null;
    }

    @Override
    public Result updatePrivilege(Privilege privilege) {
        return null;
    }

    @Override
    public Result deletePrivilege(String privilegeId) {
        return null;
    }

    @Override
    public Result<Privilege> findByPrivilegeId(String privilegeId) {
        return null;
    }

    @Override
    public Result<PageInfo<Privilege>> queryPrivilegePage(String matchName, String type, Integer pageNumber, Integer pageSize) {
        return null;
    }
}
