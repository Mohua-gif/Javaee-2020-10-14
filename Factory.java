import java.io.InputStream;
import java.util.Properties;

public class Factory {
    public static Object getBean(String name){
        try {
            Properties properties = new Properties();
            InputStream inputStream =Factory.class.getResourceAsStream("config.properties");
            properties.load(inputStream);
            String classname=properties.getProperty(name);
            Object object=Class.forName(classname).newInstance();
            return object;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
