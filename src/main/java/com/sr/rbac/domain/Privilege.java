package com.sr.rbac.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: sunrui62
 * @date: 2020/7/14 15:17
 * @description: 权限
 */
@Data
public class Privilege implements Serializable {
    private static final long serialVersionUID = -5583209032902400621L;
    private String privilegeId;
    private String name;
    private String code;
    private String type;
    private Integer level;
    private String desc;
    private String status;
}
