package com.polytech.Polynet.application;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStoryRepository implements StoryRepository {
    private List<Story> stories = new ArrayList<Story>();
    private List<Comment> comments = new ArrayList<Comment>();
    public List<Story> findAll() {
        return stories;
    }

    public void save(Story story) {
        stories.add(story);
    }

    @Override
    public void saveCom(Comment com) {

    }

    @Override
    public List<Comment> findAllComment(int idS) {
        return comments;
    }
}
