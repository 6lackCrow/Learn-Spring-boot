package com.spbdemo.xxdemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Accounts")
@Getter
@Setter
public class Account {
    @Id
    private Long id;
    private String name;
}
