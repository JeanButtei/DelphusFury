package br.com.buttler.delphusfury.entrypoint.players;

import br.com.buttler.delphusfury.infra.entities.PlayerEntity;
import br.com.buttler.delphusfury.infra.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/player")
public class PlayerController {

    @Autowired
    private PlayerRepository repository;

    @GetMapping(value = "/{id}")
    public PlayerEntity findById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException());
        //remover comment, apenas ajustar estrutura projeto
    }

    @PostMapping
    public PlayerEntity insert(@RequestBody PlayerEntity playerEntity) {
        return repository.save(playerEntity);
    }
}