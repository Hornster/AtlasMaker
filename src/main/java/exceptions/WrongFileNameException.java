package exceptions;

import com.sun.org.apache.bcel.internal.generic.ExceptionThrower;
/**
 * Exception that should be thrown when the name given by the user
 * did not have any number in it.*/
public class WrongFileNameException extends Exception
{
    public WrongFileNameException(MessageID msgID, String fileName)
    {
        super(msgID + fileName);
    }
}
