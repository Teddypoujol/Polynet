package com.polytech.Polynet.business;

import com.polytech.Polynet.repository.StoryRepository;

import java.util.List;

public class FeedServiceImpl implements FeedService {
    private StoryRepository storyRepository;

    public FeedServiceImpl(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    public List<Story> fetchAll() {

        return storyRepository.findAll();
    }


}
