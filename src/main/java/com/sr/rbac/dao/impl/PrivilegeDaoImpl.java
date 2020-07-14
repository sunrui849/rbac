package com.sr.rbac.dao.impl;

import com.sr.rbac.dao.PrivilegeDao;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * @author: sunrui62
 * @date: 2020/7/14 17:31
 * @description: TODO
 */
@Component
@ConditionalOnProperty(prefix = "com.sr.rbac.dao", name = "useDefaultPrivilegeDao", havingValue = "true", matchIfMissing = true)
public class PrivilegeDaoImpl implements PrivilegeDao {
}
