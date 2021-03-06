package com.ywst.springboot.mapper;

import com.ywst.springboot.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
//spring框架，事务管理AOP玩注解
@Transactional(readOnly = true)
public interface EmpMapper {
    List<Emp> selectAll();

}
