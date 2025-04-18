/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project1javafx;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;

/**
 *
 * @author necromonta
 */


public class Main extends Application {
    public static void main(String[] args) {
        // Launches the JavaFX application
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        UserInterface ui = new UserInterface(primaryStage);
        ui.createUI();
    }
}

