package security.sprint.MainSecurity.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import security.sprint.MainSecurity.Modelos.Rol;

public interface RepositorioRol extends MongoRepository<Rol, String> {
}
