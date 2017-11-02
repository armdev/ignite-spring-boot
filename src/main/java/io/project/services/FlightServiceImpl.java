package io.project.services;

import io.project.model.Flight;
import io.project.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Service
@Component
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightRepository flightRepository;

    @Override
    public List<Flight> findAll() {
        List<Flight> list = new ArrayList<>();
        list = flightRepository.findAll();
        return list;
    }

    @Override
    public Flight findOne(Long id) {
        return flightRepository.findOne(id);
    }

    @Override
    public Flight save(Long id, Flight flight) {
        return flightRepository.save(id, flight);
    }

}
