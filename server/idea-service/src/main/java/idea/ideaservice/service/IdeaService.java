package idea.ideaservice.service;

import idea.ideaservice.entity.Idea;
import idea.ideaservice.repository.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdeaService {

    @Autowired
    IdeaRepository ideaRepository;

    public List<Idea> getIdeas(){
        return ideaRepository.findAll();
    }

}
