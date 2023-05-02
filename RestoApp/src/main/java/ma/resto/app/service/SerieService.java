package ma.resto.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.resto.app.IDao.IMetier;
import ma.resto.app.entites.Serie;
import ma.resto.app.repository.SerieRepository;

@Service
public class SerieService implements IMetier<Serie> {
	@Autowired
	private SerieRepository serieRepository;

	@Override
	public Serie save(Serie o) {
		return this.serieRepository.save(o);
	}

	@Override
	public Serie update(Serie o) {
		return this.serieRepository.save(o);
	}

	@Override
	public void delete(Serie o) {
		this.serieRepository.delete(o);
	}

	@Override
	public Serie findById(int id) {
		return this.serieRepository.findById(id);
	}

	@Override
	public List<Serie> findAll() {
		return this.serieRepository.findAll();
	}

}
