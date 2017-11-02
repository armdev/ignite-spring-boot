package io.project.services;

import io.project.model.Flight;
import io.project.jparepositories.AirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Service
@Component
public class AirServiceImpl implements AirService {
 
    
    @Autowired
    private  AirRepository airRepository;


    @Override
    public List<Flight> findAll() {
        List<Flight> list = new ArrayList<>();    
        list = airRepository.findAll();
        return list;
    }

    @Override
    public Flight findOne(Long id) {
        return airRepository.findOne(id);
    }


}
