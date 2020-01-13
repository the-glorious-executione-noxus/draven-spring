package com.noxus.draven.hibernate;

import com.noxus.draven.hibernate.config.dynamic.DynamicDataSourceAnnotationAdvisor;
import com.noxus.draven.hibernate.config.dynamic.DynamicDataSourceAnnotationInterceptor;
import com.noxus.draven.hibernate.config.dynamic.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Import(DynamicDataSourceRegister.class)
@SpringBootApplication
@MapperScan("com.noxus.draven.hibernate.repository")
@EnableTransactionManagement
public class HibernateApplication {
    public static void main(String[] args) {
        SpringApplication.run(HibernateApplication.class, args);
    }

    @Bean
    public DynamicDataSourceAnnotationAdvisor dynamicDatasourceAnnotationAdvisor() {
        return new DynamicDataSourceAnnotationAdvisor(new DynamicDataSourceAnnotationInterceptor());
    }
}
