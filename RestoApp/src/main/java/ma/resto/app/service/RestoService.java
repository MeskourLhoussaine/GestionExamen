package ma.resto.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.resto.app.IDao.IMetier;
import ma.resto.app.entites.Resto;
import ma.resto.app.repository.RestoRepository;

@Service
public class RestoService implements IMetier<Resto> {
	@Autowired
	private RestoRepository restoRepository;

	@Override
	public Resto save(Resto o) {
		return this.restoRepository.save(o);
	}

	@Override
	public Resto update(Resto o) {
		return this.restoRepository.save(o);
	}

	@Override
	public void delete(Resto o) {
		this.restoRepository.delete(o);
	}

	@Override
	public Resto findById(int id) {
		return this.restoRepository.findById(id);
	}

	@Override
	public List<Resto> findAll() {
		return this.restoRepository.findAll();
	}

}
