package com.polytech.Polynet.application;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AppConfig.class);
        StoryRepository storyRepository = context.getBean(StoryRepository.class);
        storyRepository.save(new Story("Je eaeaea"));
        storyRepository.save(new Story("il eaea beau"));
        storyRepository.save(new Story("eaeaea"));
        storyRepository.save(new Story("aeaea"));

        List<Story> stories = storyRepository.findAll();
        for (Story story : stories) {
            System.out.println(story.toString());
        }
    }
}
