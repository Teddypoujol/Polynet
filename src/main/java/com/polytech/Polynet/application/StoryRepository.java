package com.polytech.Polynet.application;

import java.util.List;
import java.sql.SQLException;

public interface StoryRepository {

    void save(Story content);

    List<Story> findAll();
}
