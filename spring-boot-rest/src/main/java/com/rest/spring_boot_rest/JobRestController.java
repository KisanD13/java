package com.rest.spring_boot_rest;

import com.rest.spring_boot_rest.model.JobPost;
import com.rest.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {
    @Autowired
    private JobService jobService;

    @GetMapping("jobPosts")
//    @ResponseBody
    public List<JobPost> getAllJobs() {
        System.out.println("Getting all jobs");
        return  jobService.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId) {
        return jobService.getJob(postId);
    }

    @PostMapping("jobPost")
    public JobPost postJob(@RequestBody JobPost jobPost) {
        jobService.addJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        jobService.updateJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable("postId") int postId) {
        jobService.deleteJob(postId);
        return "Job Deleted Successfully";
    }
}
