package com.polytech.Polynet.application;

import java.util.List;

public class Story {
    private int id;
    private String content;
    private List<Comment> comments;
    public Story(String content) {

        this.content = content;
    }

    public Story(String content, List<Comment> comments){
        this.comments = comments;
        this.content = content;
    }

    public Story(int id, String content, List<Comment> comments){
        this.id = id;
        this.comments = comments;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Story{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", comments=" + comments +
                '}';
    }
}
