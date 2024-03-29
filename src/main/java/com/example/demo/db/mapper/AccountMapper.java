package com.example.demo.db.mapper;

import com.example.demo.db.entity.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface AccountMapper {
    Optional<Account> selectByAccountId(Long accountId);
}
