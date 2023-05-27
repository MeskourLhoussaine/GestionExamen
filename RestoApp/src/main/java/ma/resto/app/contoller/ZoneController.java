package ma.resto.app.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.bind.annotation.RequestBody;


import ma.resto.app.entites.Zone;
import ma.resto.app.service.ZoneService;

@RestController
@RequestMapping(value = "api/zones")
@CrossOrigin
public class ZoneController {
	@Autowired
	private ZoneService zoneService;
	/*
	 * @PostMapping(value = "/save") public Zone save(@RequestBody Zone o) { return
	 * zoneService.save(o); }*
	 */
	
	
	@PostMapping("/save")
	public Zone save(@RequestBody Zone zone) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(zone);
		System.out.println(json);
		return this.zoneService.save(zone);
	}
	
	

	@PutMapping("/{id}")
	public Zone update(@PathVariable int id, @RequestBody Zone zone) {
		Zone existingZone = zoneService.findById(id);
		if (existingZone != null) {
			existingZone.setNom(zone.getNom());
			return zoneService.update(existingZone);
		}
		return null;
	}

	/*
	 * @PutMapping(value = "/update") public Zone update(@RequestBody Zone o) {
	 * return zoneService.update(o); }
	 */
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable int id) {
		this.zoneService.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Zone s = zoneService.findById(Integer.parseInt(id));
		zoneService.delete(s);
	}



	@GetMapping(value = "/{id}")
	public Zone findById(@PathVariable String id) {
		return zoneService.findById(Integer.parseInt(id));
	}

	@GetMapping(value = "")
	public List<Zone> findAll() {
		return zoneService.findAll();
	}

	@GetMapping("/ville/{villeId}")
	public List<Zone> getZonesByVilleId(@PathVariable Long villeId) {
		return zoneService.getZonesByVilleId(villeId);
	}
}
