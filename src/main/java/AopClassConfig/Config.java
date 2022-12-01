package AopClassConfig;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("AopClassConfig")
@EnableAspectJAutoProxy
public class Config {
}
