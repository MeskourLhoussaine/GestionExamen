package ma.resto.app.contoller;

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

import ma.resto.app.entites.Resto;
import ma.resto.app.service.RestoService;

@RestController
@RequestMapping(value = "api/restos")
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

	@DeleteMapping(value = "/delete")
	public void delete(@RequestBody Resto o) {
		restoService.delete(o);
	}

	@GetMapping(value = "/{id}")
	public Resto findById(@PathVariable String id) {
		return restoService.findById(Integer.parseInt(id));
	}

	@GetMapping(value = "/")
	public List<Resto> findAll() {
		return restoService.findAll();
	}

}
