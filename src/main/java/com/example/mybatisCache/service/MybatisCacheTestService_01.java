package com.example.mybatisCache.service;

import com.example.mybatisCache.model.User;
import com.example.mybatisCache.dao.MybatisCacheDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MybatisCacheTestService_01 {
    @Autowired
    private MybatisCacheDao mybatisCacheDao;

    public User selectById(Long id) {
        return mybatisCacheDao.selectById(id);
    }
}
