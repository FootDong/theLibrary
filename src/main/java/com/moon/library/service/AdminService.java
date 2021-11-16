package com.moon.library.service;

import com.moon.library.pojo.Admin;

public interface AdminService {
    //管理员登录 验证
    Admin selectAdmin(Admin admin);
    //读者修改密码
    void alterPwd(Admin admin);
}
