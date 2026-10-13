package com.example.studentfeedback;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feedback")
@CrossOrigin
public class FeedbackController {

    private final FeedbackRepository repository;

    public FeedbackController(FeedbackRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Feedback saveFeedback(@RequestBody Feedback feedback) {
        return repository.save(feedback);
    }

    @GetMapping
    public List<Feedback> getAllFeedback() {
        return repository.findAll();
    }
}