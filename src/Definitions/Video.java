package Definitions;

public class Video
{
//    Member variables

    private String videoName;
    private boolean checkOut;
    private int rating;

//    Member functions

//    This method returns video name
    public String getVideoName()
    {
        return videoName;
    }

//    this will set a value of checkout true or false.
//    if true then customer has invented


    public void setCheckOut(boolean checkOut)
    {
        this.checkOut = checkOut;
    }
}
