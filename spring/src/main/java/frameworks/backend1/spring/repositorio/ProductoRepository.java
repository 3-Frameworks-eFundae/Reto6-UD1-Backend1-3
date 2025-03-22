package frameworks.backend1.spring.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import frameworks.backend1.spring.modelo.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
	
}
