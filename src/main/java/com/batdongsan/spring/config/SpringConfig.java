package com.batdongsan.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableJpaRepositories(basePackages = "com.batdongsan.spring.repository")
@EnableTransactionManagement
public class SpringConfig {
    @Bean
    DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/batdongsan");
        // database name
        dataSource.setUsername("root");
        dataSource.setPassword("123");
        return dataSource;
    }


    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean entityManager = new LocalContainerEntityManagerFactoryBean();
        // refer to datasource()
        entityManager.setDataSource(dataSource);
        // initialize our configuration with the default settings that are compatible with Hibernate
        entityManager.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        // base package to scan for entity classes
        entityManager.setPackagesToScan("com.batdongsan.spring.entity");
        // JPA properties
        Properties jpaProperties = new Properties();
        jpaProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        jpaProperties.setProperty("hibernate.hbm2ddl.auto", "update");

        // update or create
        // update : update the existing DB structure, data will be keep
        // create: drop all DB structure, then re-create. All data will be lost.
        // recommend: create -> DB structure -> update
        entityManager.setJpaProperties(jpaProperties);

        return entityManager;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
        // refer to entityManagerFactory()
        jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
        return jpaTransactionManager;     }
}

