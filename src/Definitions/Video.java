package Definitions;

public class Video
{
//    Member variables

    private String videoName;
    private boolean checkOut;
    private int rating;
//    Constructor
    public Video(String videoName,boolean checkOut, int rating){
        this.videoName=videoName;
        this.checkOut=checkOut;
        this.rating=rating;
    }

//    Member functions

//    This method returns video name
    public String getVideoName()
    {
        return videoName;
    }
    public boolean isCheckOut()
    {
        return checkOut;
    }

    public int getRating()
    {
        return rating;
    }
    //    this will set a value of checkout true or false.
//    if true then customer has invented


//    public void setRating(int rating)
//    {
//        this.rating = rating;
//    }
//
//    public void setCheckOut(boolean checkOut)
//    {
//        this.checkOut = checkOut;
//    }
//
//    public void setVideoName(String videoName){
//        this.videoName=videoName;
//    }
public String toString(){
        return String.format(
                "Video Name %s,Video rating %d and Is video available %b",getVideoName(),getRating(),isCheckOut()
        );
}


}
