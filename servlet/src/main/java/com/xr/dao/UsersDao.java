package com.xr.dao;

import com.xr.entity.Users;

/**
 * @author xurui
 * @create 2023-05-08 22:55
 */
public interface UsersDao {
    public Users findByUsersName(String username);
}
