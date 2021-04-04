import config.AppConfig;
import model.Quoter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Quoter bean = annotationConfigApplicationContext.getBean(Quoter.class);
        while (true) {
            Thread.sleep(150);
            bean.sayQuoter();
        }
    }
}
