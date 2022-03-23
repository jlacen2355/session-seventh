package day2;

public class Video {

    /*
     *  Instance variables: states of Video
     */
    long videoId;
    String video;
    String vName;
    String hashTag;
    String channel;
    String category;
    String postDate;
    Boolean isDownloadable;
    long duration;
    long views;
    long likes;
    long dislikes;




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
