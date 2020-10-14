public class Test {
    public static void main(String[] args) {
        ShowMessage sh=new ShowMessage();//空构函数构造sh
        SupportMessage sm=(SupportMessage)Factory.getBean("supportMessage");
        sh.setSupportMessage(sm);//使用setSupportMessage()注入
        sh.show();
        ShowMessage sh1=new ShowMessage(sm);//使用带参构造函数构造sh1
        sh1.show();

        //A a=(A)Factory.getBean("a");
        sh.show1(new A() {
            @Override
            public String f(String name) {
                return name+"不怎么样";
            }
        }, "张");
    }
}
