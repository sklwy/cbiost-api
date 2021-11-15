package br.com.edu.cbiost.controller;

import br.com.edu.cbiost.model.AcervoBiologico;
import br.com.edu.cbiost.service.AcervoBiologicoServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/acervo-biologico")
@CrossOrigin
public class AcervoBiologicoController {

    private final AcervoBiologicoServiceImpl acervoBiologicoService;

    public AcervoBiologicoController(AcervoBiologicoServiceImpl acervoBiologicoService) {
        this.acervoBiologicoService = acervoBiologicoService;
    }

    @GetMapping(path = "/tombos")
    public ResponseEntity<List<AcervoBiologico>> list() {
        return ResponseEntity.ok(acervoBiologicoService.findAll());
    }
}
