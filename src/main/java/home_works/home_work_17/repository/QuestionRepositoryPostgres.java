package home_works.home_work_17.repository;

import home_works.home_work_17.model.Question;
import home_works.home_work_17.repository.dao.QuestionRepository;
import home_works.home_work_17.service.ConnectionService;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuestionRepositoryPostgres implements QuestionRepository {

    private final Connection connection;

    private static final String SELECT_All = "SELECT * FROM public.question";

    private static final String GET =
            """
                    SELECT * FROM public.question
                    WHERE id = ?
                    """;
    private static final String SAVE =
            """
                    INSERT INTO public.question(text)
                    VALUES (?)
                    """;
    private static final String REMOVE =
            """
                    DELETE FROM public.question
                    WHERE id = ?
                    """;
    private static final String UPDATE =
            """
                    UPDATE public.question
                    SET text = ?, topic_id = ?
                    WHERE  id = ?
                    """;

    public QuestionRepositoryPostgres() {
        try {
            this.connection = ConnectionService.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Question> getAll() {

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_All);
            List<Question> questions = new ArrayList<>();
            while (resultSet.next()) {
                Question build = Question.builder()
                        .text(resultSet.getString(2))
                        .id(resultSet.getInt(1))
                        .topic_id(resultSet.getInt(3))
                        .build();
                questions.add(build);
            }
            return questions;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean add(Question question) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE);
            preparedStatement.setString(1, question.getText());
            return preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Question get(int id) {

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(GET);
            resultSet.next();
            return Question.builder()
                    .text(resultSet.getString("text"))
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
    public int update(Question question) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, question.getText());
            preparedStatement.setInt(2, question.getTopic_id());
            preparedStatement.setInt(3, question.getId());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

