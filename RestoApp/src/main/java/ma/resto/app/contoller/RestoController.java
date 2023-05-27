package ma.resto.app.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;
import ma.resto.app.entites.Resto;
import ma.resto.app.service.RestoService;

@RestController
@RequestMapping(value = "api/restos")
@CrossOrigin
public class RestoController {
	@Autowired
	private RestoService restoService;

	@PostMapping(value = "/save")
	public Resto save(@RequestBody Resto o) {
		return restoService.save(o);
	}

	@PutMapping(value = "/update")
	public Resto update(@RequestBody Resto o) {
		return restoService.update(o);
	}
/*
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable String id) {
		restoService.findById(Integer.parseInt(id));
	}*/

	@GetMapping(value = "/{id}")
	public Resto findById(@PathVariable String id) {
		return restoService.findById(Integer.parseInt(id));
	}
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Resto r=restoService.findById(Integer.parseInt(id));
		restoService.delete(r);
	
}

	@GetMapping(value = "")
	public List<Resto> findAll() {
		return restoService.findAll();
	}

}
