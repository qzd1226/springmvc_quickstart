import com.qzd.config.SpringConfig;
import com.qzd.controller.UserController;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringConfig.class);
        System.out.println(ctx.getBean(UserController.class));
    }
}
