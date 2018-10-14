package Utils;

import javafx.stage.FileChooser;
/***/
public interface IFilesFilterFactory
{
    /**Returns created filter for JavaFX fileChooser. Returns null if unable to recognize extension.
     * @param ext The extension for which the filter shall be created.*/
    FileChooser.ExtensionFilter CreateFXExtFilter(String ext);
}
