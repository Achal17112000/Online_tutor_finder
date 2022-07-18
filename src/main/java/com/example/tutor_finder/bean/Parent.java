package com.example.tutor_finder.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "parent")
@Getter
@Setter
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long parentId;

    private String name;
    private String city;
    private Long pincode;
    private String area;
    private String child_name;
    private String subject;
    private String standard;
    private Long mob_no;
    private String username;
    private String password;
    private String emailId;
    private float rating;
    private String bookTutor;



}
