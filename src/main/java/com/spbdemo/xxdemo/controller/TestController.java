package com.spbdemo.xxdemo.controller;

import com.spbdemo.xxdemo.model.Account;
import com.spbdemo.xxdemo.repository.AccountRepository;
import com.spbdemo.xxdemo.server.TestServer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    AccountRepository accountRepository;

    @RequestMapping("/testAdd")
    public Object testAdd(String username,String password){
        Account testAccount = accountRepository.findAccountByName(username);
        if (testAccount != null){
            return ResponseEntity.badRequest().body("账号已存在");
        }
        Account account = new Account();
        account.setName(username);
        account.setPassword(password);
        accountRepository.save(account);

        return account;
    }
}
