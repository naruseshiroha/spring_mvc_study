package jp.rena.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("jp.rena.controller")
@EnableWebMvc
public class SpringMVCConfig {
    
}
