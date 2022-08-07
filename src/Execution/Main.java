package Execution;
import Definitions.Video;
public class Main
{
    public static void main(String[] args){
        Video vid=new Video("Bahubali",true,10);
        Video vid1=new Video("Suryavanshi",false,6);
        Video vid2=vid;

//        vid.setVideoName("Bahubali:the beginning");
//        vid.setCheckOut(true);
//        vid.setRating(10);
        System.out.println(vid.getVideoName());
        System.out.println(vid.getRating());
        System.out.println(vid.isCheckOut());
        System.out.println(vid.toString());
        if(vid.hashCode()==vid1.hashCode()){
            System.out.println("Vid and vid1 are equals");
        }
        else if(vid.hashCode()==vid2.hashCode()){
            System.out.println("Vid and vid2 are equals and vid and vid1 are not equals");
        }
        else{
            System.out.println("No one objects are  Equals");
        }






    }
}
