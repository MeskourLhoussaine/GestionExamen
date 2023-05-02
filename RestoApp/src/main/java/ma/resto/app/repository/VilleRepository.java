package ma.resto.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.resto.app.entites.Ville;

public interface VilleRepository extends JpaRepository<Ville, Integer> {
	public Ville findById(int id);
}
