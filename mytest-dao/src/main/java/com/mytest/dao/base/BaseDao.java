package com.mytest.dao.base;

import java.util.List;

/**
 * 请填写类注释
 *
 * @author 彭奕灵 yiling.peng@ucarinc.com
 * @since 2019年03月27日
 */
public interface BaseDao<T> {
    public Boolean insert(T var);
    public Boolean delete(T var);
    public Boolean update(T var);
    public List<T> select(T var);
}
