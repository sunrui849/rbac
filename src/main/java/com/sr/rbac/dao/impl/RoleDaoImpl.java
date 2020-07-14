package com.sr.rbac.dao.impl;

import com.sr.rbac.dao.RoleDao;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * @author: sunrui62
 * @date: 2020/7/14 17:30
 * @description: TODO
 */
@Component
@ConditionalOnProperty(prefix = "com.sr.rbac.dao", name = "useDefaultRoleDao", havingValue = "true", matchIfMissing = true)
public class RoleDaoImpl implements RoleDao {
}
