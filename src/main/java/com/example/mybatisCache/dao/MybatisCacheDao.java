package com.example.mybatisCache.dao;

import com.example.mybatisCache.model.User;
import org.springframework.stereotype.Component;

@Component
public interface MybatisCacheDao {
    User selectById(Long id);
}
