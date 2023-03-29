package de.memozone.JobDB.controller;

import de.memozone.JobDB.model.Job;
import de.memozone.JobDB.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private JobService jobService;

    @GetMapping("/jobs")
    public ResponseEntity<List<Job>> getAllJobs() {
        return new ResponseEntity<List<Job>>(jobService.getAllJobs(), HttpStatus.OK);
    }

    @PostMapping("/jobs")
    public ResponseEntity<Job> addJob(@RequestBody Job job){

return new ResponseEntity<Job>(jobService.addJob(job),HttpStatus.CREATED);

    }

}
