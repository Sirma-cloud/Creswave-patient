package sirma.example.Creswave.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sirma.example.Creswave.model.Survey;
import sirma.example.Creswave.repository.SurveyRepository;

@RestController
@RequestMapping("/api/survey")
public class SurveyController {
    @Autowired
    private SurveyRepository surveyRepository;

    @GetMapping("/get/list/{page}/{size}")
    public ResponseEntity<Page<Survey>> getSurveyByPage(@PathVariable int page, @PathVariable int size) {
        // Limit the page size to a maximum batch of 100
        int maxSize = Math.min(size, 100);
        Pageable pageable = PageRequest.of(page, maxSize);
        Page<Survey> surveyPage = surveyRepository.findAll(pageable);
        return ResponseEntity.ok(surveyPage);
    }
}
