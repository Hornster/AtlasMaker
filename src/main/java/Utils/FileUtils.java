package Utils;

import java.io.File;

/**Contains allowed extensions and methods for checking the file names.*/
public class FileUtils
{
    /**Array of extensions supported by this program.*/
    public final static String[] allowedExtensions = {"jpg", "jpeg", "png", "tiff", "tif"};

    /**Retrieves extension from a file.*/
    public static String getExtension(File file)
    {
        String fileName = file.getName();
        int i = fileName.lastIndexOf('.');

        String extension = fileName.substring(i);
        extension = extension.toLowerCase();

        return extension;
    }
    /**Checks if given extension is allowed by the program. Returns true if so. False otherwise.*/
    public static boolean chkExtension(String extension)
    {
        for (String ext: allowedExtensions)
        {
            if(ext.equals(extension))
                return true;
        }

        return false;
    }
}
