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
}
