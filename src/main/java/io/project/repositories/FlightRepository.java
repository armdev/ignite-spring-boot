package io.project.repositories;


import io.project.model.Flight;
import java.util.List;
import org.apache.ignite.springdata.repository.IgniteRepository;
import org.apache.ignite.springdata.repository.config.RepositoryConfig;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@RepositoryConfig(cacheName = "FlightCache")
@Component
@Repository
public interface FlightRepository extends IgniteRepository<Flight, Long> {    
    
    @Override
    List<Flight> findAll();
    
    @Override
    Flight findOne(Long id);
}
