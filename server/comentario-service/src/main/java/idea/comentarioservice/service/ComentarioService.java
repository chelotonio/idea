package idea.comentarioservice.service;

import idea.comentarioservice.entitie.ComentarioEntity;
import idea.comentarioservice.repositorie.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComentarioService {
    @Autowired
    ComentarioRepository comentarioRepository;

    public Optional<ComentarioEntity> findById(Integer id){
        return comentarioRepository.findById(id);
    }
    public List<ComentarioEntity> findAll(){
        return comentarioRepository.findAll();
    }
    public ComentarioEntity save(ComentarioEntity comentarioEntity){
        return comentarioRepository.save(comentarioEntity);
    }
    public void deleteById(Integer id){
        comentarioRepository.deleteById(id);
    }
    public ComentarioEntity update(ComentarioEntity comentarioEntity){
        return comentarioRepository.save(comentarioEntity);
    }

}
