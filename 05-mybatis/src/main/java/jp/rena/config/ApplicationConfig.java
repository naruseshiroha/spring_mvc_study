package jp.rena.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ MyBatisConfig.class, SpringConfig.class, SpringMVCConfig.class })
public class ApplicationConfig {

}
