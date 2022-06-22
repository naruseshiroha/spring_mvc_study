package jp.rena.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;

import jp.rena.mapper.BookMapper;

@Configuration
public class MyBatisConfig {

    @Value("${driverClassName}")
    private String driverClassName;
    @Value("$url")
    private String url;
    @Value("$username")
    private String username;
    @Value("$password")
    private String password;

    // dataSource
    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    // DataSourceTransactionManager
    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        factoryBean.setTypeAliasesPackage("jp.rena.entity");

        factoryBean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath*:jp/rena/mapper/*.xml"));
        return factoryBean.getObject();
    }

    // @Bean
    // public SqlSessionTemplate sqlSession() throws Exception {
    //     return new SqlSessionTemplate(sqlSessionFactory());
    // }

    @Bean
    public BookMapper bookMapper() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        BookMapper BookMapper = sqlSessionTemplate.getMapper(BookMapper.class);
        return BookMapper;
    }
}
