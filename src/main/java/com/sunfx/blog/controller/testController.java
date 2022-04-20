package com.sunfx.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sfx
 * @date 2022/4/20 16:22
 */
@RestController
@RequestMapping("/test")
public class testController {

    @GetMapping("")
    public String test(){
        return "测试成功";
    }
}
