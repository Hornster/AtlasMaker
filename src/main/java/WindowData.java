
import containers.Vector2i;

//Singleton. Stores data about the window and its contents.
public class WindowData
{
    private Vector2i windowSize;
    //Private constructor. Called once. Sets default values.
    private WindowData()
    {
        windowSize.x = 800;
        windowSize.y = 600;
    }
}
//TODO
//-load data from file and save it to the file.
//  -if the file is corrupt - recreate it with default values from the code.