package com.yiguan.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * FileName: controller
 * Author:   Administrator
 * Description:
 * Time:     2019/3/12 11:27
 * version:    1.0
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@RestController
public class controller {
    @Autowired
    private  service ser;
    @GetMapping("test")
    public String get() {

        System.out.println(ser.get());
        return "test";
    }
}
