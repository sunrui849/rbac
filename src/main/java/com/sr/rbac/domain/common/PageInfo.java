package com.sr.rbac.domain.common;

import lombok.Data;

import java.util.List;

/**
 * @author: sunrui62
 * @date: 2020/7/14 16:55
 * @description: TODO
 */
@Data
public class PageInfo<T> {
    private List<T> list;
    //当前页
    private int pageNum;
    //每页的数量
    private int pageSize;
    //当前页的数量
    private int size;
    //总页数
    private int totalPages;
    //总记录数
    private long total;

}
