package IO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

//Used to check whether given file (or set of files) exists
public class ImageChecker
{
    public boolean ChkFileExist(String filePath)
    {
        Path path = Paths.get(filePath);

        return (Files.exists(path) && Files.isRegularFile(path));
    }
    public boolean ChkFileSequenceExist(String[] paths)
    {
        for (String str:paths)
        {

        }
    }
    //Isolates the name of the image file from the path
    private String isolateFileName(String path)
    {
        //We want index of the first character after the last line separator
        int nameStartIndex = 1 + path.lastIndexOf(System.lineSeparator());
        String fileName = path.substring((nameStartIndex));

        return fileName;
    }
    //Extracts the number of the file from its name.
    private int extractNumber(String fileName)
    {
        //TODO
        Pattern patt = new Pattern("(\\D*\\d*)");
    }
    //Increments the number at the end of the image file by 1.
    private String incrementName(String name)
    {

    }
}
