package home_works.home_work_17.repository;

import home_works.home_work_17.model.Topic;
import home_works.home_work_17.repository.dao.TopicRepository;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TopicRepositoryPostgres implements TopicRepository {

    private final Connection connection;

    private static final String SELECT_All = "SELECT * FROM public.topic";

    private static final String GET =
            """
                    SELECT * FROM public.topic
                    WHERE id = ?
                    """;
    private static final String SAVE =
            """
                    INSERT INTO public.topic(name)
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
                    SET name = ?
                    WHERE  id = ?
                    """;

    public TopicRepositoryPostgres(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Topic> getAll() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_All);
            List<Topic> topics = new ArrayList<>();
            while (resultSet.next()) {
                Topic build = Topic.builder()
                        .id(resultSet.getInt(1))
                        .name(resultSet.getString(2))
                        .build();
                topics.add(build);
            }
            return topics;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean add(Topic topic) {
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
            ResultSet resultSet = statement.executeQuery(GET);
            resultSet.next();

            return Topic.builder()
                    .name(resultSet.getString("name"))
                    .id(resultSet.getInt("id"))
                    .build();

        } catch (SQLException e) {
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
