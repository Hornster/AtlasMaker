package containers;

import javafx.scene.image.Image;

import java.util.LinkedList;

public class ImageSet
{

    //private Vector2i singleImageSize;
   // private int imageCount;
    /**Data that will be saved together with the atlas.*/
    private ImgSetSaveData imgSetSaveData;
    /**The path to and the atlas itself.*/
    private ImagesSource imagesSource;

    public ImageSet()
    {
        this(new ImagesSource(), new Vector2i(), "");
    }
    public ImageSet(ImagesSource imagesSourceData, Vector2i singleImageSize, String imageSetName)
    {
        this(imagesSourceData, singleImageSize, imagesSourceData.getImagesSequence().size(), imageSetName);
    }
    public ImageSet(ImagesSource imageSet, Vector2i singleImageSize, int imagesCount, String imageSetName)
    {
        imagesSource = imageSet;
        imgSetSaveData = new ImgSetSaveData(imageSetName, imagesCount, singleImageSize);
    }
    //GETTERS
    /**Returns the container for path to and the images themselves.*/
    public ImagesSource getImagesSourceData()
    {
        return imagesSource;
    }
    /**Returns the additional data about the image set. (like name, images count...)*/
    public ImgSetSaveData getImgSetSaveData()
    {
        return imgSetSaveData;
    }
    //SETTERS
    public void setImageSet(ImagesSource newImagesSourceData)
    {
        imagesSource = newImagesSourceData;
    }
    public void setImageSet(ImgSetSaveData newImgSetSaveData)
    {
        imgSetSaveData = newImgSetSaveData;
    }


}