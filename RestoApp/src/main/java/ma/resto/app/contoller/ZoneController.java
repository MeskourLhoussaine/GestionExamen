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

import ma.resto.app.entites.Zone;
import ma.resto.app.service.ZoneService;

@RestController
@RequestMapping(value = "api/zones")
public class ZoneController {
	@Autowired
	private ZoneService zoneService;

	@PostMapping(value = "/save")
	public Zone save(@RequestBody Zone o) {
		return zoneService.save(o);
	}

	@PutMapping(value = "/update")
	public Zone update(@RequestBody Zone o) {
		return zoneService.update(o);
	}

	@DeleteMapping(value = "/delete")
	public void delete(@RequestBody Zone o) {
		zoneService.delete(o);
	}

	@GetMapping(value = "/{id}")
	public Zone findById(@PathVariable String id) {
		return zoneService.findById(Integer.parseInt(id));
	}

	@GetMapping(value = "/")
	public List<Zone> findAll() {
		return zoneService.findAll();
	}

}
