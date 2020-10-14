import java.util.ArrayList;
import java.util.List;

public class SupportMessageC implements SupportMessage,SupportMessage1{
    @Override
    public String getMessage() {
        return "你好！";
    }

    @Override
    public List<String> getMessages() {
        return new ArrayList<String>();
    }

    @Override
    public String getMessage1() {
        return null;
    }
}
