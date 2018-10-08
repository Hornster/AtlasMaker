package IO;

import containers.Vector2i;
import org.junit.Assert;
import org.junit.Test;

public class ImageCheckerTest {
    //DATA
    String fileName1 = new String("asd3000.jpg");
    String numberInName1 = new String("3000");
    String numberInNameAfterIncrement = new String("3001");
    Vector2i trueResult1 = new Vector2i(3, 7);
    String fileName2 = new String("asd3000asfda.jpg");
    Vector2i trueResult2 = new Vector2i(3, 7);
    String fileName3 = new String("asd3000");
    Vector2i trueResult3 = new Vector2i(3, 7);
    String fileName4 = new String("3000");
    Vector2i trueResult4 = new Vector2i(0, 4);
    String fileName5 = new String("3000asdd.jpg");
    Vector2i trueResult5 = new Vector2i(0, 4);
    String fileName6 = new String("hgfhfadf.jpg");

    ImageChecker imgChecker = new ImageChecker();

    @Test
    public void incrementNumber()
    {
        Assert.assertEquals("009871", imgChecker.incrementNumber("009870"));
        Assert.assertEquals("9871", imgChecker.incrementNumber("9870"));
        Assert.assertEquals("0090871", imgChecker.incrementNumber("0090870"));
        Assert.assertEquals("0000001", imgChecker.incrementNumber("0000000"));
        Assert.assertEquals("1", imgChecker.incrementNumber("0"));
    }

    @Test
    public void applyNewNumber()
    {
        Assert.assertEquals("asd3001.jpg", imgChecker.applyNewNumber(fileName1, "3001", trueResult1));
        Assert.assertEquals("asd3001asfda.jpg", imgChecker.applyNewNumber(fileName2, "3001", trueResult2));
        Assert.assertEquals("asd3001", imgChecker.applyNewNumber(fileName3, "3001", trueResult3));
        Assert.assertEquals("3001", imgChecker.applyNewNumber(fileName4, "3001", trueResult4));
        Assert.assertEquals("3001asdd.jpg", imgChecker.applyNewNumber(fileName5, "3001", trueResult5));
    }

    @Test
    public void countPrefixZeros()
    {
        Assert.assertEquals(5, imgChecker.countPrefixZeros("00000"));
        Assert.assertEquals(2, imgChecker.countPrefixZeros("00300"));
        Assert.assertEquals(1, imgChecker.countPrefixZeros("02000"));
        Assert.assertEquals(4, imgChecker.countPrefixZeros("00009"));
        Assert.assertEquals(0, imgChecker.countPrefixZeros("10000"));
    }

    /*@Test
    public void findNumberPosition()throws WrongFileNameException
    {
        ImageChecker imgChecker = new ImageChecker();
        String fileName1 = new String("asd3000.jpg");
        Vector2i trueResult1 = new Vector2i(3, 7);
        String fileName2 = new String("asd3000asfda.jpg");
        Vector2i trueResult2 = new Vector2i(3, 7);
        String fileName3 = new String("asd3000");
        Vector2i trueResult3 = new Vector2i(3, 7);
        String fileName4 = new String("3000");
        Vector2i trueResult4 = new Vector2i(0, 4);
        String fileName5 = new String("3000asdd.jpg");
        Vector2i trueResult5 = new Vector2i(0, 4);
        String fileName6 = new String("hgfhfadf.jpg");

        Vector2i result = imgChecker.findNumberPosition(fileName1);
        Assert.assertEquals(trueResult1, result);

        result = imgChecker.findNumberPosition(fileName2);
        Assert.assertEquals(trueResult2, result);

        result = imgChecker.findNumberPosition(fileName3);
        Assert.assertEquals(trueResult3, result);

        result = imgChecker.findNumberPosition(fileName4);
        Assert.assertEquals(trueResult4, result);

        result = imgChecker.findNumberPosition(fileName5);
        Assert.assertEquals(trueResult5, result);

        try
        {
            result = imgChecker.findNumberPosition(fileName6);
        }
        catch(WrongFileNameException ex)
        {
            return;
        }
        Assert.assertTrue(false);

    }*/
}