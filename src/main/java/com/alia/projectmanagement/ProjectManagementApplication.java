package com.alia.projectmanagement;

import io.swagger.annotations.Api;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EnableSwagger2

public class ProjectManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectManagementApplication.class, args);
    }

    @Bean
    public ModelMapper getModelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }


//    //TODO  TEST VERİSİNE İHTİYAÇ DUYULDUĞUNDA AÇABİLİRSİNİZ.
//	@Bean
//    public Jackson2RepositoryPopulatorFactoryBean repositoryPopulator() {
//        Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
//        factory.setResources(new Resource[]{new ClassPathResource("projects.json")});
//        return factory;
//    }

}
