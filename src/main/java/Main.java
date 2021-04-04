import config.AppConfig;
import model.Quoter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        annotationConfigApplicationContext.getBean(Quoter.class).sayQuoter();

    }
}
