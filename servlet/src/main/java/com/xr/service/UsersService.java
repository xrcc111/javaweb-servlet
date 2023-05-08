package com.xr.service;

import com.xr.dto.UsersDto;

/**
 * @author xurui
 * @create 2023-05-08 22:44
 */
public interface UsersService {
    public UsersDto login(String username, String password);
}
