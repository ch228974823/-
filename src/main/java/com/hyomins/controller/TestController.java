package com.hyomins.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: chenjun
 * @Date: 2018/12/6 16:20
 * @Description:
 */
@RestController
@Api(value = "/",description = "这是我的get方法")
public class TestController {

    @RequestMapping(value="/get/with/list",method = RequestMethod.GET)
    @ApiOperation(value="需要携带参数才能访问的get请求",httpMethod = "GET")
    public Map<String,Integer> getList(@RequestParam Integer start,@RequestParam Integer end){
        Map<String,Integer> map=new HashMap<>();
        map.put("猴子",6300);
        map.put("发条",4800);
        map.put("小炮",1350);
        return map;
    }
}
