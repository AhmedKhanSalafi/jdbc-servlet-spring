package resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    @Bean
    public DriverManagerDataSource myDataSource(){

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_db");
        dataSource.setUsername("root");
        dataSource.setPassword("Example@2023");

        return dataSource;
    }

    @Bean
    public JdbcTemplate mYjdbcTemplate(){

        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource( myDataSource());
        return jdbcTemplate;

    }
}
