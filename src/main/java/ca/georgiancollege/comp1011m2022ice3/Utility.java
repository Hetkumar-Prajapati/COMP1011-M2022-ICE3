package ca.georgiancollege.comp1011m2022ice3;


import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

public class Utility
{

    // step 1: create a private static instance member
    private static Utility m_instance = null;

    // step 2: make default constructor private.
    private Utility() {}

    // step 3: create a public static access methoad taht returns an instrance of the classs.
    public static Utility Instance()
    {
//    step 4: insure that instance member variable is not been instanciated (is null)
        if (m_instance == null)
        {
//        step 5: craete instance of the classs n save  reference in private variable
            m_instance = new Utility();
        }
//    step 6 :  return an instance
        return m_instance;
    }


    /*
     * This method returns the distance from start to end
     * @param start = start vector2D
     * @param end = ending vector2D
     * */
    public float distance(Vector2D start, Vector2D end)
    {
        float diffXs = end.getX() - start.getX();
        float diffYs = end.getY() - start.getY();
        return (float) Math.sqrt(diffXs * diffXs + diffYs * diffYs);
    }

    public float distance(float x1, float y1, float x2, float y2)
    {
        float diffXs = x2 - x1;
        float diffYs = y2 - y1;
        return (float) Math.sqrt(diffXs * diffXs + diffYs * diffYs);
    }

    public void ConfigureVector2DSpinner(Spinner<Double> spinner , double min, double max, double default_value , double increment_value )
    {
        // configure each spinner
        // step 1: define a spinner value factory
        SpinnerValueFactory<Double> spinnerValueFactory =new SpinnerValueFactory.DoubleSpinnerValueFactory(min,max, default_value, increment_value);

        // step 2: set the value factory
        spinner.setValueFactory(spinnerValueFactory);

        //step 3: get access to the spinner textfield
        TextField spinnerTextField = spinner.getEditor();

        //step 4: create event listeneer

        spinnerTextField.textProperty().addListener((observable , oldValue , newValue )->
        {
            try
            {
                Float.parseFloat(newValue);
            }
            catch (Exception e)
            {
                spinnerTextField.setText(oldValue);
            }
        });
    }
}

