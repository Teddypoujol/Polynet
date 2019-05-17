package com.polytech.Polynet.repository;

import com.polytech.Polynet.business.Comment;
import com.polytech.Polynet.business.Story;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface StoryRepository {
    List<Story> findAll();

    void save(Story story);

    void saveCom(Comment com);
    List<Comment> findAllComment(int idS);



    void delete(Story story);
}
