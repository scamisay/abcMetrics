package com.abc.metrics.service;

import com.abc.metrics.domain.MetricCommunication;
import com.abc.metrics.repository.MetricCommunicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by scamisay on 02/02/16.
 */
@Service
public class CommunitationService{

    @Autowired
    private MetricCommunicationRepository repository;

    public List<MetricCommunication> findAll(){
        return repository.findAll();
    }

    public MetricCommunication save(MetricCommunication metric){
        return repository.save(metric);
    }
}
