package com.sr.rbac.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: sunrui62
 * @date: 2020/7/14 15:03
 * @description: 用户
 */
@Data
public class UserInfo implements Serializable {
    private static final long serialVersionUID = -194151052109754318L;
    private Long userId;
    private String userName;
    private String nickName;
    private String email;
    private String status;

}
