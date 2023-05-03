package ma.resto.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.resto.app.IDao.IMetier;
import ma.resto.app.entites.Ville;
import ma.resto.app.repository.VilleRepository;

@Service
public class VilleService implements IMetier<Ville> {
	@Autowired
	private VilleRepository villeRepository;

	@Override
	public Ville save(Ville o) {
		return this.villeRepository.save(o);
	}

	@Override
	public Ville update(Ville o) {
		return this.villeRepository.save(o);
	}

	@Override
	public void delete(int id) {
		this.villeRepository.deleteById(id);;
	}

	@Override
	public Ville findById(int id) {
		return this.villeRepository.findById(id);
	}

	@Override
	public List<Ville> findAll() {
		return this.villeRepository.findAll();
	}

	@Override
	public void delete(Ville o) {
		// TODO Auto-generated method stub
		
	}

	

}
