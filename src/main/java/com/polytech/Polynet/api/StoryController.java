package com.polytech.Polynet.api;

import com.polytech.Polynet.business.Comment;
import com.polytech.Polynet.business.FeedService;
import com.polytech.Polynet.business.PublicationService;
import com.polytech.Polynet.business.Story;
import com.polytech.Polynet.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class StoryController {
    @Autowired
    PublicationService publicationService;
    @Autowired
    FeedService feedService;

    @PostMapping("/story")
    public void share(@RequestBody String content){
        publicationService.share(new Story(content));
    }

    @PostMapping("/com")
    public void shareCom(@RequestBody Comment com){
        publicationService.shareCom(com);
    }

    @GetMapping("/feed")
    public List<Story> feed(){
        return feedService.fetchAll();
    }

    @DeleteMapping("/story/{id}")
    public void deleteStory(@PathVariable(value = "id") int id_story) {


    }


}
