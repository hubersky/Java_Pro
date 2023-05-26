package home_works.home_work_17.repository;

import home_works.home_work_17.model.Topic;
import home_works.home_work_17.repository.dao.TopicRepository;
import java.sql.*;

public class TopicRepositoryImpl implements TopicRepository {

    private final Connection connection;
    private static final String SELECT_All= "Select * from topic where id = ?";
    private static final String SAVE =
            """
                    INSERT INTO public.topic(
                    name)
                    VALUES (?)
            """;
    private static final String REMOVE =
            """
                    DELETE FROM public.topic
                    WHERE id = ?
                                
            """;
    private static final String UPDATE =
            """
                    UPDATE public.topic
                    SET name=?
                    WHERE  id = ?;
                                        
            """;

    public TopicRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean save(Topic topic) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE);
            preparedStatement.setString(1, topic.getName());
            return preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Topic get(int id) {
        try {
            Statement statement = this.connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_All + id);
            resultSet.next();

            return Topic.builder()
                    .name(resultSet.getString("name"))
                    .id(resultSet.getInt("id"))
                    .build();

        } catch (SQLException e) {
            try {
                connection.close();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean remove(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(REMOVE);
            preparedStatement.setInt(1, id);
            return preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int update(Topic topic) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, topic.getName());
            preparedStatement.setInt(2, topic.getId());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
