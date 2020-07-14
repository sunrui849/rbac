package com.sr.rbac.domain.common;

import com.sr.rbac.domain.common.enu.ResultCodeEnum;
import lombok.Data;

/**
 * @author: sunrui62
 * @date: 2020/7/14 16:22
 * @description: TODO
 */
@Data
public class Result<T> {
    private ResultCodeEnum code;
    private String msg;
    private T data;

    public boolean success(){
        return ResultCodeEnum.SUCCESS.equals(code);
    }
}
