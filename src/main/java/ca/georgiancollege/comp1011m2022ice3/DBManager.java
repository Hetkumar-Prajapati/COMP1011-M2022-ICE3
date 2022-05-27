package ca.georgiancollege.comp1011m2022ice3;

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

    public int insertVector2D(Vector2D vector2d)
    {
        int vectorID =-1;
        return vectorID;
    }

}
