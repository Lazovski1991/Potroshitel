package config;

import model.InjectRandomIntAnnotationBeanPostProcessor;
import model.ProfilingHandlerBeanPostProcessor;
import model.TerminatorQuoter;
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
}
