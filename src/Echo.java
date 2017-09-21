
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import javax.swing.*;
import java.util.Optional;

// import java.util.Scanner;
public class Echo extends Application {
   @Override
    public void start(Stage primaryStage) throws Exception {

        String height = JOptionPane.showInputDialog("Enter your height");



       TextInputDialog textInputDialog = new TextInputDialog("140.4");
       textInputDialog.setTitle("Metrics Converter");
       textInputDialog.setHeaderText("Centimeter to feet and Inches converter");
       textInputDialog.setContentText("Enter your height in cm");
       Optional<String> result = textInputDialog.showAndWait();


        double heightInCm = Double.parseDouble(result.get());
        double heightInInches = heightInCm*0.39;
        int heightInFeet = (int) (heightInInches/12);
        int RemainderHeightInInches = (int) (heightInInches%12);


        JOptionPane.showMessageDialog(null,"your height is" +heightInFeet + "feet" + RemainderHeightInInches + "inches");



        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Height Converter");
        alert.setHeaderText("your height is");
        alert.setContentText(heightInFeet + "feet" + RemainderHeightInInches +"inches" );
        alert.setX(500);
        alert.setY(550);
        alert.showAndWait();
    }
}







