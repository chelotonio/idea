package idea.comentarioservice.controller;
import idea.comentarioservice.entitie.ComentarioEntity;
import idea.comentarioservice.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@CrossOrigin
@RestController // a diferencia del controller, el restcontroller solo retorna json
@RequestMapping("/comentarios")
public class ComentarioController {
    @Autowired
    ComentarioService comentarioService;

    @GetMapping
    public ResponseEntity<List<ComentarioEntity>> getAllComentarios(){
        return ResponseEntity.ok(comentarioService.findAll());
    }


}
