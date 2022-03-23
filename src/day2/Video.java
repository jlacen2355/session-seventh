package day2;

public class Video {

    /*
     *  Instance variables: states of Video
     */
    String video;
    String vname;
    String hashtag;
    String creator;
    String postdate;
    float duration;
    int views;
    int likes;
    int dislikes;

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
    void autoplayVideo(){
        System.out.println("autoplayvideo");
    }
    void videoVolumen(){
        System.out.println("changevolumen");
    }
    void ccVideo(){
        System.out.println("caption/subtitle-(on/off)");
    }
    void videosetting(){
        System.out.println("settingvideoparameters");
    }
    void videoscreen(){
        System.out.println("videoscreensize");
    }
    void videolikes(){
        System.out.println("showingvideolikes");
    }
    void videodislikes(){
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
