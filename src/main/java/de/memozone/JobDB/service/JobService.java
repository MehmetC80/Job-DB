package de.memozone.JobDB.service;

import de.memozone.JobDB.model.Job;

import java.util.List;

public interface JobService {


    List<Job> getAllJobs();

    Job addJob( Job job);

}
