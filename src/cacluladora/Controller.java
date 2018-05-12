package cacluladora;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.awt.event.ActionEvent;


public class Controller {

    @FXML
    TextArea resultsScreen;
    @FXML
    Button buttonZero;
    @FXML
    Button buttonOne;
    @FXML
    Button button2;
    @FXML
    Button buttonThree;
    @FXML
    Button buttonFour;
    @FXML
    Button buttonFive;
    @FXML
    Button buttonSix;
    @FXML
    Button buttonSeven;
    @FXML
    Button buttonEight;
    @FXML
    Button buttonNine;
    @FXML
    Button buttonClear;
    @FXML
    Button buttonMultiply;
    @FXML
    Button buttonEquals;
    @FXML
    Button buttonDivide;

    @FXML
    private void enterZero(ActionEvent e){

    }
    @FXML
    private void enterOne(ActionEvent e){


    }
    @FXML
    private void enterTwo(ActionEvent e){

    }
    @FXML
    private void enterThree(ActionEvent e){

    }
    @FXML
    private void enterFour(ActionEvent e){

    }
    @FXML
    private void enterFive(ActionEvent e){

    }
    @FXML
    private void enterSix(ActionEvent e){

    }
    @FXML
    private void enterSeven(ActionEvent e){

    }
    @FXML
    private void enterEight(ActionEvent e){

    }
    @FXML
    private void enterNine(ActionEvent e){

    }
    @FXML
    private void enterMultiply(ActionEvent e){

    }
    @FXML
    private void enterDivide(ActionEvent e){

    }







    @FXML
    private void calculate(ActionEvent event){

        int preCalc = Integer.parseInt(resultsScreen.getText());
        resultsScreen.clear();





    }







}
