package com.xr.service.impl;

import com.xr.dao.UsersDao;
import com.xr.dao.impl.UsersDaoImpl;
import com.xr.dto.UsersDto;
import com.xr.entity.Users;
import com.xr.service.UsersService;

/**
 * @author xurui
 * @create 2023-05-08 22:52
 */
public class UsersServiceImpl implements UsersService {
    private UsersDao usersDao = new UsersDaoImpl();
    @Override
    public UsersDto login(String username, String password) {
        Users user = this.usersDao.findByUsersName(username);
        UsersDto usersDto = new UsersDto();
        if(user == null) {
            usersDto.setCode(-1);
        }else {
            if(!user.getPassword().equals(password)) {
                usersDto.setCode(-2);
            }else {
                usersDto.setCode(0);
                usersDto.setUsers(user);
            }
        }
        return usersDto;
    }
}
