package containers;

import javafx.scene.image.Image;

import java.util.LinkedList;
/**Stores images of given set and path to the first image in the sequence.*/
public class ImagesSource
{
    /**The name of the set is the name of the first file in the set.*/
    private LinkedList<Image> images;
    /**The path to the first image in the sequence.*/
    private String firstImgPath;

    /**Returns the path to the first image in the sequence.*/
    public String getImagesPath()
    {
        return firstImgPath;
    }
    /**Sets a new path to the images. The path should lead to the first image in the sequence.*/
    public void setImagesPath(String newPath)
    {
        firstImgPath = newPath;
    }
    /**Returns the list of the images in the sequence.*/
    public LinkedList<Image> getImagesSequence()
    {
        return images;
    }
    /**Allows to set a new list of images.*/
    public void setImagesSequence(LinkedList<Image> newImagesSeq)
    {
        images = newImagesSeq;
    }
}
