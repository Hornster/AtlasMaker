package Utils;

import Utils.FileUtils;
import javafx.stage.FileChooser;

import java.util.HashMap;
import java.util.Map;

/**Filter class for image fileChooser in the program.*/
public class GraphicFilesFilterFactory implements IFilesFilterFactory
{
    /**All file names allowed.*/
    private final String universalPrefix= "*.";
    /**Array of extensions supported by this program.*/
    static final private Map<String, String> allowedExtensions;
    //Contains data for each filter.
    static {
        allowedExtensions = new HashMap<String, String>();
        allowedExtensions.put("jpg", "Graphics file (*.jpg)");
        allowedExtensions.put("jpeg", "Graphics file (*.jpeg)");
        allowedExtensions.put("png", "Portable Network Graphics File (*.png)");
        allowedExtensions.put("tiff", "Tagged Image File Format (*.tiff)");
        allowedExtensions.put("tif", "Tagged Image File Format (*.tif)");
    }

    /**Creates an extensionFilter for JavaFX FileChooser.
     * @param ext The extension which the ExtensionFilter shall be created for.
     * @return Returns ExtensionFilter object for passed extension. If unable to recognize - returns null.*/
    @Override
    public FileChooser.ExtensionFilter CreateFXExtFilter(String ext) {

        if(!isKeyPresent(ext)) {
            return null;
        }

        return new FileChooser.ExtensionFilter(allowedExtensions.get(ext), universalPrefix+ext);
    }
    /**Checks if given extension is present.
     * @param key The checked extension.
     * @return True if key is recognized, false otherwise.*/
    private boolean isKeyPresent(String key)
    {
        return allowedExtensions.containsKey(key);
    }
}
