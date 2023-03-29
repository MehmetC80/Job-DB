package de.memozone.JobDB.service;

import de.memozone.JobDB.model.Job;
import de.memozone.JobDB.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService{

    @Autowired
    private JobRepository jobRepository;


    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public Job addJob(Job job) {

        return jobRepository.save(job);
    }
}
