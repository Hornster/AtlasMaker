package exceptions;
/**
 * Enum for selection of */
public enum MessageID
{
    WRONGFILENAME(0, "The name of the file did not have any number in it! Name: ");

    private final int myValue;
    private final String myMessage;

    MessageID(int value, String message)
    {
        myValue = value;
        myMessage = message;
    }
}
