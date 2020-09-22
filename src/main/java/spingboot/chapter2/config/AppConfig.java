package spingboot.chapter2.config;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "spingboot.chapter2.*",excludeFilters = {@ComponentScan.Filter(classes = {Service.class})})
public class AppConfig {
//    public User initUser(){
//        User user = new User();
//        user.setId(1L);
//        user.setUserName("cg");
//        user.setNote("notepad++");
//        return user;
//    }
    @Bean(name = "dataSource")
    public DataSource getDataSource(){
        Properties properties = new Properties();
        properties.setProperty("driver","org.postgresql.Driver");
        properties.setProperty("url","jdbc:postgresql://127.0.0.1:5432/cgTest");
        properties.setProperty("username","postgres");
        properties.setProperty("password","root");
        DataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(properties);
        }catch (Exception e){
            e.printStackTrace();
        }
        return dataSource;
    }
}
