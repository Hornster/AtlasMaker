package GUI;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class GUIController
{
    @FXML
    private Pane pane;


    public void initialize() throws IOException
    {




    }

    public Pane getRoot()
    {
        return pane;
    }
}
