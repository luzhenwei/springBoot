package com.example.demo.controller;

import com.example.demo.user.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api(value = "FastJson测试", tags = { "测试接口" })
@RestController
@RequestMapping("fastjson")
public class FastJsonController {

    @ApiOperation("获取用户信息")
    @ApiImplicitParam(name = "name", value = "用户名", dataType = "string", paramType = "query")
    @GetMapping("/test/{name}")
    public User test(@PathVariable("name") String name) {
        User user = new User();
        user.setId(1);
        user.setUsername(name);
        user.setPassword("jack123");
        user.setBirthday(new Date());
        return user;
    }
}
