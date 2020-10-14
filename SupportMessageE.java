import java.util.List;

public class SupportMessageE implements SupportMessage {
    @Override
    public String getMessage() {
        return "Hello!";
    }

    @Override
    public List<String> getMessages() {
        return null;
    }
}
