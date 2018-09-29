import GUI.GUIController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AtlasMakerGUI extends Application {
    //Stores the names of currently loaded image sets, count of pictures in each set.
    GUIController guiController;
    public static void main(String[] args) throws Exception
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Initialize window
        Parent root = null;
        primaryStage.setTitle("AtlasMaker");
        try
        {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("GUI/gui.fxml"));
            //Perform controller initialization
            //TODO
            //-przystosowac reszte kodu. Wsio powyzej pasuje.
            guiController = new GUIController();
            guiController.initialize();

            Scene scene = new Scene(guiController.getRoot());
            primaryStage.setScene(scene);
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
            System.exit(-1);
        }

        //Initialize table view

        primaryStage.show();

    }
}
