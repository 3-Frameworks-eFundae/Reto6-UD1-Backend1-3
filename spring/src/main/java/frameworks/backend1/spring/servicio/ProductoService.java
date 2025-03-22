package frameworks.backend1.spring.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frameworks.backend1.spring.modelo.Producto;
import frameworks.backend1.spring.repositorio.ProductoRepository;

@Service
public class ProductoService {
	
	@Autowired
	private ProductoRepository repositorio;
	
	public List<Producto> listarProductos(){
		return repositorio.findAll();
	}
	
	public Producto buscarProductoPorId(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Producto crearProducto(Producto producto) {
		return repositorio.save(producto);
	}
	
	public void borrarPorId(Long id) {
		repositorio.deleteById(id);
	}
	
	public Producto modificarProducto(Producto producto) {
		return repositorio.save(producto);
	}
}
