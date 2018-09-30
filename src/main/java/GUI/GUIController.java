package GUI;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class GUIController
{
    @FXML
    private GridPane root;


    public void initialize(GridPane root) throws IOException
    {

        this.root = root;


    }

    public GridPane getRoot()
    {
        return root;
    }
}
