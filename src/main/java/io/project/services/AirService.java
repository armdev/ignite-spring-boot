package io.project.services;

import io.project.model.Flight;
import java.util.List;

public interface AirService {

    List<Flight> findAll();

    Flight findOne(Long id);

}
