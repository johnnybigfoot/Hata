package ua.com.hata.repository;

import ua.com.hata.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Long> {
	
}
