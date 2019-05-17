package com.polytech.Polynet.config;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.polytech.Polynet.business.*;
import com.polytech.Polynet.repository.JdbcStoryRepository;
import com.polytech.Polynet.repository.JpaStoryRepository;
import com.polytech.Polynet.repository.StoryRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

   /*
    @Bean
     StoryRepository storyRepository() {
        return new JdbcStoryRepository(datasource());
    }
    */


    @Bean
    DataSource datasource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost:3307/polynet");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        dataSource.setDatabaseName("polynet");
        return dataSource;
    }

    @Bean
    StoryRepository storyRepository() {
        return new JpaStoryRepository();
    }

    @Bean
    FeedService feedService(){
        return new FeedServiceImpl(storyRepository());
    }
    @Bean
    PublicationService publicationService() {
        return new PublicationServiceImpl(storyRepository());
    }
}
