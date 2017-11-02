package io.project.app;

import io.project.model.Flight;
import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.springdata.repository.config.EnableIgniteRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("io.project.jparepositories")
@ComponentScan(basePackages = {"io"}, excludeFilters = {
    @ComponentScan.Filter(Configuration.class)})
@EntityScan(basePackageClasses = Flight.class)
@EnableIgniteRepositories("io.project.repositories")
@Import(SpringConfig.class)
@Configuration
public class IgniteDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(IgniteDataApplication.class, args);
    }

    @Bean  
    public Ignite igniteInstance() {
        IgniteConfiguration cfg = new IgniteConfiguration();
        // Setting some custom name for the node.
        cfg.setIgniteInstanceName("springDataNode");
        // Enabling peer-class loading feature.
        cfg.setPeerClassLoadingEnabled(true);
        // Defining and creating a new cache to be used by Ignite Spring Data
        // repository.
        CacheConfiguration ccfg = new CacheConfiguration("FlightCache");
        // Setting SQL schema for the cache.
        ccfg.setIndexedTypes(Long.class, Flight.class);          
        cfg.setActiveOnStart(true);    
        cfg.setCacheConfiguration(ccfg);
        return Ignition.start(cfg);
    }

}
