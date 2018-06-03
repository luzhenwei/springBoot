package com.example.demo.department.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.demo.department.domain.Department;
import com.example.demo.department.service.DepartmentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentServiceImplTest {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private DepartmentService departmentService;

    @Test
    public void getDepartments() throws Exception {
        departmentService.getDepartments();
    }
    // 测试mybatis缓存
    @Test
    public void testCache() {
        long begin = System.currentTimeMillis();
        departmentService.getDepartments();
        long ing = System.currentTimeMillis();
        departmentService.getDepartments();
        long end = System.currentTimeMillis();
        System.out.println("第一次请求时间：" + (ing - begin) + "ms");
        System.out.println("第二次请求时间:" + (end - ing) + "ms");
    }
}