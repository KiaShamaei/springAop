package AopSpringAnnotationAspectj;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "AopSpringAnnotationAspectj")
@EnableAspectJAutoProxy
public class Config {
}
