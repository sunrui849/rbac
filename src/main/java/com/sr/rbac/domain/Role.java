package com.sr.rbac.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: sunrui62
 * @date: 2020/7/14 15:08
 * @description: 角色
 */
@Data
public class Role implements Serializable {
    private static final long serialVersionUID = 4216965567706408657L;
    private String roleId;
    private String name;
    private String code;
    private String desc;
    private String status;
}
