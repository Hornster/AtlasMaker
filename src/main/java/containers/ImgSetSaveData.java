package containers;
//Stores part of data of an image set that will be saved later along with the atlas.
//Data save sequence:
//imageSet_name, xCoord, yCoord, xImgSize, yImgSize, imagesCount
//  -Each set is saved in new line. xCoord and yCoord define the position of upper left
//   corner of the first image in the set in the atlas (in pixels).
//  -xImgSize and yImgSize define the size of each single frame in the set (in pixels).
public class ImgSetSaveData
{
    private String imageSetName;
    private int imageCount;
    private Vector2i singleImgSize;


    ImgSetSaveData(String _setName, int _imagesCount, Vector2i _singleImgSize)
    {
        imageSetName = _setName;
        imageCount = _imagesCount;
        singleImgSize = _singleImgSize;
    }
    //GETTERS
    public String getImageSetName()
    {
        return imageSetName;
    }
    public Vector2i getSingleImageSize()
    {
        return singleImgSize;
    }
    public int getImageCount()
    {
        return imageCount;
    }
    //SETTERS
    public void setImageSetName(String newImageSetName)
    {
        imageSetName = newImageSetName;
    }
    public void setSingleImageSize(Vector2i newImageSize)
    {
        singleImgSize = newImageSize;
    }
    public void setImageCount(int newCount)
    {
        imageCount = newCount;
    }
}
