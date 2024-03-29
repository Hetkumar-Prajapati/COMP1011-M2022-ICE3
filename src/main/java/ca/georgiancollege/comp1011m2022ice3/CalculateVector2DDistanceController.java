package ca.georgiancollege.comp1011m2022ice3;



import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculateVector2DDistanceController implements Initializable
{

    @FXML
    private TextField ResultTextField;


    @FXML
    private Spinner<Double>  X1Spinner;

    @FXML
    private Spinner<Double> X2Spinner;

    @FXML
    private Spinner<Double> Y1Spinner;

    @FXML
    private Spinner<Double> Y2Spinner;

    @FXML
    void OnCalculateButtonClicked(ActionEvent event)
    {
        //Setup variables
        try {
            float x1 = X1Spinner.getValue().floatValue();
            float y1 = Y1Spinner.getValue().floatValue();
            float x2 = X2Spinner.getValue().floatValue();
            float y2 = Y2Spinner.getValue().floatValue();

            Vector2D point1 = new Vector2D(x1, y1);
            int insertPoint1 =DBManager.Instance().insertVector2D(point1);
            System.out.println(insertPoint1);

            Vector2D point2 = new Vector2D(x2, y2);
            int insertPoint2 =DBManager.Instance().insertVector2D(point2);
            System.out.println(insertPoint2);

            System.out.println("Point 1: "+ point1);
            System.out.println("Point 2: "+ point2);

            float distance = Utility.Instance().distance(point1, point2);
            ResultTextField.setText(String.valueOf(distance));
        }
        catch (Exception e) {
            ResultTextField.setText("Please Enter Valid Numbers");
        }

    }

    @FXML
    void OnResetButtonClicked(ActionEvent event)
    {
        X1Spinner.getValueFactory().setValue(0.0);
        Y1Spinner.getValueFactory().setValue(0.0);
        X2Spinner.getValueFactory().setValue(0.0);
        Y2Spinner.getValueFactory().setValue(0.0);

        ResultTextField.clear();

        X1Spinner.requestFocus();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        Utility.Instance().ConfigureVector2DSpinner(X1Spinner, -1000.0,1000.0,0.0,5.0);
        Utility.Instance().ConfigureVector2DSpinner(X2Spinner, -1000.0,1000.0,0.0,5.0);
        Utility.Instance().ConfigureVector2DSpinner(Y1Spinner, -1000.0,1000.0,0.0,5.0);
        Utility.Instance().ConfigureVector2DSpinner(Y2Spinner, -1000.0,1000.0,0.0,5.0);
    }
}








        /*
        // configure each spinner
         *
        // step 1: define a spinner value factory
        SpinnerValueFactory<Double> x1SpinnerValueFactory =new SpinnerValueFactory.DoubleSpinnerValueFactory(-1000.0,1000.0, 0.0, 5.0);

        // step 2: set the value factory
        X1Spinner.setValueFactory(x1SpinnerValueFactory);

        //step 3: get access to the spinner textfield
        TextField x1SpinnerTextField = X1Spinner.getEditor();

        //step 4: create event listeneer

        x1SpinnerTextField.textProperty().addListener((observable , oldValue , newValue )->
        {
            try
            {
                Float.parseFloat(newValue);
            }
            catch (Exception e)
            {
                x1SpinnerTextField.setText(oldValue);
            }
        });
        */
        /*
         x1SpinnerTextField.textProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> observableValue, String oldValue, String newValue)
            {
                try
                {
                    Float.parseFloat(newValue);
                }
                catch (Exception e)
                {
                    x1SpinnerTextField.setText(oldValue);
                }
            }

         */

