package com.polytech.Polynet.api;

import com.polytech.Polynet.business.FeedService;
import com.polytech.Polynet.business.PublicationService;
import com.polytech.Polynet.business.Story;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {
    @Autowired
    PublicationService publicationService;
    @Autowired
    FeedService feedService;

    @PostMapping("/users")
    public void register(@RequestBody String content){

    }

}
