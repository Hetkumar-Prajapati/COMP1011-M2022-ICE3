package ca.georgiancollege.comp1011m2022ice3;

public class Vector2D
{

    //Private instance members



    private float m_id;
    private float m_x;
    private float m_y;
    //constructors

    public Vector2D()
    {
        m_id = -1;
        setX(0.0f);
        setY(0.0f);
        m_x = 0.0f;
        m_y = 0.0f;
    }
    public Vector2D(int id, float x, float y)
    {
        this(x,y);
        setID(id);
    }
    /**
     * @param x
     * @param y
     */
    public Vector2D(float x, float y)
    {
        m_id = -1;
        setX(x);
        setY(y);
    }

    //public properties (Getters ang Setters)

    public float getID() {
        return m_id;
    }

    public void setID(float id) {
        if(id<0)
        {
            throw new IllegalArgumentException("Vector id must be greater than zero");
        }
        else
        {
            m_id = id;
        }
    }
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

