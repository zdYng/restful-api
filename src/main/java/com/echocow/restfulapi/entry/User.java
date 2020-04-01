package com.echocow.restfulapi.entry;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler","fieldHandler"},allowGetters = true)
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "username",nullable = true,length = 32)
    private String username;

    @Column(name = "password", nullable = true,length = 32)
    private String password;

    @Column(name = "age",nullable = true,length = 11)
    private Integer age;

    @Column(name = "sex",nullable = true,length = 11)
    private Integer sex;

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public Integer getSex(){
        return sex;
    }

    public void setSex(Integer sex){
        this.sex = sex;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

}
