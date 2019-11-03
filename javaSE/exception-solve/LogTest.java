import java.util.logging.Logger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 * @author hao
 * 日志系统：
 * 1. JDK Logging
 * 2. Commons Logging
 * 3. Log4j
 * 4. SLF4J Logback
 */
public class LogTest{
    public static void main(String[] args) {
        // JDK Logger
        Logger logger = Logger.getLogger(LogTest.class.getName());
        logger.info("start process...");
        logger.warning("memory is running out...");
        // info 以下的级别会被忽略
        logger.fine("ignored.");
        logger.severe("process will be terminated...");
        // Commons Logging
        // 第一步，通过LogFactory获取Log类的实例； 第二步，使用Log实例的方法打日志。
        // 执行： 1. javac -cp commons-logging-1.2.jar Main.java 
        //       2.java -cp .:commons-logging-1.2.jar Main
        final Log log = LogFactory.getLog(LogTest.class.getName());
        log.info("start.");
        log.info("stop.");
    }
}