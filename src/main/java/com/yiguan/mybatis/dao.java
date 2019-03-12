package com.yiguan.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * FileName: dao
 * Author:   Administrator
 * Description:
 * Time:     2019/3/12 11:29
 * version:    1.0
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Repository
@Mapper
public interface dao {
    @Select("select * from emp")
    public List<Map<String, Object>> get();
}
