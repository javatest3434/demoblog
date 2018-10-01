package com.example.demoblog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "BLOG")
public class BlogModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private int id;

    public int getId() {
        return id;
    }

    @Column(name = "text")
    private String text;



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
