package com.polytech.Polynet.repository;

import com.polytech.Polynet.business.Comment;
import com.polytech.Polynet.business.Story;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;


@Transactional
public class JpaStoryRepository implements  StoryRepository{

    @PersistenceContext
    EntityManager em;


    public String requeteFindStory = "SELECT s from Story s";

    @Override
    public List<Story> findAll() {
        Query query = em.createQuery(requeteFindStory);
        return query.getResultList();
    }

    @Override
    public void save(Story story) {
        em.persist(story);
    }

    @Override
    public void saveCom(Comment com) {
        em.persist(com);
    }

    @Override
    public List<Comment> findAllComment(int idS) {
        return null;
    }
}
