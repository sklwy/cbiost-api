package br.com.edu.cbiost.service;

import br.com.edu.cbiost.model.AcervoBiologico;
import br.com.edu.cbiost.repository.AcervoBiologicoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AcervoBiologicoServiceImpl implements AcervoBiologicoService {

    private final AcervoBiologicoRepository acervoBiologicoRepository;

    public AcervoBiologicoServiceImpl(AcervoBiologicoRepository acervoBiologicoRepository) {
        this.acervoBiologicoRepository = acervoBiologicoRepository;
    }

    @Override
    public List<AcervoBiologico> findAll() {
        return acervoBiologicoRepository.findAll();
    }
}
