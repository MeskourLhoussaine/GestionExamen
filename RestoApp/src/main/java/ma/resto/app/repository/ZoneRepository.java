package ma.resto.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.resto.app.entites.Zone;

public interface ZoneRepository extends JpaRepository<Zone, Integer> {
	public Zone findById(int id);
}
