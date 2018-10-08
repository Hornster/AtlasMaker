package IO;

import containers.Vector2i;
import exceptions.MessageID;
import exceptions.WrongFileNameException;
import sun.plugin2.message.Message;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

//Used to check whether given file (or set of files) exists
public class ImageChecker
{
    ///**Position of the number in the last processed file name.*/
    //private Vector2i lastNumberPosition;
    /**Returns TRUE if file under given path exists.*/
    public boolean ChkFileExist(String filePath)
    {
        Path path = Paths.get(filePath);

        return (Files.exists(path) && Files.isRegularFile(path));
    }
    public boolean ChkFileSequenceExist(String[] paths)
    {
        for (String str:paths)
        {
            if(!ChkFileExist(str))
                return false;
        }
        return true;
    }
    /**Isolates the name of the image file from the path.*/
    private String isolateFileName(String path)
    {
        //We want index of the first character after the last line separator
        int nameStartIndex = 1 + path.lastIndexOf(System.lineSeparator());
        return path.substring((nameStartIndex));
    }
    /**Searches for the number in the name of the file.
    Returns Vector2i: x is the begin index of the number, y - the end index.*/
    private Vector2i findNumberPosition(String fileName) throws WrongFileNameException
    {
        int endIndex = fileName.length()-1;
        int beginIndex= endIndex;
        //Seek for the end of the number (exclusive)
        while(endIndex >=0)
        {
            if(Character.isDigit(fileName.charAt(endIndex)))
            {
                break;
            }
            endIndex--;
        }

        //There's no number in the name at all - shout it out loud!
        if(endIndex < 0)
            throw new WrongFileNameException(MessageID.WRONGFILENAME, fileName);

        endIndex++; //Because the end index is exclusive
        beginIndex = endIndex;
        //Seek for the beginning of the number (inclusive)
        while(beginIndex >0)
        {
            if(!Character.isDigit(fileName.charAt(beginIndex-1)))
            {
                break;
            }
            beginIndex--;
        }
        //Return the result.
        return new Vector2i(beginIndex, endIndex);
    }
    /**Counts the zero digits before any non-zero digits.*/
    private int countPrefixZeros(String number)
    {
        int amount = 0;

        for(int i = 0; i < number.length(); i++)
        {
            if(number.charAt(i) == '0')
            {
                amount++;
            }
            else
                break;
        }

        return amount;
    }
    /**Increments the number at the end of the image file by 1.*/
    private String incrementNumber(String number)//should not be any problems in here. As long as stays private.
    {
        int zerosCount = countPrefixZeros(number);
        int meaningDigitCount = number.length()-zerosCount;

        String additionalZeros = new String();

        //Increment the number itself
        Integer newNumber = Integer.parseInt(number);
        newNumber++;

        String newNumberString = newNumber.toString();

        //If there was a carry resulting in switching a zero from prefix to one or whole number is composed of zeros...
        if(newNumberString.length() > meaningDigitCount || meaningDigitCount == 0)
        {
            //...add one less zero to the prefix in the end.
            zerosCount--;
        }

        //Create the prefix zeros, if any are present
        while(zerosCount > 0)
        {
            additionalZeros += '0';
            zerosCount--;
        }

        //concat the number with prefix zeros and return it
        return additionalZeros + newNumber.toString();
    }
    /**Applies newly created number to the old file name, replacing the old number.*/
    private String applyNewNumber(String fileName, String newNumber, Vector2i position)
    {
        String prefix = fileName.substring(0, position.x);
        String suffix = fileName.substring(position.y);

        return prefix + newNumber + suffix;
    }
}
