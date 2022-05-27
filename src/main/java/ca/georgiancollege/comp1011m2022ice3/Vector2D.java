package ca.georgiancollege.comp1011m2022ice3;

public class Vector2D
{

    //Private instance members
    private float m_x;
    private float m_y;
    //constructors

    public Vector2D()
    {
        m_x = 0.0f;
        m_y = 0.0f;
    }

    /**
     * @param x
     * @param y
     */
    public Vector2D(float x, float y)
    {
        m_x = x;
        m_y = y;
    }

    //public properties (Getters ang Setters)


    public float getY()
    {
        return m_y;
    }

    public void setY(float new_y)
    {
        m_y = new_y;
    }

    public float getX()
    {
        return m_x;
    }

    public void setX(float new_x)
    {
        m_x = new_x;
    }

    //Public methods

    /**
     * This method adds a Vector2D to this Vector2D
     *
     * @param vector
     * @return
     */
    public Vector2D add(Vector2D vector)
    {
        m_x += vector.getX();
        m_y += vector.getY();
        return this;
    }

    /**
     * @param vector
     * @return
     */
    public Vector2D subtract(Vector2D vector)
    {
        m_x = vector.getX() - m_x;
        m_y = vector.getY() - m_y;
        return this;
    }

    // Overridden Methods
    @Override
    public String toString() {
        return ("(" + getX() + ", " + getY() + ")");
    }
}

