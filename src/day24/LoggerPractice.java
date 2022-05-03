package day24;


import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerPractice {

    private static final Logger myLogger = Logger.getLogger("com.mycompany.myapp");

    public static void main(String[] args) {

//        Logger.getGlobal().setLevel(Level.ALL);
//
//        Logger.getGlobal().severe("This is sever kind of log");
//        Logger.getGlobal().warning("This is warning kind of log");
//        Logger.getGlobal().info("This is info kind of log");
//        Logger.getGlobal().config("This is config kind of log");

        myLogger.setLevel(Level.ALL);

        myLogger.severe("This is sever kind of log");
        myLogger.warning("This is warning kind of log");
        myLogger.info("This is info kind of log");
        myLogger.config("This is config kind of log");


    }

}