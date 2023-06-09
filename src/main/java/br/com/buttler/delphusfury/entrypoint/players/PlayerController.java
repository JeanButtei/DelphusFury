package br.com.buttler.delphusfury.entrypoint.players;

import br.com.buttler.delphusfury.infra.entities.Player;
import br.com.buttler.delphusfury.infra.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/player")
public class PlayerController {

    @Autowired
    private PlayerRepository repository;

    @GetMapping(value = "/{id}")
    public Player findById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException());
    }

    @PostMapping
    public Player insert(@RequestBody Player player) {
        return repository.save(player);
    }
}