package ma.resto.app.contoller;
//prime react
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import ma.resto.app.entites.Resto;
import ma.resto.app.entites.Ville;
import ma.resto.app.entites.Zone;
import ma.resto.app.service.VilleService;

@RestController
@RequestMapping(value = "api/villes")
public class VilleController {
	@Autowired
	private VilleService villeService;

	@PostMapping(value = "/")
	public Ville save(@RequestBody Ville o) {
		return villeService.save(o);
	}

	
	@PostMapping(value = "/save")
	public Ville update(@RequestBody Ville o) {
		return villeService.save(o);
	}
	

	  @PutMapping("/{id}")
	    public Ville update(@PathVariable int id, @RequestBody Ville ville) {
	        Ville existingVille = villeService.findById(id);
	        if (existingVille != null) {
	            existingVille.setNom(ville.getNom());
	            return villeService.update(existingVille);
	        }
	        return null;
	    }

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable int id) {
		villeService.findById(id);
	}

	@GetMapping(value = "/{id}")
	public Ville findById(@PathVariable String id) {
		return villeService.findById(Integer.parseInt(id));
	}

	@GetMapping(value = " ")
	public List<Ville> findAll() {
		return villeService.findAll();
	}

	@GetMapping(value = "/{villeNom}/zones")
	public List<Zone> findZoneByVille(@PathVariable String villeNom) {
		List<Zone> zones = null;
		for (Ville ville : this.findAll()) {
			if (ville.getNom().equals(villeNom)) {
				zones = ville.getZones();
				break;
			}
		}
		return zones;
	}

	@GetMapping(value = "/{villeNom}/zones/{zoneNom}/restaurants")
	public List<Resto> findRestoByZone(@PathVariable String villeNom, @PathVariable String zoneNom) {
		List<Resto> restos = null;
		for (Zone zone : this.findZoneByVille(villeNom)) {
			if (zone.getNom().equals(zoneNom)) {
				restos = zone.getRestos();
			}
		}
		return restos;
	}

	@GetMapping(value = "/{villeNom}/zones/{zoneNom}/restaurants/specialite")
	public List<Resto> findRestoBySpecialite(@PathVariable String villeNom, @PathVariable String zoneNom,
			@RequestParam(name = "specialite") String specialite) {
		return null;
	}

	@GetMapping(value = "/{villeNom}/zones/{zoneNom}/restaurants/serie")
	public List<Resto> findRestoBySerie(@PathVariable String villeNom, @PathVariable String zoneNom,
			@RequestParam(name = "chaine") String chaine) {
		return null;
	}

	@GetMapping(value = "/{villeNom}/zones/{zoneNom}/restaurants/{id}")
	public Resto findRestoById(@PathVariable String villeNom, @PathVariable String zoneNom, @PathVariable String id) {
		List<Resto> restos = null;
		for (Zone zone : this.findZoneByVille(villeNom)) {
			if (zone.getNom().equals(zoneNom)) {
				restos = zone.getRestos();
				for (Resto re : restos) {
					if (re.getId() == Integer.parseInt(id)) {
						return re;
					}
				}
			}
		}
		return null;
	}
	
	@GetMapping(value = "/{villeNom}/zones/{zoneNom}/restaurants/{id}/itineraire")
	public Resto findRestoByItineraire(@PathVariable String villeNom, @PathVariable String zoneNom, @RequestParam(name = "depart") String depart) {
		return null;
	}
}
