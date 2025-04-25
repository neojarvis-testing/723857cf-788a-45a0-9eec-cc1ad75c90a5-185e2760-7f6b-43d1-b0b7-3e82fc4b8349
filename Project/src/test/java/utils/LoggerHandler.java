package utils;
import java.text.SimpleDateFormat;
import java.util.Date;
 
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
public class LoggerHandler {
    public static Logger logger = Logger.getLogger(LoggerHandler.class);
 
    static {
        initializeLogger();
    }
 
    private static void initializeLogger() {
        try {
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String logFileName = "logs/logfile_" + timestamp + ".log";
            FileAppender fileAppender = new FileAppender(new PatternLayout("%d{yyyy.MM.dd.HH.mm.ss} %-5p %c - %m%n"), logFileName, true);
            logger.addAppender(fileAppender);
        } catch (Exception e) {
            logger.error(e);
        }
    }
    /*Method Name:trace
     * Author Name:C Sai Kiran
     * Description: This methods helps to log detailed information.
     * Parameters:Message
     * return type:void
     */
    public static void trace(String message)
    {
        try {
            logger.trace(message);
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
       
    }
    /*Method Name:debug
     * Author Name:C Sai Kiran
     * Description: This methods logs information that is useful for debugging.
     * Parameters:Message
     * return type:void
     */
    public static void debug(String message)
    {
        try {
            logger.debug(message);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     /*Method Name:info
     * Author Name:C Sai Kiran
     * Description: This methods is used to write information in detail.
     * Parameters:Message
     * return type:void
     */
    public static void info(String message)
    {
        try {
            logger.info(message);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     /*Method Name:warn
     * Author Name:C Sai Kiran
     * Description: This methods is used to warn.
     * Parameters:Message
     * return type:void
     */
    public static void warn(String message)
    {
        try {
            logger.warn(message);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
  
    /*Method Name:error
     * Author Name:C Sai Kiran
     * Description: This methods write log of the error.
     * Parameters:Message
     * return type:void
     */
    public static void error(String message)
    {
        try {
            logger.error(message);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /*Method Name:fatal
     * Author Name:C Sai Kiran
     * Description: This methods is used to log severe error events.
     * Parameters:Message
     * return type:void
     */
    public static void fatal(String message)
    {
        try {
            logger.fatal(message);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}