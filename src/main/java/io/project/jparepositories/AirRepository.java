package io.project.jparepositories;


import io.project.model.Flight;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface AirRepository extends CrudRepository<Flight, Long> {    
    
    @Override
    List<Flight> findAll();
    
    @Override
    Flight findOne(Long id);
}
