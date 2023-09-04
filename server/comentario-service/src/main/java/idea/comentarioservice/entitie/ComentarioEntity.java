package idea.comentarioservice.entitie;

import lombok.*;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor //constructor vacio
@AllArgsConstructor // constructor con todos los atributos
@Table(name = "comentario")
public class ComentarioEntity {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;
    @Column(name = "comentario")
    String comentario;

}

