package ma.resto.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.resto.app.entites.Resto;

public interface RestoRepository extends JpaRepository<Resto, Integer> {
	public Resto findById(int id);
}
