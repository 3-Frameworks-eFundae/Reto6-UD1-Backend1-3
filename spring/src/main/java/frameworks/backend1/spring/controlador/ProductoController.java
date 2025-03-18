package frameworks.backend1.spring.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import frameworks.backend1.spring.modelo.Producto;
import frameworks.backend1.spring.servicio.ProductoService;

@RestController
public class ProductoController {

	@Autowired
	ProductoService servicio;
	
	@GetMapping("/productos")
	@ResponseBody
	public List<Producto> listarProductos(){
		return servicio.listarProductos();
	}
	
	@GetMapping("/productos/{id}")
	@ResponseBody
	public Producto buscarProductoPorId(@PathVariable Long id){
		return servicio.buscarProductoPorId(id);
	}

	@PostMapping("/productos")
	@ResponseBody
	public Producto crearProducto(@RequestBody Producto producto){
		return servicio.crearProducto(producto);
	}
	
	@PutMapping("/productos")
	@ResponseBody
	public Producto modificarProducto(@RequestBody Producto producto){
		return servicio.modificarProducto(producto);
	}
	
	@DeleteMapping("/productos/{id}")
	@ResponseBody
	public void borrarProducto(@PathVariable Long id){
		servicio.borrarPorId(id);
	}
}
