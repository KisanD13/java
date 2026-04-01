package com.Springexample.jobApp;

import com.Springexample.jobApp.model.JobPost;
import com.Springexample.jobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping({"/", "home"})
    public String Home() {
        return "home";
    }

    @GetMapping("/addjob")
    public String addJob() {
        System.out.println("addjob");
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        jobService.addJob(jobPost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewJob(Model model) {
        List<JobPost> jobs = jobService.getAllJobs();
        model.addAttribute("jobPosts", jobs);
        return "viewalljobs";
    }
}














