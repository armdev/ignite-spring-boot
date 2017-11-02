package io.project.services;

import io.project.model.Flight;
import java.util.List;

public interface FlightService {

    List<Flight> findAll();

    Flight findOne(Long id);
    
    Flight save(Long id, Flight flight);

}
