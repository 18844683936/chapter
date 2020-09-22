package spingboot.chapter2.config;


import com.sun.istack.internal.logging.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spingboot.chapter2.pojo.User;

public class IocTest {
    private static Logger log = Logger.getLogger(IocTest.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = ctx.getBean(User.class);
        log.info(user.getNote()+"");
    }

}
