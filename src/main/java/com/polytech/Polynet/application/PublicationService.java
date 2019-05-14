package com.polytech.Polynet.application;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
public class PublicationService {

    public void share(Story s){

    }

    public PublicationService(StoryRepository s) {
    }

    public void should_save_story() {

        //given
        StoryRepository storyRepository = new InMemoryStoryRepository();
        PublicationService publicationService = new PublicationService(storyRepository);
        Story story1 = new Story("Hello OM");
        Story story2 = new Story("Hello ");
        //when
        publicationService.share(story1);
        publicationService.share(story2);

        //then
        List stories = storyRepository.findAll();
        Assert.assertEquals(1, stories.size());
        Assert.assertEquals(Arrays.asList(story1,story2), stories);
    }


}
