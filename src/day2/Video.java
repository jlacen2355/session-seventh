package day2;

public class Video {

    /*
     *  Instance variables: states of Video
     */
    String videoId;
    //Id that identify every video
    String video;
    //Video source url
    String vName;
    //Video name
    String hashTag;
    //Video content related words
    String channel;
    //Channel where video belongs
    String category;
    //Channel where video belongs
    String description;
    //Video description for users
    String postDate;
    //Date when the video was posted
    boolean isDownloadableVideo;
    //Describe if a user can download video
    long subscribers;
    //How many subscribers actual video has
    long duration;
    //How long video takes to see it
    long views;
    //How many users has been seen the video
    long likes;
    //How many users has been hit the like option
    long dislikes;
    //How many users has been hit the dislike option




    /*
     *  Instance methods: behaviors of Video
     */

    void playVideo(){
        System.out.println("playingvideo");
    }
    void pauseVideo(){
        System.out.println("pausevideo");
    }
    void stopVideo(){
        System.out.println("stoppingvideo");
    }
    void nextVideo(){
        System.out.println("nextvideo");
    }
    void autoPlayVideo(){
        System.out.println("autoplayvideo");
    }
    void videoVolumen(){
        System.out.println("changevolumen");
    }
    void ccVideo(){
        System.out.println("caption/subtitle-(on/off)");
    }
    void videoSetting(){
        System.out.println("settingvideoparameters");
    }
    void videoScreen(){
        System.out.println("videoscreensize");
    }
    void videoLikes(){
        System.out.println("showingvideolikes");
    }
    void videoDislikes(){
        System.out.println("showingvideodislikes");
    }
    void shareVideo(){
        System.out.println("videosharing");
    }
    void downloadVideo(){
        System.out.println("downloadingvideo");
    }
    void clipVideo(){
        System.out.println("clippingvideo");
    }
    void saveVideo(){
        System.out.println("savingvideo");
    }
    void reportVideo(){
        System.out.println("reportingvideo");
    }
    void videoShowtranscript(){
        System.out.println("showingtranscript");
    }
}
