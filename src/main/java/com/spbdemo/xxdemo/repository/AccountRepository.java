package com.spbdemo.xxdemo.repository;

import com.spbdemo.xxdemo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
