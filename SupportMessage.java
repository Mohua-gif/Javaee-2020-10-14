import java.util.List;

/**
 *
 */
public interface SupportMessage {
    String getMessage();
    List<String> getMessages();//范型——提高性能
    //Vector：底层是数组数据结构 线程同步
    //ArrayList：底层的数据结构使用的是数组结构（数组长度是可变的百分之五十延长）（特点是查询很快，但增删较慢）线程不同步
}

