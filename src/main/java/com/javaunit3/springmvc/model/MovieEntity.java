package com.javaunit3.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class MovieEntity {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

}
