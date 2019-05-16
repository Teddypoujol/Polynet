package com.polytech.Polynet.business;


import javax.persistence.*;

@Entity
@Table(name="comment")
public class Comment {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "id_story")
    private int id_story;

    @Column(name = "comment")
    private String comm;

    public Comment(int id_story, String comm) {

        this.id_story = id_story;
        this.comm = comm;

    }
    public Comment(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_story() {
        return id_story;
    }

    public void setId_story(int id_story) {
        this.id_story = id_story;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    public Comment(String comm) {

        this.comm = comm;
    }

    public Comment(int id, int id_story, String comm) {
        this.id = id;
        this.id_story = id_story;
        this.comm = comm;

    }

    public String getComment() {
        return comm;
    }

    public void setComment(String com) {
        this.comm= com;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "Comm='" + comm + '\'' +
                '}';
    }
}
