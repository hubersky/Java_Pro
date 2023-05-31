package home_works.home_work_17.repository;

import home_works.home_work_17.model.Question;
import home_works.home_work_17.repository.dao.QuestionRepository;
import java.sql.*;

public class QuestionRepositoryImpl implements QuestionRepository {

    private final Connection connection;
    private static final String SELECT_All = "Select * from question where id = ?";
    private static final String SAVE =
                    """
                            INSERT INTO public.question(
                            text)
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
                            SET text=?
                            WHERE  id = ?;
                                                
                    """;

    public QuestionRepositoryImpl() {
        try {
            this.connection = ConnectionData.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean save(Question question) {
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
            Statement statement = this.connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_All + id);
            resultSet.next();

            return Question.builder()
                    .text(resultSet.getString("text"))
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
    public int update(Question question) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, question.getText());
            preparedStatement.setInt(2, question.getId());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

