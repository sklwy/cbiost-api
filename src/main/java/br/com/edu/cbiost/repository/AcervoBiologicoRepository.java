package br.com.edu.cbiost.repository;

import br.com.edu.cbiost.model.AcervoBiologico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcervoBiologicoRepository extends JpaRepository<AcervoBiologico, Long> {
}
