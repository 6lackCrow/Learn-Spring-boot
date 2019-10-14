package com.spbdemo.xxdemo.controller;

import com.spbdemo.xxdemo.model.Account;
import com.spbdemo.xxdemo.repository.AccountRepository;
import com.spbdemo.xxdemo.server.TestServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Resource
    TestServer testServer;
    @Resource
    AccountRepository accountRepository;

    @RequestMapping("/testAdd")
    public Object testAdd(){
        String name = "crow";
        Account testAccount = accountRepository.findAccountByName(name);
        if (testAccount != null){
           return "该用户已存在";
        }
        Account account = new Account();
        account.setName("crow");
        account.setBio("adsad");
        account.setPassword("7539513132AS¿");
        accountRepository.save(account);

        return account;
    }
}
