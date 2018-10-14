package GUI;

import com.sun.istack.internal.NotNull;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import javax.swing.event.HyperlinkEvent;
import java.io.IOException;
/**A singleton created by the GUI (javafx)*/
public class GUIController
{
    /**The reference to created instance of this singleton*/
    private static GUIController instance;
    @FXML
    private GridPane root;
    @FXML
    private Button sourceButton;

    //if the gui.fxml throws exception - change  this to public
    GUIController()
    {
        GUIController.instance = this;
    }
    /**Returns the instance of the controller. Does not initialize it - this shall be done by the FXML itself.*/
    public static GUIController getInstance()
    {
        return instance;
    }
    /**Called to hook an event handler to this button.*/
    public void SetEventHandlerSrcButton(@NotNull EventHandler<ActionEvent> handler)
    {
        sourceButton.setOnAction(handler);
    }
    public GridPane getRoot()
    {
        return root;
    }
}
//TODO
//Create a class that will be implementing the EventHandler interface.
//The class will implement "handler" method. This method, when called,
//will call another class (view type) to open a file browser. The class
//will return a File type (which can be null if the file was not specified/found.
//Then, begin the process of looking for next files from that group (instantiate
//ImageSet obj), find and count other images in the sequence. When finished without
//problems - add the created set to list of sets and make it show in the
//GUI. Easy. ;-;