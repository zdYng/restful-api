//package com.echocow.restfulapi.entry;
//
//
//import lombok.Data;
//import org.hibernate.annotations.ColumnDefault;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//
//@Entity
//@Table(name = "book")
//@Data
//public class Book {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(insertable = false,length = 20,nullable = false)
//    public Long id;  //主键
//
//    @NotNull
//    @Column(length = 50)
//    public String name;
//
//    @NotNull
//    @Column(length = 50)
//    public String author;
//
//    @NotNull
//    @Column()
//    public String description;
//
//    @NotNull
//    @ColumnDefault("1")
//    @Column(length = 1)
//    public Boolean status;
//
//}
