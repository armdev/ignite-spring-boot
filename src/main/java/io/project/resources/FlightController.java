package io.project.resources;

import io.project.model.Flight;
import io.project.services.FlightService;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FlightController {

    private static final Logger log = LoggerFactory.getLogger(FlightController.class);

    @Autowired
    private FlightService flightRepository;

    @GetMapping(path = "/flights", produces = "application/json;charset=UTF-8")
    public List<Flight> findAll() {
        log.debug("REST request to get all Blogs");
        List<Flight> flightList = flightRepository.findAll();
        return flightList;
    }

    @GetMapping(path = "/flight/{id}", produces = "application/json;charset=UTF-8")
    public Flight findOne(@PathVariable Long id) {
        log.debug("REST request to get one");
        System.out.println("id is  " + id);
        Flight model = flightRepository.findOne(id);       
        return model;
    }

}
