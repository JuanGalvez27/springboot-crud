package com.barbaros.crudnotas.model;

import org.springframework.data.annotation.TypeAlias;

import javax.persistence.*;

@Entity
@Table
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String content;

    public Note(){ //Constructor vacio

    }

    public Note(String title, String content){
        this.title = title;
        this.content = content;
    }

    public String getTitle(){
        return this.title;
    }

    public String getContent(){
        return this.content;
    }

    public Long getId(){
        return this.id;
    }
}
