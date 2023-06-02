package com.mkpits.project.Student.mySqlDatabase.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "teacherEntityManagerFactory",
        basePackages = {"com.mkpits.project.Student.mySqlDatabase.repository"},
        transactionManagerRef = "teacherTransactionManager"
)
public class TeacherConfig {
    @Autowired
    Environment env;

    //Datasource

    @Bean(name = "teacherDataSource")
    public DataSource dataSource(){
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setUrl(env.getProperty("spring.database2.datasource.url"));
        ds.setUsername(env.getProperty("spring.database2.datasource.username"));
        ds.setPassword(env.getProperty("spring.database2.datasource.password"));
        return ds;
    }

    //EntityManagerFactory

    @Bean(name = "teacherEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManager() {
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setDataSource(dataSource());
        JpaVendorAdapter adapter=new HibernateJpaVendorAdapter();
        bean.setJpaVendorAdapter(adapter);
        Map<String, String> props = new HashMap<>();
        props.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        props.put("hibernate.show_sql", "true");
        props.put("hibernate.hbm2ddl.auto", "create");
        bean.setJpaPropertyMap(props);
        bean.setPackagesToScan("com.mkpits.project.Student.mySqlDatabase.model");
        return bean;
    }

    //////platformTransactionManager

    @Bean(name = "teacherTransactionManager")
    public PlatformTransactionManager transactionManager(){
        JpaTransactionManager manager=new JpaTransactionManager();
        manager.setEntityManagerFactory(entityManager().getObject());
        return manager;
    }
}