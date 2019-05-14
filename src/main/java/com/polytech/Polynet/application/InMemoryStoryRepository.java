package com.polytech.Polynet.application;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStoryRepository  implements StoryRepository{
    private List<Story> stories = new ArrayList<Story>();
    public InMemoryStoryRepository(){
    }

    public void save(Story story) {
        stories.add(story);
    }

    public List<Story> findAll() {
        return stories;
    }
}
