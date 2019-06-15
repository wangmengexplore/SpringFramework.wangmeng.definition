package org.javaboy.jdbctemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbctemplateApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Test
    public void contextLoads() {
        List<Book> list = jdbcTemplate.query("select * from t_book", new BeanPropertyRowMapper<>(Book.class));
        System.out.println(list);
    }

}
