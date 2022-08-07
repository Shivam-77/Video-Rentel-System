package Execution;
import Definitions.Video;
public class Main
{
    public static void main(String[] args){
        Video vid=new Video();
        vid.setVideoName("Bahubali:the begeninig");
        vid.setCheckOut(true);
        vid.setRating(10);
        System.out.println(vid.getVideoName());
        System.out.println(vid.getRating());


    }
}
