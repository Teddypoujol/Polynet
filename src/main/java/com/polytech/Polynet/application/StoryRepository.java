package com.polytech.Polynet.application;

import java.util.List;

public interface StoryRepository {
    List<Story> findAll();

    void save(Story story);

    void saveCom(Comment com);
    List<Comment> findAllComment(int idS);
}
