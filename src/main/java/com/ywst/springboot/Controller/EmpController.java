package com.ywst.springboot.Controller;

import com.ywst.springboot.entity.Emp;
import com.ywst.springboot.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    //springmvc框架，玩注解
    //输出数据库的数据
    @RequestMapping("/list/emp")
    @ResponseBody
    public List<Emp> list(){
        return empService.getAll();
    }


    //输出字符串到页面
    @RequestMapping("/page")
    @ResponseBody
    public String page(){
        return "This is a Page.";
    }

}
