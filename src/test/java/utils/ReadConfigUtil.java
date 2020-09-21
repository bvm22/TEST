package test.java.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigUtil {

//    private static final Logger log = Logger.getLogger(String.valueOf(ReadConfigUtil.class));
    private static final Properties prop;

    static {
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/test/java/resources/config.properties");
            prop.load(fis);
        } catch (IOException e) {
//            log.error(e);
        }
    }

    /**
     * читает значение из файла config.properties
     *
     * @param value - имя
     * @return значение по выбранному имени
     */
    public synchronized static String getValueFromConfig(String value) {
        return prop.getProperty(value);
    }

    public synchronized static String getValueFromConfig(String value, String def) {
        return prop.getProperty(value, def);
    }
}
