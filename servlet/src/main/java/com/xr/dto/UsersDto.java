package com.xr.dto;

import com.xr.entity.Users;

/**
 * @author xurui
 * @create 2023-05-08 22:45
 */
public class UsersDto {
    private Integer code; //记录失败成功信息
    private Users users;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
