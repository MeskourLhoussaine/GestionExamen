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

import ma.resto.app.entites.Photo;
import ma.resto.app.service.PhotoService;

@RestController
@RequestMapping(value = "api/photos")
public class PhotoController {
	@Autowired
	private PhotoService photoService;
//dzczc
	@PostMapping(value = "/save")
	public Photo save(@RequestBody Photo o) {
		return photoService.save(o);
	}

	@PutMapping(value = "/update")
	public Photo update(@RequestBody Photo o) {
		return photoService.update(o);
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Photo ph = photoService.findById(Integer.parseInt(id));
		photoService.delete(ph);
	}

	@GetMapping(value = "/{id}")
	public Photo findById(int id) {
		return photoService.findById(id);
	}

	@GetMapping(value = "/")
	public List<Photo> findAll() {
		return photoService.findAll();
	}

}
