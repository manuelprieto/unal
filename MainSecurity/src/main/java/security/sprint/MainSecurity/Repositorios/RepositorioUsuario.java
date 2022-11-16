package security.sprint.MainSecurity.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import security.sprint.MainSecurity.Modelos.Usuario;

public interface RepositorioUsuario extends MongoRepository<Usuario, String> {
    @Query("{'correo':?0}")
    Usuario getUserByMail(String correo);
}

