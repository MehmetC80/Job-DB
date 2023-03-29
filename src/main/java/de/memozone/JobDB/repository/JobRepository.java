package de.memozone.JobDB.repository;

import de.memozone.JobDB.model.Job;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends MongoRepository<Job,String> {
}
