package ma.resto.app.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import ma.resto.app.entites.Serie;
import ma.resto.app.service.SerieService;

@RestController
@RequestMapping(value = "api/serie")
public class SerieController {
	@Autowired
	private SerieService serieService;

	@PostMapping(value = "/save")
	public Serie save(@RequestBody Serie o) {
		return serieService.save(o);
	}

	@PutMapping(value = "/update")
	public Serie update(@RequestBody Serie o) {
		return serieService.update(o);
	}

	@DeleteMapping(value = "/delete")
	public void delete(@RequestBody Serie o) {
		serieService.delete(o);
	}

	@GetMapping(value = "/{id}")
	public Serie findById(@PathVariable String id) {
		return serieService.findById(Integer.parseInt(id));
	}

	@GetMapping(value = "/")
	public List<Serie> findAll() {
		return serieService.findAll();
	}

}
