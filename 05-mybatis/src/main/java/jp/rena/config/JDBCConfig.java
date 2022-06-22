package jp.rena.config;

import javax.sql.DataSource;

// import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;

// import lombok.Value;

@Configuration
// @PropertySource("classpath:db.properties")
public class JDBCConfig {
    // @Value("")
    // private String driverClassName;
    // @Value("")
    // private String url;
    // @Value("root")
    // private String username;
    // @Value("lixunsam")
    // private String password;

    // dataSource
    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///ssmbuild?useSSL=true&characterEncoding=UTF-8&useUnicode=true&serverTimezones=Asia/Shanghai");
        dataSource.setUsername("root");
        dataSource.setPassword("lixunsam");
        return dataSource;
    }

    // DataSourceTransactionManager
    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }


}
