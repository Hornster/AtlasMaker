package containers;

import javafx.scene.image.Image;

import java.util.LinkedList;

public class ImageSet
{
    //The name of the set is the name of the first file in the set.
    //private String imageSetName;
    private LinkedList<Image> images;
    //private Vector2i singleImageSize;
   // private int imageCount;
    //Data that will be saved together with the atlas.
    private ImgSetSaveData imgSetSaveData;

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
        imgSetSaveData = new ImgSetSaveData(imageSetName, imagesCount, singleImageSize);
    }
    //GETTERS
    public LinkedList<Image> getImageSet()
    {
        return images;
    }
    public ImgSetSaveData GetImgSetSaveData()
    {
        return imgSetSaveData;
    }
    //SETTERS
    public void setImageSet(LinkedList<Image> newImageSet)
    {
        images = newImageSet;
    }


}
