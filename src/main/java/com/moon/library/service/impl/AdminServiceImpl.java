package com.moon.library.service.impl;

import com.moon.library.dao.AdminMapper;
import com.moon.library.pojo.Admin;
import com.moon.library.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin selectAdmin(Admin admin) {
        return adminMapper.selectAdmin(admin);
    }

    @Override
    public void alterPwd(Admin admin) {
        adminMapper.alterPwd(admin);
    }
}
