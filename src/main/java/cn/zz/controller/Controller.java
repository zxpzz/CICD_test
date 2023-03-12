package cn.zz.controller;

import cn.zz.mapper.Mapper;
import cn.zz.pojo.Pojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    Mapper mapper;
    @GetMapping(value = "/user")
    public String findAll(){
        return "查询所有用户";
    }
    @RequestMapping("/select")
    public List<Pojo> select1(){
        return mapper.selectList(null);
    }
}
