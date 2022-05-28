package ca.georgiancollege.comp1011m2022ice3;

import java.sql.*;

public class DBManager
{
    //=================================================================
    private static DBManager m_instance = null;
    private DBManager() {}

    public static DBManager Instance()
    {
        if (m_instance == null)
        {
            m_instance = new DBManager();
        }
        return m_instance;
    }
    //=================================================================

    private String m_user = "root";
    private String m_password = "123456";
    private String m_connectURl = "jdbc:mysql://loacalhost:3306/comp1011m2022";

    public int insertVector2D(Vector2D vector2d) throws SQLException {
        int vectorID =-1;
        ResultSet resultSet = null;

        // create querry
        String sql = "INSERT INTO vectors(X,Y) VALUES (?,?);";

        try (Connection connection = DriverManager.getConnection(m_connectURl, m_user, m_password);
             PreparedStatement statement= connection.prepareStatement(sql, new String[]{"vectorID"});
            )
        {
            statement.setFloat(1, vector2d.getX());
            statement.setFloat(2, vector2d.getY());

            resultSet = statement.getGeneratedKeys();
            while(resultSet.next())
            {
                vectorID = resultSet.getInt(1);
            }
        }
        catch (Exception e)
        {

        }
        finally {
            if(resultSet!=null)
            {
                resultSet.close();
            }
        }
        return vectorID;
    }

}
