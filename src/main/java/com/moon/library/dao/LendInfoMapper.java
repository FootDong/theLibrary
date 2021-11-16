package com.moon.library.dao;

import com.moon.library.pojo.LendInfo;

import java.util.List;
import java.util.Map;

public interface LendInfoMapper {
    List<LendInfo> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    void backBook(Map<String, Object> ret);

    Integer isLended(LendInfo lendInfo);

    Integer cardState(Integer reader_id);

    void  addLend(LendInfo lendInfo);
}
