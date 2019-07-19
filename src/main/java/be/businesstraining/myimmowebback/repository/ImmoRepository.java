package be.businesstraining.myimmowebback.repository;

import be.businesstraining.myimmowebback.domain.Immo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImmoRepository extends JpaRepository<Immo, Long> {

}
