package com.sr.rbac.common;

import com.sr.rbac.domain.common.enu.MergeType;

public @interface PrivilegeAnnotation {
    String[] privilegeCode();
    MergeType type();

}
