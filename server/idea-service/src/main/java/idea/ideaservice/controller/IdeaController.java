package idea.ideaservice.controller;

import idea.ideaservice.entity.Idea;
import idea.ideaservice.service.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/idea")
@RestController
public class IdeaController {

    @Autowired
    IdeaService ideaService;

    @GetMapping
    public ResponseEntity<List<Idea>> getIdeas() {
        List<Idea> ideas = ideaService.getIdeas();
        if(ideas.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(ideas);
    }


}
