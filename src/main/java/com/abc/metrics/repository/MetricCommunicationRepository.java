package com.abc.metrics.repository;

import com.abc.metrics.domain.MetricCommunication;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by scamisay on 03/02/16.
 */
public interface MetricCommunicationRepository extends MongoRepository<MetricCommunication, String> {
}
