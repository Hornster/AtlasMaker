package GUI;

import Utils.GraphicFilesFilterFactory;
import Utils.IFilesFilterFactory;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

/**Responsible for managing the FileChooser that is used to determine
 * source image sequence.*/
public class FileSelectorManager
{
    /**Extensions of images supported by the program.*/
    static private final String[] requiredExtensions={"jpg", "jpeg","png", "tiff", "tif"};
    /**Initializes the FileChooser, then throws it at the user.
     * @param owner The owner window of the fileChooser.
     * @return File object containing data about selected file. Null if no file selected.*/
    public File promptForImgSequence(Window owner)
    {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(IniFilters());

        return fileChooser.showOpenDialog(owner);
    }
    /**Initializes filters for the FileChooser. Uses @requiredExtensions array as reference.
     * @return LinkedList containing filters for the FileChooser. */
    private List<FileChooser.ExtensionFilter> IniFilters()
    {
        LinkedList<FileChooser.ExtensionFilter> filters = new LinkedList<>();
        IFilesFilterFactory filterFactory = new GraphicFilesFilterFactory();

        for(String ext : requiredExtensions) {
            filters.add(filterFactory.CreateFXExtFilter(ext));
        }

        return filters;
    }

}
