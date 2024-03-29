package com.example.demo;

import com.example.demo.db.entity.Account;
import com.example.demo.db.mapper.AccountMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    AccountMapper accountMapper;

    @Test
    void contextLoads() {
        //given
        Long expectAccountId = 1l;

        //when
        Account actual = accountMapper.selectByAccountId(expectAccountId).get();

        //then
        System.out.println("actual = " + actual);
        Assertions.assertEquals(expectAccountId, actual.getAccountId());
    }

}
