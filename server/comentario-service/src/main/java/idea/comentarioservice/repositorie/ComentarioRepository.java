package idea.comentarioservice.repositorie;
import idea.comentarioservice.entitie.ComentarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ComentarioRepository extends JpaRepository<ComentarioEntity, Integer> { }

