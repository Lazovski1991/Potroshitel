package config;

import model.InjectRandomIntAnnotationBeanPostProcessor;
import model.PostProxyInvokerContextListener;
import model.ProfilingHandlerBeanPostProcessor;
import model.TerminatorQuoter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "model")
public class AppConfig {

    @Bean
    public TerminatorQuoter createTerminatorQuoter() {
        TerminatorQuoter terminatorQuoter = new TerminatorQuoter();
        terminatorQuoter.setMessage("I'll be back");
        return terminatorQuoter;
    }

    @Bean
    public InjectRandomIntAnnotationBeanPostProcessor createInjectRandomIntAnnotationBeanPostProcessor() {
        return new InjectRandomIntAnnotationBeanPostProcessor();
    }

    @Bean
    public ProfilingHandlerBeanPostProcessor createProfilingHandlerBeanPostProcessor() throws Exception {
        return new ProfilingHandlerBeanPostProcessor();
    }

    @Bean
    public PostProxyInvokerContextListener createPostProxyInvokerContextListener() {
        return new PostProxyInvokerContextListener();
    }
}
