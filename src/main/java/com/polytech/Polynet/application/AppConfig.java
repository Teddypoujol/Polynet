package com.polytech.Polynet.application;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

    @Bean
    StoryRepository storyRepository() {
        return new JdbcStoryRepository(datasource());
    }

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
    FeedService feedService(){
        return new FeedServiceImpl(storyRepository());
    }
    @Bean
    PublicationService publicationService() {
        return new PublicationServiceImpl(storyRepository());
    }
}
