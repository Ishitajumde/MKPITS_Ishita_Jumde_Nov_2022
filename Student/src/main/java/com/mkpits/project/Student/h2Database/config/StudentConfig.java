package com.mkpits.project.Student.h2Database.config;

import com.zaxxer.hikari.util.DriverDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
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

import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "studentEntityManagerFactory",
        basePackages = {"com.mkpits.project.Student.h2Database.repository"},
        transactionManagerRef = "studentTransactionManager"
)
public class StudentConfig {
         @Autowired
         Environment env;
//Datasource
    @Primary
    @Bean(name = "studentDataSource")
   public DataSource dataSource(){
       DriverManagerDataSource ds=new DriverManagerDataSource();
       ds.setUrl(env.getProperty("spring.database1.datasource.url"));
       ds.setUsername(env.getProperty("spring.database1.datasource.username"));
       ds.setPassword(env.getProperty("spring.database1.datasource.password"));
       ds.setDriverClassName(env.getProperty("spring.database1.datasource.driverClassName"));
     return ds;
   }

//EntityManagerFactory
    @Primary
    @Bean(name = "studentEntityManagerFactory")
   public LocalContainerEntityManagerFactoryBean entityManager(){
    LocalContainerEntityManagerFactoryBean bean= new LocalContainerEntityManagerFactoryBean();
    bean.setDataSource(dataSource());
    JpaVendorAdapter adapter= new HibernateJpaVendorAdapter();
       bean.setJpaVendorAdapter(adapter);
       Map<String,String> props=new HashMap<>();
       props.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
       props.put("hibernate.show_sql","true");
       props.put("hibernate.hbm2ddl.auto","create");
       bean.setJpaPropertyMap(props);
       bean.setPackagesToScan("com.mkpits.project.Student.h2Database.model");
       return bean;
}

//////platformTransactionManager
    @Primary
    @Bean(name = "studentTransactionManager")
    public PlatformTransactionManager transactionManager(){
        JpaTransactionManager manager=new JpaTransactionManager();
        manager.setEntityManagerFactory(entityManager().getObject());
        return manager;
    }
}
