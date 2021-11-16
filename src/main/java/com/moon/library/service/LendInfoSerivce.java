package com.moon.library.service;

import com.moon.library.pojo.LendInfo;
import com.moon.library.util.PageBean;

import java.util.Map;

public interface LendInfoSerivce {

    PageBean<LendInfo> queryLeadInfoPage(Map<String, Object> paramMap);

    void backBook(Map<String, Object> ret);

    boolean isLended(LendInfo lendInfo);

    Integer cardState(Integer reader_id);

    void  addLend(LendInfo lendInfo);
}
