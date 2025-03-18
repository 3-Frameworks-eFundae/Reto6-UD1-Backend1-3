package frameworks.backend1.spring.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import frameworks.backend1.spring.modelo.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
	
	List<Producto> listarProductos();
	Producto buscarProductoPorId(Long id);
	Producto crearProducto(Producto producto);
	void borrarPorId(Long id);
	Producto modificarProducto(Producto producto);
	
}
