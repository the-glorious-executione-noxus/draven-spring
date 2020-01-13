package com.noxus.draven.hibernate.controller;

import com.noxus.draven.hibernate.config.dynamic.DataSource;
import com.noxus.draven.hibernate.entity.User;
import com.noxus.draven.hibernate.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @DataSource("salve1")
//    @RequestMapping("/hello")
//    public List<Map<String, Object>> hello() {
//        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM user ", new Object[]{});
//        return list;
//    }

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/contextLoads")
    public void contextLoads() {
        User user = userMapper.selectById(2L);
        System.out.println(user);
    }
}
