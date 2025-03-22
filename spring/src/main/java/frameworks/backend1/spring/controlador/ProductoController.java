package frameworks.backend1.spring.controlador;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import frameworks.backend1.spring.modelo.Producto;
import frameworks.backend1.spring.servicio.ProductoService;

@RestController
@RequestMapping("/")
public class ProductoController {

	@Autowired
	ProductoService servicio;
	
	@GetMapping("/productos")
	public List<Producto> listarProductos(){
		return servicio.listarProductos();
	}
	
	@GetMapping("/productos/{id}")
	public Producto buscarProductoPorId(@PathVariable("id") Long id){
		return servicio.buscarProductoPorId(id);
	}

	@PostMapping("/productos")
	public Producto crearProducto(@RequestBody Producto producto){
		return servicio.crearProducto(producto);
	}
	
	@PutMapping("/productos")
	public Producto modificarProducto(@RequestBody Producto producto){
		return servicio.modificarProducto(producto);
	}
	
	@DeleteMapping("/productos/{id}")
	public HashMap<String, String> borrarProducto(@PathVariable Long id){
		servicio.borrarPorId(id);
		HashMap<String, String> mensaje = new HashMap<String, String>();
		mensaje.put("mensaje", "Se ha eliminado el producto " + id);
		return mensaje;
	}
}
