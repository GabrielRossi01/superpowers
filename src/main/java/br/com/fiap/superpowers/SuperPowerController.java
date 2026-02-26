package br.com.fiap.superpowers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("superpowers")
@CrossOrigin(origins = "http://localhost:4200")
public class SuperPowerController {

    @Autowired
    private SuperPowerRepository superPowerRepository;

    @GetMapping
    public ResponseEntity<List<SuperPower>> listarTodos() {
        List<SuperPower> powers = superPowerRepository.findAll();

        return ResponseEntity.ok(powers);
    }
}
