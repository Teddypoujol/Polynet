package com.polytech.Polynet.repository;

import com.polytech.Polynet.business.Comment;
import com.polytech.Polynet.business.Story;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcStoryRepository implements StoryRepository {


    private DataSource dataSource;

    public JdbcStoryRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Story> findAll() {

        List<Story> results = new ArrayList();
        try {
            //GET CONNECTION
            Connection connection = dataSource.getConnection();
            String sql = "SELECT * FROM story";
            //EXECUTE QUERY
            ResultSet resultSet = connection.createStatement().executeQuery(sql);

            // FOR EACH ROW IN DATA BASE
            while (resultSet.next()) {
                // I GET THE CONTENT COLUMN
                int id = resultSet.getInt("id");
                String content = resultSet.getString("CONTENT");
                List<Comment> comments = findAllComment(id);
                Story story = new Story(id,content, comments);
                System.out.println(story);
                // I ADD THE STORY TO THE RESULT
                results.add(story);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return results;
    }

    @Override
    public void save(Story story) {
        try {
            //GET CONNECTION
            Connection connection = dataSource.getConnection();
            String sql = "INSERT INTO story(CONTENT) VALUES('" + story.getContent() + "')";
            //EXECUTE QUERY
            connection.createStatement().execute(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<Comment> findAllComment(int idS) {

        List<Comment> results = new ArrayList();
        try {
            //GET CONNECTION
            Connection connection = dataSource.getConnection();
            String sql = "SELECT * FROM comment WHERE  id_story =" +idS;
            //EXECUTE QUERY
            ResultSet resultSet = connection.createStatement().executeQuery(sql);


            // FOR EACH ROW IN DATA BASE
            while (resultSet.next()) {
                // I GET THE CONTENT COLUMN

                String com = resultSet.getString("COMMENT");
                int id = resultSet.getInt("ID_STORY");
                // I ADD THE STORY TO THE RESULT
                results.add(new Comment(id,com));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return results;
    }

    @Override
    public void saveCom(Comment com) {
        try {
            //GET CONNECTION
            Connection connection = dataSource.getConnection();
            String sql = "INSERT INTO comment(id_story, comment) VALUES(" + com.getId_story() + ",'" + com.getComment() + "')";
            //EXECUTE QUERY
            connection.createStatement().execute(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
