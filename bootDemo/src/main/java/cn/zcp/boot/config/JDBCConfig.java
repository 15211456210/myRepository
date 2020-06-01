package cn.zcp.boot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

//@Configuration
//@PropertySource("classpath:jdbc.properties")
//@EnableConfigurationProperties(JdbcProperties.class)
public class JDBCConfig {

//    @Value("${jdbc.driverClassName}")
//    String driverClassName;
//    @Value("${jdbc.url}")
//    String url;
//    @Value("${jdbc.username}")
//    String username;
//    @Value("${jdbc.password}")
//    String password;
//
//    @Bean
//    public DataSource getDataSource(){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(driverClassName);
//        dataSource.setUrl(url);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        return dataSource;
//    }
//    @Bean
//    public DataSource getDataSource(JdbcProperties properties){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(properties.getDriverClassName());
//        dataSource.setUrl(properties.getUrl());
//        dataSource.setUsername(properties.getUsername());
//        dataSource.setPassword(properties.getPassword());
//        return dataSource;
//    }
}
