package dia17.Repositorio;

import dia17.Modelos.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
