package containers;

import javafx.scene.image.Image;

import java.util.LinkedList;

public class ImageSet
{
    //The name of the set is the name of the first file in the set.
    private String imageSetName;
    private LinkedList<Image> images;
    private Vector2i singleImageSize;
    private int imageCount;

    public ImageSet()
    {
        this(new LinkedList<Image>(), new Vector2i(), "");
    }
    public ImageSet(LinkedList<Image> imageSet, Vector2i singleImageSize, String imageSetName)
    {
        this(imageSet, singleImageSize, imageSet.size(), imageSetName);
    }
    public ImageSet(LinkedList<Image> imageSet, Vector2i singleImageSize, int imagesCount, String imageSetName)
    {
        images = imageSet;
        this.singleImageSize = singleImageSize;
        this.imageCount = imagesCount;
        this.imageSetName = imageSetName;
    }
    //GETTERS
    public LinkedList<Image> getImageSet()
    {
        return images;
    }
    public String getImageSetName()
    {
        return imageSetName;
    }
    public Vector2i getSingleImageSize()
    {
        return singleImageSize;
    }
    public int getImageCount()
    {
        return imageCount;
    }
    //SETTERS
    public void setImageSet(LinkedList<Image> newImageSet)
    {
        images = newImageSet;
    }
    public void setImageSetName(String newImageSetName)
    {
        imageSetName = newImageSetName;
    }
    public void setSingleImageSize(Vector2i newImageSize)
    {
        singleImageSize = newImageSize;
    }
    public void setImageCount(int newCount)
    {
        imageCount = newCount;
    }


}
