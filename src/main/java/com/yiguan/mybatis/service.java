package com.yiguan.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * FileName: service
 * Author:   Administrator
 * Description:
 * Time:     2019/3/12 11:33
 * version:    1.0
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service
public class service {
    @Autowired
    private dao ddddd;

    public String get() {
        List<Map<String, Object>> maps = ddddd.get();
        System.out.println(maps.toString());
        return "test";
    }
}
