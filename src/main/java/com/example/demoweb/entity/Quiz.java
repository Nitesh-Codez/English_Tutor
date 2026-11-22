package com.example.demoweb.entity;
import jakarta.persistence.*;
@Entity
@Table (name = "quizzes")
public class Quiz {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private  String title;
        private String subject;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }
}
